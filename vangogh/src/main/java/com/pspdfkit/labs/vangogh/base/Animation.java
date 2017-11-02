package com.pspdfkit.labs.vangogh.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import java.lang.ref.WeakReference;

/**
 * Holds parameters for view animation. This class is immutable.
 * It's recommended to use {@link AnimationBuilder} to create it.
 */
public final class Animation {

    @NonNull private final WeakReference<View> view;

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

    Animation(View view, Float alpha, Float alphaBy, Float rotation, Float rotationBy, Float rotationX,
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

    /**
     * @return A weak reference to the view on which this animation is set to be applied.
     */
    @NonNull
    public WeakReference<View> getView() {
        return view;
    }

    /**
     * @return Target alpha value of the animated view.
     */
    @Nullable
    public Float getAlpha() {
        return alpha;
    }

    /**
     * @return Target alpha value difference of the animated view.
     */
    @Nullable
    public Float getAlphaBy() {
        return alphaBy;
    }

    /**
     * @return Target rotation in degrees of the animated view.
     */
    @Nullable
    public Float getRotation() {
        return rotation;
    }

    /**
     * @return Target rotation difference in degrees of the animated view.
     */
    @Nullable
    public Float getRotationBy() {
        return rotationBy;
    }

    /**
     * @return Target rotation in degrees relative to the x-axis in degrees of the animated view.
     */
    @Nullable
    public Float getRotationX() {
        return rotationX;
    }

    /**
     * @return Target rotation difference in degrees relative to the x-axis of the animated view.
     */
    @Nullable
    public Float getRotationXBy() {
        return rotationXBy;
    }

    /**
     * @return Target rotation in degrees relative to the y-axis in degrees of the animated view.
     */
    @Nullable
    public Float getRotationY() {
        return rotationY;
    }

    /**
     * @return Target rotation difference in degrees relative to the y-axis of the animated view.
     */
    @Nullable
    public Float getRotationYBy() {
        return rotationYBy;
    }

    /**
     * @return Target x-axis scale of the animated view.
     */
    @Nullable
    public Float getScaleX() {
        return scaleX;
    }

    /**
     * @return Target x-axis scale difference of the animated view.
     */
    @Nullable
    public Float getScaleXBy() {
        return scaleXBy;
    }

    /**
     * @return Target y-axis scale of the animated view.
     */
    @Nullable
    public Float getScaleY() {
        return scaleY;
    }

    /**
     * @return Target y-axis scale difference of the animated view.
     */
    @Nullable
    public Float getScaleYBy() {
        return scaleYBy;
    }

    /**
     * @return Duration of the specified animation in milliseconds.
     */
    @Nullable
    public Long getDuration() {
        return duration;
    }

    /**
     * @return Interpolator to use with the specified animation.
     */
    @Nullable
    public Interpolator getInterpolator() {
        return interpolator;
    }

    /**
     * @return Initial animation delay in milliseconds.
     */
    @Nullable
    public Long getStartDelay() {
        return startDelay;
    }

    /**
     * @return Target translation of the view along x-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationX() {
        return translationX;
    }

    /**
     * @return Target translation difference of the view along x-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationXBy() {
        return translationXBy;
    }

    /**
     * @return Target translation of the view along y-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationY() {
        return translationY;
    }

    /**
     * @return Target translation of the view along y-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationYBy() {
        return translationYBy;
    }

    /**
     * @return Target translation of the view along z-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationZ() {
        return translationZ;
    }

    /**
     * @return Target translation of the view along z-axis relative to the view's initial position.
     */
    @Nullable
    public Float getTranslationZBy() {
        return translationZBy;
    }

    /**
     * @return Target x property of the animated view.
     */
    @Nullable
    public Float getX() {
        return x;
    }

    /**
     * @return Target x property difference of the animated view.
     */
    @Nullable
    public Float getXBy() {
        return xBy;
    }

    /**
     * @return Target y property of the animated view.
     */
    @Nullable
    public Float getY() {
        return y;
    }

    /**
     * @return Target y property difference of the animated view.
     */
    @Nullable
    public Float getYBy() {
        return yBy;
    }

    /**
     * @return Target z property of the animated view.
     */
    @Nullable
    public Float getZ() {
        return z;
    }

    /**
     * @return Target z property difference of the animated view.
     */
    @Nullable
    public Float getZBy() {
        return zBy;
    }

    /**
     * Convenience method for transforming this animation to {@link AnimationCompletable} you can subscribe to.
     * @return Animation completable which will execute this animation once subscribed to.
     */
    public AnimationCompletable toCompletable() {
        return new AnimationCompletable(this);
    }
    
}
