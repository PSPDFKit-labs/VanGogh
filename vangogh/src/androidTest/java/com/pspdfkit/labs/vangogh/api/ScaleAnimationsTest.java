package com.pspdfkit.labs.vangogh.api;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pspdfkit.labs.vangogh.api.ScaleAnimations.*;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ScaleAnimationsTest extends BaseAnimationsTest {

    private static final float SCALE_TO_VALUE = 0.8f;

    private static final float SCALE_BY_VALUE = 0.5f;

    @Test
    public void testScaleTo() throws InterruptedException {
        scaleTo(view, SCALE_TO_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(SCALE_TO_VALUE, view.getScaleX(), 0.1f);
        assertEquals(SCALE_TO_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleToWithDuration() throws InterruptedException {
        scaleTo(view, SCALE_TO_VALUE, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(SCALE_TO_VALUE, view.getScaleX(), 0.1f);
        assertEquals(SCALE_TO_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleToWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleQuicklyTo() throws InterruptedException {
        scaleQuicklyTo(view, SCALE_TO_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_QUICK);
        assertEquals(SCALE_TO_VALUE, view.getScaleX(), 0.1f);
        assertEquals(SCALE_TO_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleQuicklyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleSlowlyTo() throws InterruptedException {
        scaleSlowlyTo(view, SCALE_TO_VALUE).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_SLOW);
        assertEquals(SCALE_TO_VALUE, view.getScaleX(), 0.1f);
        assertEquals(SCALE_TO_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleSlowlyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleBy() throws InterruptedException {
        scaleBy(view, SCALE_BY_VALUE).andThen(scaleBy(view, SCALE_BY_VALUE)).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT * 2);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleX(), 0.1f);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleByWithDuration() throws InterruptedException {
        scaleBy(view, SCALE_BY_VALUE, CUSTOM_TEST_DURATION_MS).andThen(scaleBy(view, SCALE_BY_VALUE, CUSTOM_TEST_DURATION_MS)).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS * 2);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleX(), 0.1f);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleByWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleQuicklyBy() throws InterruptedException {
        scaleQuicklyBy(view, SCALE_BY_VALUE).andThen(scaleQuicklyBy(view, SCALE_BY_VALUE)).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_QUICK * 2);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleX(), 0.1f);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleQuicklyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testScaleSlowlyBy() throws InterruptedException {
        scaleSlowlyBy(view, SCALE_BY_VALUE).andThen(scaleSlowlyBy(view, SCALE_BY_VALUE)).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_SLOW * 2);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleX(), 0.1f);
        assertEquals(1 + 2 * SCALE_BY_VALUE, view.getScaleY(), 0.1f);
    }

    @Test
    public void testScaleSlowlyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
