package com.pspdfkit.labs.vangogh.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
import android.view.animation.Interpolator;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

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

    /**
     * Creates {@link AnimationBuilder} for the specified view.
     * @param view View to be animated.
     * @return Instance of {@link AnimationBuilder}.
     */
    @NonNull
    public static AnimationBuilder forView(@NonNull View view) {
        return new AnimationBuilder(view);
    }

    /**
     * Sets view target alpha property.
     * @param alpha View target alpha property (from 0f to 1f).
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setAlpha(float)
     */
    @NonNull
    public AnimationBuilder alpha(Float alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Sets view target alpha property change.
     * @param alphaBy View target alpha property change, use negative number to fade out.
     *                The final alpha value will be inside the [0f, 1f] interval.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setAlpha(float)
     */
    @NonNull
    public AnimationBuilder alphaBy(Float alphaBy) {
        this.alphaBy = alphaBy;
        return this;
    }

    /**
     * Sets view target rotation property.
     * @param rotation View target rotation property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotation(float)
     */
    @NonNull
    public AnimationBuilder rotation(Float rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * Sets view target rotation property change.
     * @param rotationBy View target rotation property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotation(float)
     */
    @NonNull
    public AnimationBuilder rotationBy(Float rotationBy) {
        this.rotationBy = rotationBy;
        return this;
    }

    /**
     * Sets view target rotationX property.
     * @param rotationX View target rotationX property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotationX(float)
     */
    @NonNull
    public AnimationBuilder rotationX(Float rotationX) {
        this.rotationX = rotationX;
        return this;
    }

    /**
     * Sets view target rotationX property change.
     * @param rotationXBy View target rotationX property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotationX(float)
     */
    @NonNull
    public AnimationBuilder rotationXBy(Float rotationXBy) {
        this.rotationXBy = rotationXBy;
        return this;
    }

    /**
     * Sets view target rotationY property.
     * @param rotationY View target rotationY property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotationY(float)
     */
    @NonNull
    public AnimationBuilder rotationY(Float rotationY) {
        this.rotationY = rotationY;
        return this;
    }

    /**
     * Sets view target rotationY property change.
     * @param rotationYBy View target rotationY property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setRotationY(float)
     */
    @NonNull
    public AnimationBuilder rotationYBy(Float rotationYBy) {
        this.rotationYBy = rotationYBy;
        return this;
    }

    /**
     * Sets view target scaleX property.
     * @param scaleX View target scaleX property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setScaleX(float)
     */
    @NonNull
    public AnimationBuilder scaleX(Float scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    /**
     * Sets view target scaleX property change.
     * @param scaleXBy View target scaleX property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setScaleX(float)
     */
    @NonNull
    public AnimationBuilder scaleXBy(Float scaleXBy) {
        this.scaleXBy = scaleXBy;
        return this;
    }

    /**
     * Sets view target scaleY property.
     * @param scaleY View target scaleY property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setScaleY(float)
     */
    @NonNull
    public AnimationBuilder scaleY(Float scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    /**
     * Sets view target scaleY property change.
     * @param scaleYBy View target scaleY property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setScaleY(float)
     */
    @NonNull
    public AnimationBuilder scaleYBy(Float scaleYBy) {
        this.scaleYBy = scaleYBy;
        return this;
    }

    /**
     * Sets animation duration.
     * @param duration Duration of animation in milliseconds.
     * @return Instance of {@link AnimationBuilder}.
     */
    @NonNull
    public AnimationBuilder duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Sets interpolator to be used in this animation.
     * @param interpolator Interpolator to be used for time/progress control.
     * @return Instance of {@link AnimationBuilder}.
     */
    @NonNull
    public AnimationBuilder interpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }

    /**
     * Sets start delay for the animation.
     * @param startDelay Start delay in milliseconds.
     * @return Instance of {@link AnimationBuilder}.
     */
    @NonNull
    public AnimationBuilder startDelay(Long startDelay) {
        this.startDelay = startDelay;
        return this;
    }

    /**
     * Sets view target translationX property.
     * @param translationX View target translationX property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationX(float)
     */
    @NonNull
    public AnimationBuilder translationX(Float translationX) {
        this.translationX = translationX;
        return this;
    }

    /**
     * Sets view target translationX property change.
     * @param translationXBy View target translationX property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationX(float)
     */
    @NonNull
    public AnimationBuilder translationXBy(Float translationXBy) {
        this.translationXBy = translationXBy;
        return this;
    }

    /**
     * Sets view target translationY property.
     * @param translationY View target translationY property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationY(float)
     */
    @NonNull
    public AnimationBuilder translationY(Float translationY) {
        this.translationY = translationY;
        return this;
    }

    /**
     * Sets view target translationY property change.
     * @param translationYBy View target translationY property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationY(float)
     */
    @NonNull
    public AnimationBuilder translationYBy(Float translationYBy) {
        this.translationYBy = translationYBy;
        return this;
    }

    /**
     * Sets view target translationZ property.
     * @param translationZ View target translationZ property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationZ(float)
     */
    @NonNull
    public AnimationBuilder translationZ(Float translationZ) {
        this.translationZ = translationZ;
        return this;
    }

    /**
     * Sets view target translationZ property change.
     * @param translationZBy View target translationZ property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setTranslationZ(float)
     */
    @NonNull
    public AnimationBuilder translationZBy(Float translationZBy) {
        this.translationZBy = translationZBy;
        return this;
    }

    /**
     * Sets view target x property.
     * @param x View target x property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setX(float)
     */
    @NonNull
    public AnimationBuilder x(Float x) {
        this.x = x;
        return this;
    }

    /**
     * Sets view target x property change.
     * @param xBy View target x property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setX(float)
     */
    @NonNull
    public AnimationBuilder xBy(Float xBy) {
        this.xBy = xBy;
        return this;
    }

    /**
     * Sets view target y property.
     * @param y View target y property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setY(float)
     */
    @NonNull
    public AnimationBuilder y(Float y) {
        this.y = y;
        return this;
    }

    /**
     * Sets view target y property change.
     * @param yBy View target y property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setY(float)
     */
    @NonNull
    public AnimationBuilder yBy(Float yBy) {
        this.yBy = yBy;
        return this;
    }

    /**
     * Sets view target z property.
     * @param z View target z property in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setZ(float)
     */
    @NonNull
    public AnimationBuilder z(Float z) {
        this.z = z;
        return this;
    }

    /**
     * Sets view target z property change.
     * @param zBy View target z property change in degrees.
     * @return Instance of {@link AnimationBuilder}.
     * @see View#setZ(float)
     */
    @NonNull
    public AnimationBuilder zBy(Float zBy) {
        this.zBy = zBy;
        return this;
    }

    /**
     * Build animation from the provided builder parameters.
     * @return Animation with parameters set through the builder.
     */
    @NonNull
    public Animation build() {
        return new Animation(view, alpha, alphaBy, rotation, rotationBy, rotationX, rotationXBy, rotationY, rotationYBy,
                scaleX, scaleXBy, scaleY, scaleYBy, duration, interpolator, startDelay, translationX, translationXBy,
                translationY, translationYBy, translationZ, translationZBy, x, xBy, y, yBy, z, zBy);
    }

    /**
     * Method for directly producing {@link AnimationCompletable}. Just a convenience method
     * so you don't have to call <code>.build().toCompletable()</code>.
     * @return Completable that will start the specified animation once subscribed to.
     */
    @NonNull
    public AnimationCompletable buildCompletable() {
        return build().toCompletable();
    }

}
