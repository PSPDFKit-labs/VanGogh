package com.pspdfkit.labs.vangogh.api;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import static com.pspdfkit.labs.vangogh.api.ShakeAnimations.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ShakeAnimationsTest extends BaseAnimationsTest {

    @Test
    public void testShake() throws InterruptedException {
        shake(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeWithDuration() throws InterruptedException {
        shake(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeWithDurationAndNumberOfShakes() throws InterruptedException {
        final float NUMBER_OF_SHAKES = 5;
        shake(view, CUSTOM_TEST_DURATION_MS, NUMBER_OF_SHAKES).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeQuickly() throws InterruptedException {
        shakeQuickly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeQuicklyWithDuration() throws InterruptedException {
        shakeQuickly(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeSlowly() throws InterruptedException {
        shakeSlowly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

    @Test
    public void testShakeSlowlyWithDuration() throws InterruptedException {
        shakeSlowly(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(0f, view.getTranslationX(), 0f);
    }

}
