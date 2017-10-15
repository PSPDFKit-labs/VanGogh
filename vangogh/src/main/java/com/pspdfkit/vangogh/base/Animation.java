package com.pspdfkit.vangogh.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.vangogh.internal.ImmutableAnimation;
import com.pspdfkit.vangogh.rx.AnimationCompletable;

public final class Animation {

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

    private Animation(@NonNull View view) {
        this.view = view;
    }

    @NonNull
    public static Animation forView(@NonNull View view) {
        return new Animation(view);
    }

    @NonNull
    public Animation alpha(Float alpha) {
        this.alpha = alpha;
        return this;
    }

    @NonNull
    public Animation alphaBy(Float alphaBy) {
        this.alphaBy = alphaBy;
        return this;
    }

    @NonNull
    public Animation rotation(Float rotation) {
        this.rotation = rotation;
        return this;
    }

    @NonNull
    public Animation rotationBy(Float rotationBy) {
        this.rotationBy = rotationBy;
        return this;
    }

    @NonNull
    public Animation rotationX(Float rotationX) {
        this.rotationX = rotationX;
        return this;
    }

    @NonNull
    public Animation rotationXBy(Float rotationXBy) {
        this.rotationXBy = rotationXBy;
        return this;
    }

    @NonNull
    public Animation rotationY(Float rotationY) {
        this.rotationY = rotationY;
        return this;
    }

    @NonNull
    public Animation rotationYBy(Float rotationYBy) {
        this.rotationYBy = rotationYBy;
        return this;
    }

    public Animation scaleX(Float scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    @NonNull
    public Animation scaleXBy(Float scaleXBy) {
        this.scaleXBy = scaleXBy;
        return this;
    }

    @NonNull
    public Animation scaleY(Float scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    @NonNull
    public Animation scaleYBy(Float scaleYBy) {
        this.scaleYBy = scaleYBy;
        return this;
    }

    @NonNull
    public Animation duration(Long duration) {
        this.duration = duration;
        return this;
    }

    @NonNull
    public Animation interpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }

    @NonNull
    public Animation startDelay(Long startDelay) {
        this.startDelay = startDelay;
        return this;
    }

    @NonNull
    public Animation translationX(Float translationX) {
        this.translationX = translationX;
        return this;
    }

    @NonNull
    public Animation translationXBy(Float translationXBy) {
        this.translationXBy = translationXBy;
        return this;
    }

    @NonNull
    public Animation translationY(Float translationY) {
        this.translationY = translationY;
        return this;
    }

    @NonNull
    public Animation translationYBy(Float translationYBy) {
        this.translationYBy = translationYBy;
        return this;
    }

    @NonNull
    public Animation translationZ(Float translationZ) {
        this.translationZ = translationZ;
        return this;
    }

    @NonNull
    public Animation translationZBy(Float translationZBy) {
        this.translationZBy = translationZBy;
        return this;
    }

    @NonNull
    public Animation x(Float x) {
        this.x = x;
        return this;
    }

    @NonNull
    public Animation xBy(Float xBy) {
        this.xBy = xBy;
        return this;
    }

    @NonNull
    public Animation y(Float y) {
        this.y = y;
        return this;
    }

    @NonNull
    public Animation yBy(Float yBy) {
        this.yBy = yBy;
        return this;
    }

    @NonNull
    public Animation z(Float z) {
        this.z = z;
        return this;
    }

    @NonNull
    public Animation zBy(Float zBy) {
        this.zBy = zBy;
        return this;
    }

    @NonNull
    public AnimationCompletable asCompletable() {
        return new AnimationCompletable(toImmutable());
    }

    @NonNull
    private ImmutableAnimation toImmutable() {
        return new ImmutableAnimation(view, alpha, alphaBy, rotation, rotationBy,
                rotationX, rotationXBy, rotationY, rotationYBy, scaleX, scaleXBy, scaleY,
                scaleYBy, duration, interpolator, startDelay, translationX,
                translationXBy, translationY, translationYBy, translationZ,
                translationZBy, x, xBy, y, yBy, z, zBy);
    }

}
