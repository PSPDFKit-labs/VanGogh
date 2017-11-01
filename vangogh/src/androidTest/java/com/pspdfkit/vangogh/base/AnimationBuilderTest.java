package com.pspdfkit.vangogh.base;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class AnimationBuilderTest {

    @Test
    @SuppressWarnings("ConstantConditions")
    public void testAnimationBuilder() {
        View view = new View(InstrumentationRegistry.getContext());
        Interpolator interpolator = new LinearInterpolator();
        Animation a = AnimationBuilder.forView(view)
                .alpha(0.3f)
                .alphaBy(0.1f)
                .duration(100L)
                .interpolator(interpolator)
                .rotation(30f)
                .rotationBy(20f)
                .rotationX(12f)
                .rotationY(90f)
                .rotationXBy(100f)
                .rotationYBy(102f)
                .scaleX(1f)
                .scaleXBy(1.1f)
                .scaleY(0.1f)
                .scaleYBy(2.1f)
                .x(200f)
                .y(300f)
                .z(400f)
                .xBy(250f)
                .yBy(350f)
                .zBy(450f)
                .translationX(1f)
                .translationXBy(2f)
                .translationY(3f)
                .translationYBy(4f)
                .translationZ(5f)
                .translationZBy(6f)
                .build();

        assertEquals(view, a.getView().get());
        assertEquals(0.3f, a.getAlpha(), 0.0f);
        assertEquals(0.1f, a.getAlphaBy(), 0.0f);
        assertEquals(100L, a.getDuration().longValue());
        assertEquals(interpolator, a.getInterpolator());
        assertEquals(30f, a.getRotation(), 0f);
        assertEquals(20f, a.getRotationBy(), 0f);
        assertEquals(12f, a.getRotationX(), 0f);
        assertEquals(90f, a.getRotationY(), 0f);
        assertEquals(100f, a.getRotationXBy(), 0f);
        assertEquals(102f, a.getRotationYBy(), 0f);
        assertEquals(1f, a.getScaleX(), 0f);
        assertEquals(1.1f, a.getScaleXBy(), 0f);
        assertEquals(0.1f, a.getScaleY(), 0f);
        assertEquals(2.1f, a.getScaleYBy(), 0f);
        assertEquals(200f, a.getX(), 0f);
        assertEquals(300f, a.getY(), 0f);
        assertEquals(400f, a.getZ(), 0f);
        assertEquals(250f, a.getXBy(), 0f);
        assertEquals(350f, a.getYBy(), 0f);
        assertEquals(450f, a.getZBy(), 0f);
        assertEquals(1f, a.getTranslationX(), 0f);
        assertEquals(2f, a.getTranslationXBy(), 0f);
        assertEquals(3f, a.getTranslationY(), 0f);
        assertEquals(4f, a.getTranslationYBy(), 0f);
        assertEquals(5f, a.getTranslationZ(), 0f);
        assertEquals(6f, a.getTranslationZBy(), 0f);
    }

}
