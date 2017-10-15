package com.pspdfkit.vangogh.rx;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Represents disposable resource for animations.
 */
public final class AnimationDisposable implements Disposable {

    /** Tracks whether this disposable has been disposed or not. */
    @NonNull private final AtomicBoolean isDisposed = new AtomicBoolean();

    /** Provided listener through which {@link AnimationDisposable} can notify that it has been disposed. */
    @NonNull private final OnAnimationDisposedListener onAnimationDisposedListener;

    /**
     * Creates disposable that can notify the listener when disposed.
     * @param onAnimationDisposedListener Listener being notified when this disposable is disposed.
     */
    public AnimationDisposable(OnAnimationDisposedListener onAnimationDisposedListener) {
        this.onAnimationDisposedListener = onAnimationDisposedListener;
    }

    /** {@inheritDoc} */
    @Override
    public void dispose() {
        if (isDisposed.compareAndSet(false, true)) {
            if (onAnimationDisposedListener != null) {
                onAnimationDisposedListener.onAnimationDisposed();
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public boolean isDisposed() {
        return isDisposed.get();
    }

}
