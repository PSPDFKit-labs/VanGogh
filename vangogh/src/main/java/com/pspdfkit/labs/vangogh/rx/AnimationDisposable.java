package com.pspdfkit.labs.vangogh.rx;

import io.reactivex.android.MainThreadDisposable;
import io.reactivex.annotations.NonNull;

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
    public AnimationDisposable(OnAnimationDisposedListener onAnimationDisposedListener) {
        this.onAnimationDisposedListener = onAnimationDisposedListener;
    }

    @Override
    protected void onDispose() {
        if (onAnimationDisposedListener != null) {
            onAnimationDisposedListener.onAnimationDisposed();
        }
    }

}
