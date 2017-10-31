package com.pspdfkit.vangogh.api;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.pspdfkit.vangogh.api.TranslateAnimations.translateBy;
import static com.pspdfkit.vangogh.api.TranslateAnimations.translateQuicklyTo;
import static com.pspdfkit.vangogh.api.TranslateAnimations.translateSlowlyTo;
import static com.pspdfkit.vangogh.api.TranslateAnimations.translateTo;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class TranslateAnimationsTest extends BaseAnimationsTest {

    private static final float TRANSLATE_TO_X_VALUE = 100f;

    private static final float TRANSLATE_TO_Y_VALUE = 150F;

    private static final float TRANSLATE_BY_X_VALUE = -10f;

    private static final float TRANSLATE_BY_Y_VALUE = 20f;

    @Test
    public void testTranslateTo() throws InterruptedException {
        o.assertNotComplete();

        translateTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_DEFAULT / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(AnimationConstants.DURATION_DEFAULT * 2, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateToWithDuration() throws InterruptedException {
        o.assertNotComplete();

        translateTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE, CUSTOM_TEST_DURATION_MS).subscribe(o);

        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(CUSTOM_TEST_DURATION_MS * 2, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateToWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateQuicklyTo() throws InterruptedException {
        o.assertNotComplete();

        translateQuicklyTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_QUICK, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateQuicklyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateSlowlyTo() throws InterruptedException {
        o.assertNotComplete();

        translateSlowlyTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_SLOW, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateSlowlyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateBy() throws InterruptedException {
        o.assertNotComplete();

        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_DEFAULT / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_DEFAULT, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateByWithDuration() throws InterruptedException {
        o.assertNotComplete();

        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE, CUSTOM_TEST_DURATION_MS).subscribe(o);

        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * CUSTOM_TEST_DURATION_MS, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateByWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateQuicklyBy() throws InterruptedException {
        o.assertNotComplete();

        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_QUICK, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateQuicklyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateSlowlyBy() throws InterruptedException {
        o.assertNotComplete();

        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);

        o.await(AnimationConstants.DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_SLOW , TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateSlowlyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
