package com.pspdfkit.vangogh.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import android.view.animation.Interpolator;

import java.lang.ref.WeakReference;

/**
 * Represents animation parameters in immutable form.
 */
public final class ImmutableAnimation {

    @NonNull private final WeakReference<View> viewRef;

    @Nullable private final Float alpha;

    @Nullable private final Float alphaBy;

    @Nullable private final Float rotation;

    @Nullable private final Float rotationBy;

    @Nullable private final Float rotationX;

    @Nullable private final Float rotationXBy;

    @Nullable private final Float rotationY;

    @Nullable private final Float rotationYBy;

    @Nullable private final Float scaleX;

    @Nullable private final Float scaleXBy;

    @Nullable private final Float scaleY;

    @Nullable private final Float scaleYBy;

    @Nullable private final Long duration;

    @Nullable private final Interpolator interpolator;

    @Nullable private final Long startDelay;

    @Nullable private final Float translationX;

    @Nullable private final Float translationXBy;

    @Nullable private final Float translationY;

    @Nullable private final Float translationYBy;

    @Nullable private final Float translationZ;

    @Nullable private final Float translationZBy;

    @Nullable private final Float x;

    @Nullable private final Float xBy;

    @Nullable private final Float y;

    @Nullable private final Float yBy;

    @Nullable private final Float z;

    @Nullable private final Float zBy;

    public ImmutableAnimation(View view, Float alpha, Float alphaBy, Float rotation, Float rotationBy, Float rotationX,
                              Float rotationXBy, Float rotationY, Float rotationYBy, Float scaleX, Float scaleXBy,
                              Float scaleY, Float scaleYBy, Long duration, Interpolator interpolator, Long startDelay,
                              Float translationX, Float translationXBy, Float translationY, Float translationYBy,
                              Float translationZ, Float translationZBy, Float x, Float xBy, Float y, Float yBy, Float z,
                              Float zBy) {
        this.viewRef = new WeakReference<>(view);
        this.alpha = alpha;
        this.alphaBy = alphaBy;
        this.rotation = rotation;
        this.rotationBy = rotationBy;
        this.rotationX = rotationX;
        this.rotationXBy = rotationXBy;
        this.rotationY = rotationY;
        this.rotationYBy = rotationYBy;
        this.scaleX = scaleX;
        this.scaleXBy = scaleXBy;
        this.scaleY = scaleY;
        this.scaleYBy = scaleYBy;
        this.duration = duration;
        this.interpolator = interpolator;
        this.startDelay = startDelay;
        this.translationX = translationX;
        this.translationXBy = translationXBy;
        this.translationY = translationY;
        this.translationYBy = translationYBy;
        this.translationZ = translationZ;
        this.translationZBy = translationZBy;
        this.x = x;
        this.xBy = xBy;
        this.y = y;
        this.yBy = yBy;
        this.z = z;
        this.zBy = zBy;
    }

    /**
     * Starts the defined view animation.
     * @return Animator for the started animation.
     */
    @NonNull
    public ViewPropertyAnimatorCompat start() throws Exception {
        View view = viewRef.get();
        if (view == null) {
            throw new Exception("Reference to a view scheduled for animation no longer exists.");
        }

        ViewPropertyAnimatorCompat animator = ViewCompat.animate(view);
        if (alpha != null) animator.alpha(alpha);
        if (alphaBy != null) animator.alphaBy(alphaBy);
        if (rotation != null) animator.rotation(rotation);
        if (rotationBy != null) animator.rotationBy(rotationBy);
        if (rotationX != null) animator.rotationX(rotationX);
        if (rotationXBy != null) animator.rotationXBy(rotationXBy);
        if (rotationY != null) animator.rotationY(rotationY);
        if (rotationYBy != null) animator.rotationYBy(rotationYBy);
        if (scaleX != null) animator.scaleX(scaleX);
        if (scaleXBy != null) animator.scaleXBy(scaleXBy);
        if (scaleY != null) animator.scaleY(scaleY);
        if (scaleYBy != null) animator.scaleYBy(scaleYBy);
        if (duration != null) animator.setDuration(duration);
        if (interpolator != null) animator.setInterpolator(interpolator);
        if (startDelay != null) animator.setStartDelay(startDelay);
        if (translationX != null) animator.translationX(translationX);
        if (translationXBy != null) animator.translationXBy(translationXBy);
        if (translationY != null) animator.translationY(translationY);
        if (translationYBy != null) animator.translationYBy(translationYBy);
        if (translationZ != null) animator.translationZ(translationZ);
        if (translationZBy != null) animator.translationZBy(translationZBy);
        if (x != null) animator.x(x);
        if (xBy != null) animator.xBy(xBy);
        if (y != null) animator.y(y);
        if (yBy != null) animator.yBy(yBy);
        if (z != null) animator.z(z);
        if (z != null) animator.zBy(zBy);
        return animator;
    }

}
