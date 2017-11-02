package com.pspdfkit.labs.vangogh.api;

import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;
import io.reactivex.annotations.NonNull;

/**
 * Class containing convenient animations affecting rotation property of the view.
 */
public final class RotateAnimations {

    /**
     * Rotates the view to the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateTo(@NonNull View view, float degrees) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Rotates the view to the selected degrees clockwise.
     * @param view       View to rotate.
     * @param degrees    Target value of the rotation property (in clockwise degrees rotation).
     * @param durationMs Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateTo(@NonNull View view, float degrees, long durationMs) {
        return rotateTo(view, degrees, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Rotates the view to the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateTo(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Rotates the view to the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target value of the rotation property (in clockwise degrees rotation).
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateTo(@NonNull View view, float degrees, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).rotation(degrees).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Rotates the view quickly to the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateQuicklyTo(@NonNull View view, float degrees) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Rotates the view quickly to the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateQuicklyTo(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Rotates the view slowly to the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateSlowlyTo(@NonNull View view, float degrees) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Rotates the view slowly to the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateSlowlyTo(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateTo(view, degrees, AnimationConstants.DURATION_SLOW, interpolator);
    }

    /**
     * Rotates the view by the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target difference value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateBy(@NonNull View view, float degrees) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Rotates the view by the selected degrees clockwise.
     * @param view       View to rotate.
     * @param degrees    Target difference value of the rotation property (in clockwise degrees rotation).
     * @param durationMs Duration of the animation in ms.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateBy(@NonNull View view, float degrees, long durationMs) {
        return rotateBy(view, degrees, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Rotates the view by the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target difference value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateBy(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Rotates the view by the selected degrees clockwise.
     * @param view         View to rotate.
     * @param degrees      Target difference value of the rotation property (in clockwise degrees rotation).
     * @param durationMs   Duration of the animation in ms.
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateBy(@NonNull View view, float degrees, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).rotationBy(degrees).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Rotates the view quickly by the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target difference value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateQuicklyBy(@NonNull View view, float degrees) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Rotates the view quickly by the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target difference value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateQuicklyBy(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Rotates the view slowly by the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target difference value of the rotation property (in clockwise degrees rotation).
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateSlowlyBy(@NonNull View view, float degrees) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Rotates the view slowly by the selected degrees clockwise.
     * @param view    View to rotate.
     * @param degrees Target difference value of the rotation property (in clockwise degrees rotation).
     * @param interpolator Interpolator to use in animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable rotateSlowlyBy(@NonNull View view, float degrees, Interpolator interpolator) {
        return rotateBy(view, degrees, AnimationConstants.DURATION_SLOW, interpolator);
    }

}
