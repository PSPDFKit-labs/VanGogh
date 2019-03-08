package com.pspdfkit.labs.vangogh.api;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pspdfkit.labs.vangogh.api.RotateAnimations.*;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class RotateAnimationsTest extends BaseAnimationsTest {

    private static final float ROTATE_TO_DEGREES = 230f;

    private static final float ROTATE_BY_DEGREES = 90f;

    @Test
    public void testRotateTo() throws InterruptedException {
        rotateTo(view, ROTATE_TO_DEGREES).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateToWithDuration() throws InterruptedException {
        rotateTo(view, ROTATE_TO_DEGREES, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateToWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateQuicklyTo() throws InterruptedException {
        rotateQuicklyTo(view, ROTATE_TO_DEGREES).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_QUICK);
        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateQuicklyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateSlowlyTo() throws InterruptedException {
        rotateSlowlyTo(view, ROTATE_TO_DEGREES).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_SLOW);
        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateSlowlyToWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateBy() throws InterruptedException {
        rotateBy(view, ROTATE_BY_DEGREES).andThen(rotateBy(view, ROTATE_BY_DEGREES)).subscribe(o);
        assertTestObserverCompletedAfterDuration(2 * AnimationConstants.DURATION_DEFAULT);
        assertEquals(2 * ROTATE_BY_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateByWithDuration() throws InterruptedException {
        rotateBy(view, ROTATE_BY_DEGREES, CUSTOM_TEST_DURATION_MS).andThen(rotateBy(view, ROTATE_BY_DEGREES, CUSTOM_TEST_DURATION_MS)).subscribe(o);
        assertTestObserverCompletedAfterDuration(2 * CUSTOM_TEST_DURATION_MS);
        assertEquals(2 * ROTATE_BY_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateByWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateQuicklyBy() throws InterruptedException {
        rotateQuicklyBy(view, ROTATE_BY_DEGREES).andThen(rotateQuicklyBy(view, ROTATE_BY_DEGREES)).subscribe(o);
        assertTestObserverCompletedAfterDuration(2 * AnimationConstants.DURATION_QUICK);
        assertEquals(2 * ROTATE_BY_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateQuicklyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testRotateSlowlyBy() throws InterruptedException {
        rotateSlowlyBy(view, ROTATE_BY_DEGREES).andThen(rotateSlowlyBy(view, ROTATE_BY_DEGREES)).subscribe(o);
        assertTestObserverCompletedAfterDuration(2 * AnimationConstants.DURATION_SLOW);
        assertEquals(2 * ROTATE_BY_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateSlowlyByWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
