package com.pspdfkit.labs.vangogh.rx;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import com.pspdfkit.labs.vangogh.base.Animation;
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

    /** Action to perform before the animation starts. */
    @Nullable private Consumer<View> doOnAnimationReady;

    /** Action to perform when the animation starts. */
    @Nullable private Consumer<View> doOnAnimationStart;

    /** Action to perform when the animation gets canceled before it ends. */
    @Nullable private Consumer<View> doOnAnimationCancel;

    /** Action to perform when the animation ends without interruption. */
    @Nullable private Consumer<View> doOnAnimationEnd;

    /** Animator for the current running animation. */
    @Nullable private ViewPropertyAnimatorCompat animator;

    /**
     * Creates completable that runs provided animation once subscribed to.
     * @param animation Animation to run when subscribed.
     */
    public AnimationCompletable(Animation animation) {
        this.animation = animation;
    }

    /**
     * Sets the action to perform once the animation is ready to start.
     * @param doOnAnimationReady Action to perform before the animation is ready to be started.
     * @return An instance of this completable with this action added.
     */
    public AnimationCompletable doOnAnimationReady(Consumer<View> doOnAnimationReady) {
        this.doOnAnimationReady = doOnAnimationReady;
        return this;
    }

    /**
     * Sets the action to perform once the animation starts.
     * @param onAnimationStart Action to perform once animation starts.
     * @return An instance of this completable with this action added.
     */
    public AnimationCompletable doOnAnimationStart(Consumer<View> onAnimationStart) {
        this.doOnAnimationStart = onAnimationStart;
        return this;
    }

    /**
     * Sets the action to perform once the animation is canceled (doesn't end by itself but it interrupted).
     * @param onAnimationCancel Action to perform once animation is canceled.
     * @return An instance of this completable with this action added.
     */
    public AnimationCompletable doOnAnimationCancel(Consumer<View> onAnimationCancel) {
        this.doOnAnimationCancel = onAnimationCancel;
        return this;
    }

    /**
     * Sets the action to perform once the animation ends (is not interrupted).
     * @param onAnimationEnd Action to perform once animation is canceled.
     * @return An instance of this completable with this action added.
     */
    public AnimationCompletable doOnAnimationEnd(Consumer<View> onAnimationEnd) {
        this.doOnAnimationEnd = onAnimationEnd;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public void onAnimationDisposed() {
        if (animator != null) {
            animator.cancel();
            animator.setListener(null);
            animator = null;
        }
    }

    /** {@inheritDoc} */
    @Override
    protected void subscribeActual(final CompletableObserver observer) {
        View view = animation.getView().get();
        if (doOnAnimationReady != null && view != null) {
            try {
                doOnAnimationReady.accept(view);
            } catch (Exception e) {
                observer.onError(e);
            }
        }

        try {
            animator = startAnimation(animation);
        } catch (Exception e) {
            observer.onError(e);
        }

        animator.setListener(new ViewPropertyAnimatorListener() {
            @Override
            public void onAnimationStart(View view) {
                if (doOnAnimationStart != null) {
                    try {
                        doOnAnimationStart.accept(view);
                    } catch (Exception e) {
                        observer.onError(e);
                    }
                }
            }

            @Override
            public void onAnimationEnd(View view) {
                if (doOnAnimationEnd != null) {
                    try {
                        doOnAnimationEnd.accept(view);
                    } catch (Exception e) {
                        observer.onError(e);
                    }
                }

                animator.setListener(null);
                animator = null;
                observer.onComplete();
            }

            @Override
            public void onAnimationCancel(View view) {
                if (doOnAnimationCancel != null) {
                    try {
                        doOnAnimationCancel.accept(view);
                    } catch (Exception e) {
                        observer.onError(e);
                    }
                }

                animator.setListener(null);
                animator = null;
                observer.onComplete();
            }
        });

        observer.onSubscribe(new AnimationDisposable(this));
    }

    /**
     * Starts the defined view animation.
     * @return Animator for the started animation.
     */
    @NonNull
    private ViewPropertyAnimatorCompat startAnimation(@NonNull Animation animation) throws Exception {
        View view = animation.getView().get();
        if (view == null) {
            throw new Exception("Reference to a view scheduled" +
                    "for animation no longer exists.");
        }

        ViewPropertyAnimatorCompat animator = ViewCompat.animate(view);
        if (animation.getAlpha() != null) animator.alpha(animation.getAlpha());
        if (animation.getAlphaBy() != null) animator.alphaBy(animation.getAlphaBy());
        if (animation.getRotation() != null) animator.rotation(animation.getRotation());
        if (animation.getRotationBy() != null) animator.rotationBy(animation.getRotationBy());
        if (animation.getRotationX() != null) animator.rotationX(animation.getRotationX());
        if (animation.getRotationXBy() != null) animator.rotationXBy(animation.getRotationXBy());
        if (animation.getRotationY() != null) animator.rotationY(animation.getRotationY());
        if (animation.getRotationYBy() != null) animator.rotationYBy(animation.getRotationYBy());
        if (animation.getScaleX() != null) animator.scaleX(animation.getScaleX());
        if (animation.getScaleXBy() != null) animator.scaleXBy(animation.getScaleXBy() );
        if (animation.getScaleY() != null) animator.scaleY(animation.getScaleY());
        if (animation.getScaleYBy() != null) animator.scaleYBy(animation.getScaleYBy());
        if (animation.getDuration() != null) animator.setDuration(animation.getDuration());
        if (animation.getInterpolator() != null) animator.setInterpolator(animation.getInterpolator());
        if (animation.getStartDelay() != null) animator.setStartDelay(animation.getStartDelay());
        if (animation.getTranslationX() != null) animator.translationX(animation.getTranslationX());
        if (animation.getTranslationXBy() != null) animator.translationXBy(animation.getTranslationXBy());
        if (animation.getTranslationY() != null) animator.translationY(animation.getTranslationY());
        if (animation.getTranslationYBy() != null) animator.translationYBy(animation.getTranslationYBy());
        if (animation.getTranslationZ() != null) animator.translationZ(animation.getTranslationZ());
        if (animation.getTranslationZBy() != null) animator.translationZBy(animation.getTranslationZBy());
        if (animation.getX() != null) animator.x(animation.getX());
        if (animation.getXBy() != null) animator.xBy(animation.getXBy());
        if (animation.getY() != null) animator.y(animation.getY());
        if (animation.getYBy() != null) animator.yBy(animation.getYBy());
        if (animation.getZ() != null) animator.z(animation.getZ());
        if (animation.getZBy() != null) animator.zBy(animation.getZBy());
        return animator;
    }

}
