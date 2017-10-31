package com.pspdfkit.vangogh.api;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.pspdfkit.vangogh.api.AnimationConstants.DURATION_QUICK;
import static com.pspdfkit.vangogh.api.AnimationConstants.DURATION_SLOW;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeIn;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeInQuickly;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeInSlowly;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOut;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOutQuickly;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOutSlowly;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeToAlpha;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class FadeAnimationsTest extends BaseAnimationsTest {

    @Test
    public void testFadeIn() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeIn(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(20, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(1f, view.getAlpha(), 0f);
            }
        });
    }


    @Test
    public void testFadeInWithDuration() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeIn(view, CUSTOM_TEST_DURATION_MS).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(CUSTOM_TEST_DURATION_MS * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(1f, view.getAlpha(), 0f);
            }
        });
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
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInQuickly(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.awaitDone(DURATION_QUICK * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(1f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeInQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeInSlowly() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInSlowly(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.awaitDone(DURATION_SLOW * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(1f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeInSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOut() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOut(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(0f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeOutWithDuration() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOut(view, CUSTOM_TEST_DURATION_MS).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(CUSTOM_TEST_DURATION_MS * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(0f, view.getAlpha(), 0f);
            }
        });
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
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOutQuickly(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.awaitDone(DURATION_QUICK * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(0f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeOutQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOutSlowly() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOutSlowly(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.awaitDone(DURATION_SLOW * 2, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(0f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeOutSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeToAlpha() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeToAlpha(view, .7f).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(.7f, view.getAlpha(), 0f);
            }
        });
    }

    @Test
    public void testFadeToAlphaWithDuration() throws Throwable {
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeToAlpha(view, .7f, CUSTOM_TEST_DURATION_MS).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(2 * CUSTOM_TEST_DURATION_MS, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                assertEquals(.7f, view.getAlpha(), 0f);
            }
        });
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
