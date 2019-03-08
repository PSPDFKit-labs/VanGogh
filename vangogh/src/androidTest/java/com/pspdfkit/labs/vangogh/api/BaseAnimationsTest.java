package com.pspdfkit.labs.vangogh.api;

import android.view.View;

import com.pspdfkit.labs.vangogh.view.TestActivity;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.TestObserver;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public abstract class BaseAnimationsTest {

    /** Used for testing animations with custom duration. */
    static final long CUSTOM_TEST_DURATION_MS = 1300L;

    /** Activity rule for the {@link TestActivity} that holds the view to be animated. */
    @Rule
    public ActivityScenarioRule<TestActivity> activityScenarioRule = new ActivityScenarioRule<>(TestActivity.class);

    /** View being animated in tests. */
    @NonNull
    protected View view;

    /** Test observer used for catching all the events. */
    @NonNull
    protected TestObserver o;

    @Before
    public void setUp() {
        activityScenarioRule.getScenario().onActivity(new ActivityScenario.ActivityAction<TestActivity>() {
            @Override
            public void perform(TestActivity activity) {
                view = activity.findViewById(com.pspdfkit.labs.vangogh.test.R.id.view);
            }
        });
        o = new TestObserver();
        o.assertNotSubscribed();
        o.assertNotComplete();
    }

    @After
    public void tearDown() {
        o.dispose();
        o = null;
    }

    /**
     * Tests that the test observer was completed after specified duration, but not before.
     * @param durationMs Duration in millis.
     */
    void assertTestObserverCompletedAfterDuration(long durationMs) throws InterruptedException {
        o.await(durationMs / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();
        // Sometimes the duration is too small of a number, so increase wait time to at least two seconds.
        o.awaitDone(2 * Math.max(durationMs, 1000L), TimeUnit.MILLISECONDS);
        o.assertComplete();
    }

}
