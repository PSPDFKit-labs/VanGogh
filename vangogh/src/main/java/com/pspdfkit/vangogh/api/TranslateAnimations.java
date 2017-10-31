package com.pspdfkit.vangogh.api;

import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.vangogh.base.AnimationBuilder;
import com.pspdfkit.vangogh.rx.AnimationCompletable;
import io.reactivex.annotations.NonNull;

/**
 * Class containing convenient animations affecting translation property of the view.
 */
public final class TranslateAnimations {

    /**
     * Translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateTo(@NonNull View view, float translationX, float translationY) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @param durationMs   Duration of the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateTo(@NonNull View view, float translationX, float translationY, long durationMs) {
        return translateTo(view, translationX, translationY, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @param interpolator Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateTo(@NonNull View view, float translationX, float translationY, Interpolator interpolator) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @param durationMs   Duration of the animation.
     * @param interpolator Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateTo(@NonNull View view, float translationX, float translationY, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).translationX(translationX).translationY(translationY).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Quickly translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateQuicklyTo(@NonNull View view, float translationX, float translationY) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Quickly translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @param interpolator Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateQuicklyTo(@NonNull View view, float translationX, float translationY, Interpolator interpolator) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Slowly translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateSlowlyTo(@NonNull View view, float translationX, float translationY) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Slowly translates the given view to the specified values.
     * @param view         View to translate.
     * @param translationX Target horizontal translation value of the view.
     * @param translationY Target vertical translation value of the view.
     * @param interpolator Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateSlowlyTo(@NonNull View view, float translationX, float translationY, Interpolator interpolator) {
        return translateTo(view, translationX, translationY, AnimationConstants.DURATION_SLOW, interpolator);
    }

    /**
     * Translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateBy(@NonNull View view, float translationXBy, float translationYBy) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_DEFAULT, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @param durationMs     Duration of the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateBy(@NonNull View view, float translationXBy, float translationYBy, long durationMs) {
        return translateBy(view, translationXBy, translationYBy, durationMs, AnimationConstants.INTERPOLATOR);
    }

    /**
     * Translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @param interpolator   Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateBy(@NonNull View view, float translationXBy, float translationYBy, Interpolator interpolator) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_DEFAULT, interpolator);
    }

    /**
     * Translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @param durationMs     Duration of the animation.
     * @param interpolator   Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateBy(@NonNull View view, float translationXBy, float translationYBy, long durationMs, Interpolator interpolator) {
        return AnimationBuilder.forView(view).translationXBy(translationXBy).translationYBy(translationYBy).duration(durationMs).interpolator(interpolator).buildCompletable();
    }

    /**
     * Quickly translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateQuicklyBy(@NonNull View view, float translationXBy, float translationYBy) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_QUICK);
    }

    /**
     * Quickly translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @param interpolator   Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateQuicklyBy(@NonNull View view, float translationXBy, float translationYBy, Interpolator interpolator) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_QUICK, interpolator);
    }

    /**
     * Slowly translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateSlowlyBy(@NonNull View view, float translationXBy, float translationYBy) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_SLOW);
    }

    /**
     * Slowly translates the given view by the specified values.
     * @param view           View to translate.
     * @param translationXBy Target horizontal translation value difference of the view.
     * @param translationYBy Target vertical translation value difference of the view.
     * @param interpolator   Interpolator to use with the animation.
     * @return Completable which starts animation once subscribed to.
     */
    public static AnimationCompletable translateSlowlyBy(@NonNull View view, float translationXBy, float translationYBy, Interpolator interpolator) {
        return translateBy(view, translationXBy, translationYBy, AnimationConstants.DURATION_SLOW, interpolator);
    }

}
