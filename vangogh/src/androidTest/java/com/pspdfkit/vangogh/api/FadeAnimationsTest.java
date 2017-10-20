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

    @Test @UiThreadTest
    public void testFadeIn() {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(0f);
        fadeIn(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeInWithDuration() throws InterruptedException {
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(0f);
        fadeIn(view, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.await(duration + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeInWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeInWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeInQuick() throws InterruptedException {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(0f);
        fadeInQuick(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.await(DURATION_QUICK + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeInQuickWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeInSlow() throws InterruptedException {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(0f);
        fadeInSlow(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.await(DURATION_SLOW + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeInSlowWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeOut() {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(1f);
        fadeOut(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeOutWithDuration() throws InterruptedException {
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(1f);
        fadeOut(view, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.await(duration + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeOutWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeOutWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeOutQuick() throws InterruptedException {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(1f);
        fadeOutQuick(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_QUICK / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.await(DURATION_QUICK + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(0f, view.getAlpha(), 0f);

    }

    @Test @UiThreadTest
    public void testFadeOutQuickWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeOutSlow() throws InterruptedException {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(1f);
        fadeOutSlow(view).subscribe(o);

        // Wait half of duration and make sure it's not completed.
        o.await(DURATION_SLOW / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait more than needed duration and make sure it's completed.
        o.await(DURATION_SLOW + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeOutSlowWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeToAlpha() {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(.0f);
        fadeToAlpha(view, .7f).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(.7f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeToAlphaWithDuration() throws InterruptedException {
        final long duration = 1500L;

        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(.0f);
        fadeToAlpha(view, .7f, duration).subscribe(o);

        // Wait one second and make sure it's not completed.
        o.await(duration/2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        // Wait another second and make sure it's completed.
        o.await(duration + 500, TimeUnit.MILLISECONDS);
        o.assertComplete();

        // Assert view invisible.
        assertEquals(.7f, view.getAlpha(), 0f);
    }

    @Test @UiThreadTest
    public void testFadeToAlphaWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test @UiThreadTest
    public void testFadeToAlphaWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
