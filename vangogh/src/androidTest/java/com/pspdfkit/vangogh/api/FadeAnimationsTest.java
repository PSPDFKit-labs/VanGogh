package com.pspdfkit.vangogh.api;

import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import com.pspdfkit.vangogh.view.TestActivity;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.pspdfkit.vangogh.api.AnimationConstants.DURATION_QUICK;
import static com.pspdfkit.vangogh.api.AnimationConstants.DURATION_SLOW;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeIn;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeInQuick;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeInSlow;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOut;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOutQuick;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeOutSlow;
import static com.pspdfkit.vangogh.api.FadeAnimations.fadeToAlpha;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class FadeAnimationsTest {

    @Rule
    public ActivityTestRule<TestActivity> activityRule = new ActivityTestRule<>(TestActivity.class);

    private View view;

    @Before
    public void setUp() {
        view = activityRule.getActivity().findViewById(com.pspdfkit.vangogh.test.R.id.view);
    }

    @Test
    public void testFadeIn() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
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
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeIn(view, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(duration * 2, TimeUnit.MILLISECONDS);
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
    public void testFadeInQuick() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInQuick(view).subscribe(o);

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
    public void testFadeInQuickWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeInSlow() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeInSlow(view).subscribe(o);

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
    public void testFadeInSlowWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOut() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
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
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOut(view, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(duration * 2, TimeUnit.MILLISECONDS);
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
    public void testFadeOutQuick() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOutQuick(view).subscribe(o);

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
    public void testFadeOutQuickWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeOutSlow() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(1f);
            }
        });
        fadeOutSlow(view).subscribe(o);

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
    public void testFadeOutSlowWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testFadeToAlpha() throws Throwable {
        // Init test observer.
        TestObserver o = new TestObserver();
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
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        activityRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.setAlpha(0f);
            }
        });
        fadeToAlpha(view, .7f, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.awaitDone(2 * duration, TimeUnit.MILLISECONDS);
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
