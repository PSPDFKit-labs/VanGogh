package com.pspdfkit.labs.vangogh.api;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pspdfkit.labs.vangogh.api.ToastAnimations.*;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ToastAnimationsTest extends BaseAnimationsTest {

    @Test
    public void testShowAsToast() throws Throwable {
        showAsToast(view).subscribe(o);
        o.await();
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testShowAsToastWithDuration() throws Throwable {
        showAsToast(view, CUSTOM_TEST_DURATION_MS).subscribe(o);
        o.await();
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testShowAsToastWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testShowAsToastWithDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testShowAsToastQuickly() throws Throwable {
        showAsToastQuickly(view).subscribe(o);
        o.await();
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testShowAsToastQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testShowAsToastSlowly() throws Throwable {
        showAsToastSlowly(view).subscribe(o);
        o.await();
        assertEquals(0f, view.getAlpha(), 0f);
    }

    @Test
    public void testShowAsToastSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
