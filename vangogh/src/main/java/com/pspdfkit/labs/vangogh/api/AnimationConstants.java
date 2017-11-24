package com.pspdfkit.labs.vangogh.api;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * Helper class holding constants used in animations.
 */
final class AnimationConstants {

    /** Full visibility alpha level. */
    static final float ALPHA_VISIBLE = 1f;

    /** Full invisibility alpha level. */
    static final float ALPHA_INVISIBLE = 0f;

    /** Default animation duration in ms. */
    static final long DURATION_DEFAULT = new ValueAnimator().getDuration();

    /** Quick animation duration in ms. */
    static final long DURATION_QUICK = (long) (DURATION_DEFAULT * 0.6f);

    /** Slow animation duration in ms. */
    public static final long DURATION_SLOW = DURATION_DEFAULT * 3;

    /** Default interpolator used with animations if not specified otherwise. */
    static final Interpolator INTERPOLATOR = new AccelerateDecelerateInterpolator();

}
