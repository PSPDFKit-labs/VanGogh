package com.pspdfkit.labs.vangogh.api;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.Interpolator;

import com.pspdfkit.labs.vangogh.base.AnimationBuilder;

import io.reactivex.Completable;

/**
 * Holds animations to animate views in a spinning manner, meaning constant rotations.
 */
public final class SpinAnimations {

    private static final int SPIN_CYCLES_PER_SECOND_DEFAULT = 2;

    private static final int SPIN_CYCLES_PER_SECOND_QUICK = 4;

    private static final int SPIN_CYCLES_PER_SECOND_SLOW = 1;

    public static Completable spinRight(@NonNull View view) {
        return spinRight(view, SPIN_CYCLES_PER_SECOND_DEFAULT);
    }

    public static Completable spinRight(@NonNull View view, int numberOfCycles) {
        return spinRight(view, numberOfCycles, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinRight(@NonNull View view, int numberOfCycles, long durationMs) {
        return spinRight(view, numberOfCycles, durationMs, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinRight(@NonNull View view, int numberOfCycles, Interpolator interpolator) {
        return spinRight(view, numberOfCycles, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    public static Completable spinRight(@NonNull View view, int numberOfCycles, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view)
                .rotationBy(numberOfCycles * 360f)
                .duration(durationMs)
                .interpolator(interpolator)
                .buildCompletable();
    }

    public static Completable spinRightQuickly(@NonNull View view) {
        return spinRightQuickly(view, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinRightQuickly(@NonNull View view, Interpolator interpolator) {
        return spinRight(view, SPIN_CYCLES_PER_SECOND_QUICK, AnimationConstants.DURATION_QUICK, interpolator);
    }

    public static Completable spinRightSlowly(@NonNull View view) {
        return spinRightSlowly(view, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinRightSlowly(@NonNull View view, Interpolator interpolator) {
        return spinRight(view, SPIN_CYCLES_PER_SECOND_SLOW, AnimationConstants.DURATION_SLOW, interpolator);
    }

    public static Completable spinLeft(@NonNull View view) {
        return spinLeft(view, SPIN_CYCLES_PER_SECOND_DEFAULT);
    }

    public static Completable spinLeft(@NonNull View view, int numberOfCycles) {
        return spinLeft(view, numberOfCycles, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinLeft(@NonNull View view, int numberOfCycles, long durationMs) {
        return spinLeft(view, numberOfCycles, durationMs, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinLeft(@NonNull View view, int numberOfCycles, Interpolator interpolator) {
        return spinLeft(view, numberOfCycles, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    public static Completable spinLeft(@NonNull View view, int numberOfCycles, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view)
                .rotationBy(-numberOfCycles * 360f)
                .duration(durationMs)
                .interpolator(interpolator)
                .buildCompletable();
    }

    public static Completable spinLeftQuickly(@NonNull View view) {
        return spinLeftQuickly(view, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinLeftQuickly(@NonNull View view, Interpolator interpolator) {
        return spinLeft(view, SPIN_CYCLES_PER_SECOND_QUICK, AnimationConstants.DURATION_QUICK, interpolator);
    }

    public static Completable spinLeftSlowly(@NonNull View view) {
        return spinLeftSlowly(view, AnimationConstants.INTERPOLATOR);
    }

    public static Completable spinLeftSlowly(@NonNull View view, Interpolator interpolator) {
        return spinLeft(view, SPIN_CYCLES_PER_SECOND_SLOW, AnimationConstants.DURATION_SLOW, interpolator);
    }

}
