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

    /**
     * Number of spin cycles per animation by default.
     */
    private static final int SPIN_CYCLES_PER_ANIM_DEFAULT = 2;

    /**
     * Number of spin cycles per animation (quickly).
     */
    private static final int SPIN_CYCLES_PER_ANIM_QUICK = 4;

    /**
     * Number of spin cycles per animation (slowly).
     */
    private static final int SPIN_CYCLES_PER_ANIM_SLOW = 1;

    /**
     * Spins the given view to the right.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinRight(@NonNull View view) {
        return spinRight(view, SPIN_CYCLES_PER_ANIM_DEFAULT);
    }

    /**
     * Spins the given view to the right.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinRight(@NonNull View view, int numberOfCycles) {
        return spinRight(view, numberOfCycles, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the right.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param durationMs     Duration of the animation in milliseconds.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinRight(@NonNull View view, int numberOfCycles, long durationMs) {
        return spinRight(view, numberOfCycles, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the right.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param interpolator   Interpolator to use for the animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinRight(@NonNull View view, int numberOfCycles, Interpolator interpolator) {
        return spinRight(view, numberOfCycles, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Spins the given view to the right.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param durationMs     Duration of the animation in milliseconds.
     * @param interpolator   Interpolator to use for the animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinRight(@NonNull View view, int numberOfCycles, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view)
                .rotationBy(numberOfCycles * 360f)
                .duration(durationMs)
                .interpolator(interpolator)
                .buildCompletable();
    }

    /**
     * Spins the given view to the right quickly.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinRightQuickly(@NonNull View view) {
        return spinRightQuickly(view, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the right quickly.
     * @param view         A view to animate.
     * @param interpolator Interpolator to use for the animation.
     * @return             Completable which starts animation once subscribed to.
     */
    public static Completable spinRightQuickly(@NonNull View view, Interpolator interpolator) {
        return spinRight(view, SPIN_CYCLES_PER_ANIM_QUICK, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Spins the given view to the right slowly.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinRightSlowly(@NonNull View view) {
        return spinRightSlowly(view, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the right slowly.
     * @param view         A view to animate.
     * @param interpolator Interpolator to use for the animation.
     * @return             Completable which starts animation once subscribed to.
     */
    public static Completable spinRightSlowly(@NonNull View view, Interpolator interpolator) {
        return spinRight(view, SPIN_CYCLES_PER_ANIM_SLOW, AnimationConstants.DURATION_SLOW, interpolator);
    }

    /**
     * Spins the given view to the left.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinLeft(@NonNull View view) {
        return spinLeft(view, SPIN_CYCLES_PER_ANIM_DEFAULT);
    }

    /**
     * Spins the given view to the left.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinLeft(@NonNull View view, int numberOfCycles) {
        return spinLeft(view, numberOfCycles, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the left.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param durationMs     Duration of the animation in milliseconds.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinLeft(@NonNull View view, int numberOfCycles, long durationMs) {
        return spinLeft(view, numberOfCycles, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the left.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param interpolator   Interpolator to use for the animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinLeft(@NonNull View view, int numberOfCycles, Interpolator interpolator) {
        return spinLeft(view, numberOfCycles, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Spins the given view to the left.
     * @param view           A view to animate.
     * @param numberOfCycles Number of spinning cycles to be executed in this animation.
     * @param durationMs     Duration of the animation in milliseconds.
     * @param interpolator   Interpolator to use for the animation.
     * @return               Completable which starts animation once subscribed to.
     */
    public static Completable spinLeft(@NonNull View view, int numberOfCycles, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view)
                .rotationBy(-numberOfCycles * 360f)
                .duration(durationMs)
                .interpolator(interpolator)
                .buildCompletable();
    }

    /**
     * Spins the given view to the left quickly.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinLeftQuickly(@NonNull View view) {
        return spinLeftQuickly(view, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the left quickly.
     * @param view         A view to animate.
     * @param interpolator Interpolator to use for the animation.
     * @return             Completable which starts animation once subscribed to.
     */
    public static Completable spinLeftQuickly(@NonNull View view, Interpolator interpolator) {
        return spinLeft(view, SPIN_CYCLES_PER_ANIM_QUICK, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Spins the given view to the left slowly.
     * @param view A view to animate.
     * @return     Completable which starts animation once subscribed to.
     */
    public static Completable spinLeftSlowly(@NonNull View view) {
        return spinLeftSlowly(view, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Spins the given view to the left slowly.
     * @param view         A view to animate.
     * @param interpolator Interpolator to use for the animation.
     * @return             Completable which starts animation once subscribed to.
     */
    public static Completable spinLeftSlowly(@NonNull View view, Interpolator interpolator) {
        return spinLeft(view, SPIN_CYCLES_PER_ANIM_SLOW, AnimationConstants.DURATION_SLOW, interpolator);
    }

}
