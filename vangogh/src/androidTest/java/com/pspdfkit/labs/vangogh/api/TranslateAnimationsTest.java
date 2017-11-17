package com.pspdfkit.labs.vangogh.api;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateBy;
import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateQuicklyBy;
import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateQuicklyTo;
import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateSlowlyBy;
import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateSlowlyTo;
import static com.pspdfkit.labs.vangogh.api.TranslateAnimations.translateTo;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class TranslateAnimationsTest extends BaseAnimationsTest {

    private static final float TRANSLATE_TO_X_VALUE = 100f;

    private static final float TRANSLATE_TO_Y_VALUE = 150F;

    private static final float TRANSLATE_BY_X_VALUE = -10f;

    private static final float TRANSLATE_BY_Y_VALUE = 20f;

    @Test
    public void testTranslateTo() throws InterruptedException {
        translateTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateToWithDuration() throws InterruptedException {
        translateTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
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
        translateQuicklyTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_QUICK);
        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateQuicklyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateSlowlyTo() throws InterruptedException {
        translateSlowlyTo(view, TRANSLATE_TO_X_VALUE, TRANSLATE_TO_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_SLOW);
        assertEquals(TRANSLATE_TO_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_TO_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateSlowlyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateBy() throws InterruptedException {
        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateByWithDuration() throws InterruptedException {
        translateBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
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
        translateQuicklyBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_QUICK);
        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateQuicklyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testTranslateSlowlyBy() throws InterruptedException {
        translateSlowlyBy(view, TRANSLATE_BY_X_VALUE, TRANSLATE_BY_Y_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_SLOW);
        assertEquals(TRANSLATE_BY_X_VALUE, view.getTranslationX(), 0.1f);
        assertEquals(TRANSLATE_BY_Y_VALUE, view.getTranslationY(), 0.1f);
    }

    @Test
    public void testTranslateSlowlyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
