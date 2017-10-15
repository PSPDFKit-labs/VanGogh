package com.pspdfkit.vangogh.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Interpolator;

public class AnimationBuilder {

    @NonNull private final View view;

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

    private AnimationBuilder(@NonNull View view) {
        this.view = view;
    }

    @NonNull
    public static AnimationBuilder forView(@NonNull View view) {
        return new AnimationBuilder(view);
    }

    @NonNull
    public AnimationBuilder alpha(Float alpha) {
        this.alpha = alpha;
        return this;
    }

    @NonNull
    public AnimationBuilder alphaBy(Float alphaBy) {
        this.alphaBy = alphaBy;
        return this;
    }

    @NonNull
    public AnimationBuilder rotation(Float rotation) {
        this.rotation = rotation;
        return this;
    }

    @NonNull
    public AnimationBuilder rotationBy(Float rotationBy) {
        this.rotationBy = rotationBy;
        return this;
    }

    @NonNull
    public AnimationBuilder rotationX(Float rotationX) {
        this.rotationX = rotationX;
        return this;
    }

    @NonNull
    public AnimationBuilder rotationXBy(Float rotationXBy) {
        this.rotationXBy = rotationXBy;
        return this;
    }

    @NonNull
    public AnimationBuilder rotationY(Float rotationY) {
        this.rotationY = rotationY;
        return this;
    }

    @NonNull
    public AnimationBuilder rotationYBy(Float rotationYBy) {
        this.rotationYBy = rotationYBy;
        return this;
    }

    @NonNull
    public AnimationBuilder scaleX(Float scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    @NonNull
    public AnimationBuilder scaleXBy(Float scaleXBy) {
        this.scaleXBy = scaleXBy;
        return this;
    }

    @NonNull
    public AnimationBuilder scaleY(Float scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    @NonNull
    public AnimationBuilder scaleYBy(Float scaleYBy) {
        this.scaleYBy = scaleYBy;
        return this;
    }

    @NonNull
    public AnimationBuilder duration(Long duration) {
        this.duration = duration;
        return this;
    }

    @NonNull
    public AnimationBuilder interpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }

    @NonNull
    public AnimationBuilder startDelay(Long startDelay) {
        this.startDelay = startDelay;
        return this;
    }

    @NonNull
    public AnimationBuilder translationX(Float translationX) {
        this.translationX = translationX;
        return this;
    }

    @NonNull
    public AnimationBuilder translationXBy(Float translationXBy) {
        this.translationXBy = translationXBy;
        return this;
    }

    @NonNull
    public AnimationBuilder translationY(Float translationY) {
        this.translationY = translationY;
        return this;
    }

    @NonNull
    public AnimationBuilder translationYBy(Float translationYBy) {
        this.translationYBy = translationYBy;
        return this;
    }

    @NonNull
    public AnimationBuilder translationZ(Float translationZ) {
        this.translationZ = translationZ;
        return this;
    }

    @NonNull
    public AnimationBuilder translationZBy(Float translationZBy) {
        this.translationZBy = translationZBy;
        return this;
    }

    @NonNull
    public AnimationBuilder x(Float x) {
        this.x = x;
        return this;
    }

    @NonNull
    public AnimationBuilder xBy(Float xBy) {
        this.xBy = xBy;
        return this;
    }

    @NonNull
    public AnimationBuilder y(Float y) {
        this.y = y;
        return this;
    }

    @NonNull
    public AnimationBuilder yBy(Float yBy) {
        this.yBy = yBy;
        return this;
    }

    @NonNull
    public AnimationBuilder z(Float z) {
        this.z = z;
        return this;
    }

    @NonNull
    public AnimationBuilder zBy(Float zBy) {
        this.zBy = zBy;
        return this;
    }

    @NonNull
    public Animation build() {
        return new Animation(view, alpha, alphaBy, rotation, rotationBy, rotationX, rotationXBy, rotationY, rotationYBy,
                scaleX, scaleXBy, scaleY, scaleYBy, duration, interpolator, startDelay, translationX, translationXBy,
                translationY, translationYBy, translationZ, translationZBy, x, xBy, y, yBy, z, zBy);
    }

}
