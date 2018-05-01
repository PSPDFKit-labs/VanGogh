package com.pspdfkit.labs.vangogh.api;

import android.support.test.runner.AndroidJUnit4;

import static com.pspdfkit.labs.vangogh.api.SpinAnimations.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SpinAnimationsTest extends BaseAnimationsTest {

    private static float ONE_SPIN_DEGREES = 360f;

    private static final int CUSTOM_NUMBER_OF_CYCLES = 10;

    @Test
    public void testSpinRight() throws InterruptedException {
        spinRight(view).subscribe(o);
        o.await();
        assertEquals(ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_DEFAULT, view.getRotation(), 0f);
    }

    @Test
    public void testSpinRightWithCycles() throws InterruptedException {
        spinRight(view, CUSTOM_NUMBER_OF_CYCLES).subscribe(o);
        o.await();
        assertEquals(ONE_SPIN_DEGREES * CUSTOM_NUMBER_OF_CYCLES, view.getRotation(), 0f);
    }

    @Test
    public void testSpinRightWithCyclesAndDuration() throws InterruptedException {
        spinRight(view, CUSTOM_NUMBER_OF_CYCLES, CUSTOM_TEST_DURATION_MS).subscribe(o);
        o.await();
        assertEquals(ONE_SPIN_DEGREES * CUSTOM_NUMBER_OF_CYCLES, view.getRotation(), 0f);
    }

    @Test
    public void testSpinRightWithCyclesAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinRightWithCyclesDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinRightQuickly() throws InterruptedException {
        spinRightQuickly(view).subscribe(o);
        o.await();
        assertEquals(ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_QUICK, view.getRotation(), 0f);
    }

    @Test
    public void testSpinRightQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinRightSlowly() throws InterruptedException {
        spinRightSlowly(view).subscribe(o);
        o.await();
        assertEquals(ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_SLOW, view.getRotation(), 0f);
    }

    @Test
    public void testSpinRightSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinLeft() throws InterruptedException {
        spinLeft(view).subscribe(o);
        o.await();
        assertEquals(-ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_DEFAULT, view.getRotation(), 0f);
    }

    @Test
    public void testSpinLeftWithCycles() throws InterruptedException {
        spinLeft(view, CUSTOM_NUMBER_OF_CYCLES).subscribe(o);
        o.await();
        assertEquals(-ONE_SPIN_DEGREES * CUSTOM_NUMBER_OF_CYCLES, view.getRotation(), 0f);
    }

    @Test
    public void testSpinLeftWithCyclesAndDuration() throws InterruptedException {
        spinLeft(view, CUSTOM_NUMBER_OF_CYCLES, CUSTOM_TEST_DURATION_MS).subscribe(o);
        o.await();
        assertEquals(-ONE_SPIN_DEGREES * CUSTOM_NUMBER_OF_CYCLES, view.getRotation(), 0f);
    }

    @Test
    public void testSpinLeftWithCyclesAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinLeftWithCyclesDurationAndInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinLeftQuickly() throws InterruptedException {
        spinLeftQuickly(view).subscribe(o);
        o.await();
        assertEquals(-ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_QUICK, view.getRotation(), 0f);
    }

    @Test
    public void testSpinLeftQuicklyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

    @Test
    public void testSpinLeftSlowly() throws InterruptedException {
        spinLeftSlowly(view).subscribe(o);
        o.await();
        assertEquals(-ONE_SPIN_DEGREES * SPIN_CYCLES_PER_ANIM_SLOW, view.getRotation(), 0f);
    }

    @Test
    public void testSpinLeftSlowlyWithInterpolator() {
        // TODO Find a way to test interpolator.
    }

}
