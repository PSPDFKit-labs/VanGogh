package com.pspdfkit.vangogh.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Interpolator;

import java.lang.ref.WeakReference;

/**
 * Holds parameters for view animation. This class is immutable.
 * It's recommended to use {@link AnimationBuilder} to create it.
 */
public final class Animation {

    @NonNull private final WeakReference<View> view;

    @Nullable private Float alpha;

    @Nullable private Float alphaBy;

    @Nullable private Float rotation;

    @Nullable private Float rotationBy;

    @Nullable private Float rotationX;

    @Nullable private Float rotationXBy;

    @Nullable private Float rotationY;

    @Nullable private Float rotationYBy;

    @Nullable private Float scaleX;

    @Nullable private Float scaleXBy;

    @Nullable private Float scaleY;

    @Nullable private Float scaleYBy;

    @Nullable private Long duration;

    @Nullable private Interpolator interpolator;

    @Nullable private Long startDelay;

    @Nullable private Float translationX;

    @Nullable private Float translationXBy;

    @Nullable private Float translationY;

    @Nullable private Float translationYBy;

    @Nullable private Float translationZ;

    @Nullable private Float translationZBy;

    @Nullable private Float x;

    @Nullable private Float xBy;

    @Nullable private Float y;

    @Nullable private Float yBy;

    @Nullable private Float z;

    @Nullable private Float zBy;

    public Animation(View view, Float alpha, Float alphaBy, Float rotation, Float rotationBy, Float rotationX,
                     Float rotationXBy, Float rotationY, Float rotationYBy, Float scaleX, Float scaleXBy,
                     Float scaleY, Float scaleYBy, Long duration, Interpolator interpolator, Long startDelay,
                     Float translationX, Float translationXBy, Float translationY, Float translationYBy,
                     Float translationZ, Float translationZBy, Float x, Float xBy, Float y, Float yBy, Float z,
                     Float zBy) {
        this.view = new WeakReference<>(view);
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

    @NonNull
    public WeakReference<View> getView() {
        return view;
    }

    @Nullable
    public Float getAlpha() {
        return alpha;
    }

    @Nullable
    public Float getAlphaBy() {
        return alphaBy;
    }

    @Nullable
    public Float getRotation() {
        return rotation;
    }

    @Nullable
    public Float getRotationBy() {
        return rotationBy;
    }

    @Nullable
    public Float getRotationX() {
        return rotationX;
    }

    @Nullable
    public Float getRotationXBy() {
        return rotationXBy;
    }

    @Nullable
    public Float getRotationY() {
        return rotationY;
    }

    @Nullable
    public Float getRotationYBy() {
        return rotationYBy;
    }

    @Nullable
    public Float getScaleX() {
        return scaleX;
    }

    @Nullable
    public Float getScaleXBy() {
        return scaleXBy;
    }

    @Nullable
    public Float getScaleY() {
        return scaleY;
    }

    @Nullable
    public Float getScaleYBy() {
        return scaleYBy;
    }

    @Nullable
    public Long getDuration() {
        return duration;
    }

    @Nullable
    public Interpolator getInterpolator() {
        return interpolator;
    }

    @Nullable
    public Long getStartDelay() {
        return startDelay;
    }

    @Nullable
    public Float getTranslationX() {
        return translationX;
    }

    @Nullable
    public Float getTranslationXBy() {
        return translationXBy;
    }

    @Nullable
    public Float getTranslationY() {
        return translationY;
    }

    @Nullable
    public Float getTranslationYBy() {
        return translationYBy;
    }

    @Nullable
    public Float getTranslationZ() {
        return translationZ;
    }

    @Nullable
    public Float getTranslationZBy() {
        return translationZBy;
    }

    @Nullable
    public Float getX() {
        return x;
    }

    @Nullable
    public Float getXBy() {
        return xBy;
    }

    @Nullable
    public Float getY() {
        return y;
    }

    @Nullable
    public Float getYBy() {
        return yBy;
    }

    @Nullable
    public Float getZ() {
        return z;
    }

    @Nullable
    public Float getZBy() {
        return zBy;
    }
    
}
