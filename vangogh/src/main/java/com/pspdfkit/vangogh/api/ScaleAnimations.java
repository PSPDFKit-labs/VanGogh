package com.pspdfkit.vangogh.api;

import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.vangogh.base.AnimationBuilder;
import com.pspdfkit.vangogh.rx.AnimationCompletable;
import io.reactivex.annotations.NonNull;

/**
 * Class containing convenient animations affecting translation property of the view.
 */
public final class ScaleAnimations {

    /**
     * Scales the view to the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleTo(@NonNull View view, float scale) {
        return scaleTo(view, scale, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Scales the view to the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @param durationMs   Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleTo(@NonNull View view, float scale, long durationMs) {
        return scaleTo(view, scale, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Scales the view to the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleTo(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleTo(view, scale, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Scales the view to the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleTo(@NonNull View view, float scale, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).scaleX(scale).scaleY(scale).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Scales the view to the selected scale value quickly.
     * @param view  View to scale.
     * @param scale Target value of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleQuicklyTo(@NonNull View view, float scale) {
        return scaleTo(view, scale, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Scales the view to the selected scale value quickly.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleQuicklyTo(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleTo(view, scale, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Scales the view to the selected scale value slowly.
     * @param view  View to scale.
     * @param scale Target value of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleSlowlyTo(@NonNull View view, float scale) {
        return scaleTo(view, scale, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Scales the view to the selected scale value slowly.
     * @param view         View to scale.
     * @param scale        Target value of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleSlowlyTo(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleTo(view, scale, AnimationConstants.DURATION_SLOW, interpolator);
    }

    /**
     * Scales the view by the selected scale value.
     * @param view  View to scale.
     * @param scale Target value change of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleBy(@NonNull View view, float scale) {
        return scaleBy(view, scale, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Scales the view by the selected scale value.
     * @param view       View to scale.
     * @param scale      Target value change of the scale property.
     * @param durationMs Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleBy(@NonNull View view, float scale, long durationMs) {
        return scaleBy(view, scale, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Scales the view by the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value change of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleBy(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleBy(view, scale, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Scales the view by the selected scale value.
     * @param view         View to scale.
     * @param scale        Target value change of the scale property.
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleBy(@NonNull View view, float scale, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).scaleXBy(scale).scaleYBy(scale).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Scales the view by the selected scale value quickly.
     * @param view  View to scale.
     * @param scale Target value change of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleQuicklyBy(@NonNull View view, float scale) {
        return scaleBy(view, scale, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Scales the view by the selected scale value quickly.
     * @param view         View to scale.
     * @param scale        Target value change of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleQuicklyBy(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleBy(view, scale, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Scales the view by the selected scale value slowly.
     * @param view  View to scale.
     * @param scale Target value change of the scale property.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleSlowlyBy(@NonNull View view, float scale) {
        return scaleBy(view, scale, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Scales the view by the selected scale value slowly.
     * @param view         View to scale.
     * @param scale        Target value change of the scale property.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable scaleSlowlyBy(@NonNull View view, float scale, Interpolator interpolator) {
        return scaleBy(view, scale, AnimationConstants.DURATION_SLOW, interpolator);
    }

}
