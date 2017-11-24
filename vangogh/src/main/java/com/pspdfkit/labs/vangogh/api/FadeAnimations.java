package com.pspdfkit.labs.vangogh.api;

import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;
import io.reactivex.annotations.NonNull;

import static com.pspdfkit.labs.vangogh.api.AnimationConstants.ALPHA_INVISIBLE;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.ALPHA_VISIBLE;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_DEFAULT;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_QUICK;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_SLOW;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.INTERPOLATOR;

/**
 * Class containing convenient fade animations.
 */
public final class FadeAnimations {

    /**
     * Fades in the given view.
     * @param view View to fade in.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeIn(@NonNull View view) {
        return fadeToAlpha(view, ALPHA_VISIBLE);
    }

    /**
     * Fades in the given view.
     * @param view       View to fade in.
     * @param durationMs Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeIn(@NonNull View view, long durationMs) {
        return fadeToAlpha(view, ALPHA_VISIBLE, durationMs);
    }

    /**
     * Fades in the given view.
     * @param view         View to fade in.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeIn(@NonNull View view, Interpolator interpolator) {
        return fadeToAlpha(view, ALPHA_VISIBLE, interpolator);
    }

    /**
     * Fades in the given view.
     * @param view         View to fade in.
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeIn(@NonNull View view, long durationMs, Interpolator interpolator) {
        return fadeToAlpha(view, ALPHA_VISIBLE, durationMs, interpolator);
    }

    /**
     * Fades in the given view quickly.
     * @param view View to fade in.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeInQuickly(@NonNull View view) {
        return fadeIn(view, DURATION_QUICK);
    }

    /**
     * Fades in the given view quickly.
     * @param view         View to fade in.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeInQuickly(@NonNull View view, Interpolator interpolator) {
        return fadeIn(view, DURATION_QUICK, interpolator);
    }

    /**
     * Fades in the given view slowly.
     * @param view View to fade in.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeInSlowly(@NonNull View view) {
        return fadeIn(view, DURATION_SLOW);
    }

    /**
     * Fades in the given view slowly.
     * @param view         View to fade in.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeInSlowly(@NonNull View view, Interpolator interpolator) {
        return fadeIn(view, DURATION_SLOW, interpolator);
    }

    /**
     * Fades out the given view.
     * @param view View to fade out.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOut(@NonNull View view) {
        return fadeToAlpha(view, ALPHA_INVISIBLE);
    }

    /**
     * Fades out the given view.
     * @param view       View to fade out.
     * @param durationMs Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOut(@NonNull View view, long durationMs) {
        return fadeToAlpha(view, ALPHA_INVISIBLE, durationMs);
    }

    /**
     * Fades out the given view.
     * @param view         View to fade out.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOut(@NonNull View view, Interpolator interpolator) {
        return fadeToAlpha(view, ALPHA_INVISIBLE, interpolator);
    }

    /**
     * Fades out the given view.
     * @param view         View to fade out.
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOut(@NonNull View view, long durationMs, Interpolator interpolator) {
        return fadeToAlpha(view, ALPHA_INVISIBLE, durationMs, interpolator);
    }

    /**
     * Fades out the given view quickly.
     * @param view View to fade out.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOutQuickly(@NonNull View view) {
        return fadeOut(view, DURATION_QUICK);
    }

    /**
     * Fades out the given view quickly.
     * @param view         View to fade out.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOutQuickly(@NonNull View view, Interpolator interpolator) {
        return fadeOut(view, DURATION_QUICK, interpolator);
    }

    /**
     * Fades out the given view slowly.
     * @param view View to fade out.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOutSlowly(@NonNull View view) {
        return fadeOut(view, DURATION_SLOW);
    }

    /**
     * Fades out the given view slowly.
     * @param view         View to fade out.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeOutSlowly(@NonNull View view, Interpolator interpolator) {
        return fadeOut(view, DURATION_SLOW, interpolator);
    }

    /**
     * Fades view to the specified alpha value.
     * @param view         View to animate.
     * @param targetAlpha  Target alpha for the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeToAlpha(@NonNull View view, float targetAlpha) {
        return fadeToAlpha(view, targetAlpha, DURATION_DEFAULT, INTERPOLATOR);
    }

    /**
     * Fades view to the specified alpha value.
     * @param view         View to animate.
     * @param targetAlpha  Target alpha for the animation.
     * @param durationMs   Duration of the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeToAlpha(@NonNull View view, float targetAlpha, long durationMs) {
        return fadeToAlpha(view, targetAlpha, durationMs, INTERPOLATOR);
    }

    /**
     * Fades view to the specified alpha value.
     * @param view         View to animate.
     * @param targetAlpha  Target alpha for the animation.
     * @param interpolator Interpolator used for the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeToAlpha(@NonNull View view, float targetAlpha, Interpolator interpolator) {
        return fadeToAlpha(view, targetAlpha, DURATION_DEFAULT, interpolator);
    }

    /**
     * Fades view to the specified alpha value.
     * @param view         View to animate.
     * @param targetAlpha  Target alpha for the animation.
     * @param durationMs   Duration of the animation.
     * @param interpolator Interpolator used for the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable fadeToAlpha(@NonNull View view, float targetAlpha, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).alpha(targetAlpha).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

}
