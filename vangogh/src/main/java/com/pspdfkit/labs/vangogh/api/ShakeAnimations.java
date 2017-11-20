package com.pspdfkit.labs.vangogh.api;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.view.animation.Interpolator;

import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import io.reactivex.Completable;

/**
 * Class containing convenient animations for "shaking" the views.
 */
public final class ShakeAnimations {

    private static final float CYCLES_PER_SECOND_DEFAULT = 10f;

    private static final float CYCLES_PER_SECOND_SLOW = 4f;

    private static final float CYCLES_PER_SECOND_QUICK = 20f;

    public static Completable shake(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT);
    }

    public static Completable shake(@NonNull View view, long durationMs) {
        return shake(view, durationMs, CYCLES_PER_SECOND_DEFAULT);
    }

    public static Completable shake(@NonNull View view, long durationMs, float cyclesPerSecond) {
        final float numberOfCycles = durationMs * (cyclesPerSecond / 1000);
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

    public static Completable shakeQuickly(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT, CYCLES_PER_SECOND_QUICK);
    }

    public static Completable shakeQuickly(@NonNull View view, long durationMs) {
        return shake(view, durationMs, CYCLES_PER_SECOND_QUICK);
    }

    public static Completable shakeSlowly(@NonNull View view) {
        return shake(view, AnimationConstants.DURATION_DEFAULT, CYCLES_PER_SECOND_SLOW);
    }

    public static Completable shakeSlowly(@NonNull View view, long durationMs) {
        return shake(view, durationMs, CYCLES_PER_SECOND_SLOW);
    }

}
