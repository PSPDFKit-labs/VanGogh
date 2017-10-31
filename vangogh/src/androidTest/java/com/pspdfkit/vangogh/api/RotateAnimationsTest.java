package com.pspdfkit.vangogh.api;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.pspdfkit.vangogh.api.RotateAnimations.*;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class RotateAnimationsTest extends BaseAnimationsTest {

    private static final float ROTATE_TO_DEGREES = 230f;

    private static final float ROTATE_BY_DEGREES = 35f;

    @Test
    public void testRotateTo() throws InterruptedException {
        o.assertNotComplete();

        rotateTo(view, ROTATE_TO_DEGREES).subscribe(o);

        o.await(AnimationConstants.DURATION_DEFAULT / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * AnimationConstants.DURATION_DEFAULT, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    @Test
    public void testRotateToWithDuration() throws InterruptedException {
        o.assertNotComplete();

        rotateTo(view, ROTATE_TO_DEGREES, CUSTOM_TEST_DURATION_MS).subscribe(o);

        o.await(CUSTOM_TEST_DURATION_MS / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2 * CUSTOM_TEST_DURATION_MS, TimeUnit.SECONDS);
        o.assertComplete();

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

}
