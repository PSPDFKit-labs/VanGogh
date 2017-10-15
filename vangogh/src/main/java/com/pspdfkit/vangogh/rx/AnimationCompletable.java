package com.pspdfkit.vangogh.rx;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.pspdfkit.vangogh.base.Animation;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;

/**
 * Completable that runs specified animation once subscribed. The animation parameters used will be those specified
 * once the animation was passed to the constructor. If you change them between passing it to the constructor and
 * subscribing to this completable, those changes will be ignored.
 */
public final class AnimationCompletable extends Completable implements OnAnimationDisposedListener {

    /** Animation to run once subscribed to this completable. */
    @NonNull private final Animation animation;

    /** Action to perform when animation starts. */
    @Nullable private Consumer<View> doOnAnimationStart;

    /** Action to perform when animation gets canceled before it ends. */
    @Nullable private Consumer<View> doOnAnimationCancel;

    /** Action to perform when animation ends without interruption. */
    @Nullable private Consumer<View> doOnAnimationEnd;

    /** Animator for the current running animation. */
    @Nullable private ViewPropertyAnimator animator;

    /**
     * Creates completable that runs provided animation once subscribed to.
     * @param animation Animation to run when subscribed.
     */
    public AnimationCompletable(Animation animation) {
        this.animation = animation;
    }

    /** {@inheritDoc} */
    @Override
    public void onAnimationDisposed() {

    }

    /** {@inheritDoc} */
    @Override
    protected void subscribeActual(CompletableObserver s) {

    }

}
