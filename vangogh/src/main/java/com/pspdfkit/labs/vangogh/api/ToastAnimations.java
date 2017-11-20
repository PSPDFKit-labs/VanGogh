package com.pspdfkit.labs.vangogh.api;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.Interpolator;

import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;

/**
 * Holds methods to animate view to display as toast, coming from invisible to visible.
 */
public final class ToastAnimations {

    /**
     * Default duration of fades when displaying view as a toast (in milliseconds).
     */
    static final long FADE_DURATION = 1000L;

    /**
     * Default toast view display duration.
     */
    static final long VIEW_SHOW_DURATION_DEFAULT = 2000L;

    /**
     * Quick toast view display duration.
     */
    static final long VIEW_SHOW_DURATION_QUICK = 1000L;

    /**
     * Slow toast view display duration.
     */
    static final long VIEW_SHOW_DURATION_SLOW = 500L;

    /**
     * Shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view View to animate.
     * @return     Completable starting the animation once subscribed to.
     */
    public static Completable showAsToast(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view       View to animate.
     * @param durationMs Duration of the view being displayed.
     * @return           Completable starting the animation once subscribed to.
     */
    public static Completable showAsToast(@NonNull View view, long durationMs) {
        return showAsToast(view, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view         View to animate.
     * @param interpolator Interpolator used for fade animations.
     * @return             Completable starting the animation once subscribed to.
     */
    public static Completable showAsToast(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_DEFAULT, interpolator);
    }

    /**
     * Shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view         View to animate.
     * @param durationMs   Duration of the view being displayed.
     * @param interpolator Interpolator used for fade animations.
     * @return             Completable starting the animation once subscribed to.
     */
    public static Completable showAsToast(@NonNull View view, long durationMs, Interpolator interpolator) {
        final AnimationCompletable fadeIn = AnimationBuilder.forView(view)
                .alpha(1f)
                .duration(FADE_DURATION)
                .interpolator(interpolator)
                .buildCompletable();
        final AnimationCompletable fadeOut = AnimationBuilder.forView(view)
                .alpha(0f)
                .duration(FADE_DURATION)
                .interpolator(interpolator)
                .buildCompletable();
        return fadeIn.andThen(Completable.timer(durationMs, TimeUnit.MILLISECONDS)).andThen(fadeOut);
    }

    /**
     * Quickly shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view View to animate.
     * @return     Completable starting the animation once subscribed to.
     */
    public static Completable showAsToastQuickly(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_QUICK);
    }

    /**
     * Quickly shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view         View to animate.
     * @param interpolator Interpolator used for fade animations.
     * @return             Completable starting the animation once subscribed to.
     */
    public static Completable showAsToastQuickly(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_QUICK, interpolator);
    }

    /**
     * Slowly shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view View to animate.
     * @return     Completable starting the animation once subscribed to.
     */
    public static Completable showAsToastSlowly(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_SLOW);
    }

    /**
     * Slowly shows given view as a toast, meaning fading it in, keeping for some time on the screen
     * and then fading it out.
     * <p>
     * Note: You have to set your view to opacity = 0f and to visible if previously invisible.
     * The animation does not set any actions prior to animation.
     * @param view         View to animate.
     * @param interpolator Interpolator used for fade animations.
     * @return             Completable starting the animation once subscribed to.
     */
    public static Completable showAsToastSlowly(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_SLOW, interpolator);
    }

}
