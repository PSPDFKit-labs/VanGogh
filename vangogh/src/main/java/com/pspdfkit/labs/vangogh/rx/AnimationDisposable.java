package com.pspdfkit.labs.vangogh.rx;

import androidx.annotation.NonNull;

import io.reactivex.android.MainThreadDisposable;

/**
 * Represents disposable resource for animations.
 */
public final class AnimationDisposable extends MainThreadDisposable {

    /** Provided listener through which {@link AnimationDisposable} can notify that it has been disposed. */
    @NonNull private final OnAnimationDisposedListener onAnimationDisposedListener;

    /**
     * Creates disposable that can notify the listener when disposed.
     * @param onAnimationDisposedListener Listener being notified when this disposable is disposed.
     */
    public AnimationDisposable(@NonNull OnAnimationDisposedListener onAnimationDisposedListener) {
        this.onAnimationDisposedListener = onAnimationDisposedListener;
    }

    @Override
    protected void onDispose() {
        onAnimationDisposedListener.onAnimationDisposed();
    }

}
