package com.pspdfkit.vangogh.api;

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

    /** Quick animation duration in ms. */
    static final long DURATION_QUICK = 300L;

    /** Slow animation duration in ms. */
    static final long DURATION_SLOW = 1500L;

    /** Default animation duration in ms. */
    static final long DURATION_DEFAULT = 1000L;

    /** Default interpolator used with animations if not specified otherwise. */
    static final Interpolator INTERPOLATOR = new AccelerateDecelerateInterpolator();

}
