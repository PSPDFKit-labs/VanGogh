package com.pspdfkit.vangogh.api;

import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.pspdfkit.vangogh.api.RotateAnimations.*;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class RotateAnimationsTest extends BaseAnimationsTest {

    private static final float ROTATE_TO_DEGREES = 230f;

    private static final float ROTATE_BY_DEGREES = 35f;

    private static final long TEST_DURATION_MS = 1300L;

    public void testRotateTo() throws InterruptedException {
        o.assertNotComplete();

        rotateTo(view, ROTATE_TO_DEGREES).subscribe(o);

        o.await(AnimationConstants.DURATION_DEFAULT / 2, TimeUnit.MILLISECONDS);
        o.assertNotComplete();

        o.awaitDone(2, TimeUnit.SECONDS);
        o.assertComplete();

        assertEquals(ROTATE_TO_DEGREES, view.getRotation(), 0.1f);
    }

    public void testRotateToWithDuration() {

    }

    public void testRotateToWithInterpolator() {

    }

    public void testRotateToWithDurationAndInterpolator() {

    }

}
