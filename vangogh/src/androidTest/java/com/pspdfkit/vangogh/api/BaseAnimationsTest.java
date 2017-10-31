package com.pspdfkit.vangogh.api;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import com.pspdfkit.vangogh.view.TestActivity;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public abstract class BaseAnimationsTest {

    /** Used for testing animations with custom duration. */
    protected static final long CUSTOM_TEST_DURATION_MS = 1300L;

    /** Activity rule for the {@link TestActivity} that holds the view to be animated. */
    @Rule public ActivityTestRule<TestActivity> activityRule = new ActivityTestRule<>(TestActivity.class);

    /** View being animated in tests. */
    @NonNull protected View view;

    /** Test observer used for catching all the events. */
    @NonNull protected TestObserver o;

    @Before
    public void setUp() {
        view = activityRule.getActivity().findViewById(com.pspdfkit.vangogh.test.R.id.view);
        o = new TestObserver();
    }

}
