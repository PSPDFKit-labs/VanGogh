package com.pspdfkit.labs.vangogh.api;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_DEFAULT;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_QUICK;
import static com.pspdfkit.labs.vangogh.api.AnimationConstants.DURATION_SLOW;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeIn;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeInQuickly;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeInSlowly;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeOut;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeOutQuickly;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeOutSlowly;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeToAlpha;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class FadeAnimationsTest extends BaseAnimationsTest {

    @Test
    public void testFadeIn() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeIn(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(1f, view.getAlpha(), 0f);
    }


    @Test
    public void testFadeInWithDuration() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeIn(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeInWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeInWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeInQuickly() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInQuickly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(DURATION_QUICK);
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeInQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeInSlowly() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInSlowly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(DURATION_SLOW);
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeInSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOut() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOut(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(AnimationConstants.DURATION_DEFAULT);
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeOutWithDuration() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOut(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeOutWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOutWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOutQuickly() throws Throwable {
        fadeOutQuickly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(DURATION_QUICK);
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeOutQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOutSlowly() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOutSlowly(view).subscribe(o);
        assertTestObserverCompletedAfterDuration(DURATION_SLOW);
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeOutSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeToAlpha() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeToAlpha(view, .7f).subscribe(o);
        assertTestObserverCompletedAfterDuration(DURATION_DEFAULT);
        assertEquals(.7f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeToAlphaWithDuration() throws Throwable {
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeToAlpha(view, .7f, CUSTOM_TEST_DURATION_MS).subscribe(o);
        assertTestObserverCompletedAfterDuration(CUSTOM_TEST_DURATION_MS);
        assertEquals(.7f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeToAlphaWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeToAlphaWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
