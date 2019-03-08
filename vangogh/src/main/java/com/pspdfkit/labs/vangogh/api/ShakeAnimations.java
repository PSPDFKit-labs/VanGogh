package com.pspdfkit.labs.vangogh.api;

import androidx.annotation.NonNull;
import android.view.View;
import android.view.animation.CycleInterpolator;

import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import io.reactivex.Completable;

/**
 * Class containing convenient animations for "shaking" the views.
 */
public final class ShakeAnimations {

    /** Amount of 'shakes' applied to the view inside one second (by default). */
    private static final float SHAKES_PER_SECOND_DEFAULT = 10f;

    /** Amount of 'shakes' applied to the view inside one second (slow). */
    private static final float SHAKES_PER_SECOND_SLOW = 4f;

    /** Amount of 'shakes' applied to the view inside one second (quick). */
    private static final float SHAKES_PER_SECOND_QUICK = 20f;

    /**
     * Shakes the given view.
     * @param view View on which to apply the animation.
     * @return     Completable executing animation once subscribed to.
     */
    public static Completable shake(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT);
    }

    /**
     * Shakes the given view.
     * @param view       View on which to apply the animation.
     * @param durationMs Duration of the animation in milliseconds.
     * @return           Completable executing animation once subscribed to.
     */
    public static Completable shake(@NonNull View view, long durationMs) {
        return shake(view, durationMs, SHAKES_PER_SECOND_DEFAULT);
    }

    /**
     * Shakes the given view.
     * @param view            View on which to apply the animation.
     * @param durationMs      Duration of the animation in milliseconds.
     * @param shakesPerSecond Number of shakes per second, defaults to {@value #SHAKES_PER_SECOND_DEFAULT}.
     * @return                Completable executing animation once subscribed to.
     */
    public static Completable shake(@NonNull View view, long durationMs, float shakesPerSecond) {
        final float numberOfCycles = durationMs * (shakesPerSecond / 1000);
        final CycleInterpolator interpolator = new CycleInterpolator(numberOfCycles / 2);
        final AnimationCompletable shakeFirst = AnimationBuilder.forView(view)
                .translationXBy(10f)
                .interpolator(interpolator)
                .duration(durationMs / 2)
                .buildCompletable();
        final AnimationCompletable shakeSecond = AnimationBuilder.forView(view)
                .translationXBy(-10f)
                .interpolator(interpolator)
                .duration(durationMs / 2)
                .buildCompletable();
        return shakeFirst.andThen(shakeSecond);
    }

    /**
     * Shakes the given view quickly.
     * @param view View on which to apply the animation.
     * @return     Completable executing animation once subscribed to.
     */
    public static Completable shakeQuickly(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT, SHAKES_PER_SECOND_QUICK);
    }

    /**
     * Shakes the given view quickly.
     * @param view       View on which to apply the animation.
     * @param durationMs Duration of the animation in milliseconds.
     * @return           Completable executing animation once subscribed to.
     */
    public static Completable shakeQuickly(@NonNull View view, long durationMs) {
        return shake(view, durationMs, SHAKES_PER_SECOND_QUICK);
    }

    /**
     * Shakes the given view slowly.
     * @param view View on which to apply the animation.
     * @return     Completable executing animation once subscribed to.
     */
    public static Completable shakeSlowly(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT, SHAKES_PER_SECOND_SLOW);
    }

    /**
     * Shakes the given view slowly.
     * @param view       View on which to apply the animation.
     * @param durationMs Duration of the animation in milliseconds.
     * @return           Completable executing animation once subscribed to.
     */
    public static Completable shakeSlowly(@NonNull View view, long durationMs) {
        return shake(view, durationMs, SHAKES_PER_SECOND_SLOW);
    }

}
