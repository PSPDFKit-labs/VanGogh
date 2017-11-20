package com.pspdfkit.labs.vangogh.api;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import com.pspdfkit.labs.vangogh.base.AnimationBuilder;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;

/**
 * Holds methods to animate view to display as toast, coming from invisible to visible.
 */
public class ToastAnimations {

    private static final long FADE_DURATION = 1000L;

    private static final long VIEW_SHOW_DURATION_DEFAULT = 2000L;

    private static final long VIEW_SHOW_DURATION_QUICK = 1000L;

    private static final long VIEW_SHOW_DURATION_SLOW = 1000L;

    private static final Interpolator INTERPOLATOR = new LinearInterpolator();

    public static Completable showAsToast(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_DEFAULT, INTERPOLATOR);
    }

    public static Completable showAsToast(@NonNull View view, long durationMs) {
        return showAsToast(view, durationMs, INTERPOLATOR);
    }

    public static Completable showAsToast(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_DEFAULT, interpolator);
    }

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

    public static Completable showAsToastQuickly(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_QUICK);
    }

    public static Completable showAsToastQuickly(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_QUICK, interpolator);
    }

    public static Completable showAsToastSlowly(@NonNull View view) {
        return showAsToast(view, VIEW_SHOW_DURATION_SLOW);
    }

    public static Completable showAsToastSlowly(@NonNull View view, Interpolator interpolator) {
        return showAsToast(view, VIEW_SHOW_DURATION_SLOW, interpolator);
    }

}
