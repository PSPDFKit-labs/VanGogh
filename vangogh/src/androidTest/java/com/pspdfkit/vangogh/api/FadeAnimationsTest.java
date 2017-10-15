package com.pspdfkit.vangogh.api;

import android.app.Activity;
import android.graphics.Color;
import android.support.test.InstrumentationRegistry;
import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import com.pspdfkit.vangogh.R;
import com.pspdfkit.vangogh.view.TestActivity;
import io.reactivex.observers.TestObserver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

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
    public void testFadeIn() {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(0f);
        FadeAnimations.fadeIn(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        Assert.assertEquals(1f, view.getAlpha(), 0f);
    }

    @Test
    public void testFadeOut() {
        // Init test observer.
        TestObserver o = new TestObserver();
        o.assertNotComplete();

        // Set view to visible and then fade out.
        view.setAlpha(1f);
        FadeAnimations.fadeOut(view).subscribe(o);

        // Wait for onComplete().
        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        // Assert view invisible.
        Assert.assertEquals(0f, view.getAlpha(), 0f);
    }

}
