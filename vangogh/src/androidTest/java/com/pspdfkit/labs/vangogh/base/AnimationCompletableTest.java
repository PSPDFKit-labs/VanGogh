package com.pspdfkit.labs.vangogh.base;

import android.support.annotation.NonNull;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.pspdfkit.labs.vangogh.api.BaseAnimationsTest;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class AnimationCompletableTest extends BaseAnimationsTest {

    private static final long DEFAULT_DURATION = 1500L;

    @Test
    public void testAnimationCanceledOnDispose() throws InterruptedException {
        animate(view).subscribe(o);
        o.await(DEFAULT_DURATION / 2, TimeUnit.MILLISECONDS);
        o.dispose();
        o.assertNotComplete();

        // Check that animation is stopped, meaning the
        // property values are somewhere in-between.
        assertEquals(45f, view.getRotation(), 10f);
        assertEquals(15f, view.getTranslationX(), 5f);
        assertEquals(0.5f, view.getAlpha(), 0.2f);
    }

    @Test
    public void testDoOnAnimationReady() {

    }

    private AnimationCompletable animate(@NonNull View view) {
        return AnimationBuilder.forView(view)
                .rotation(90f)
                .translationX(30f)
                .alpha(0f)
                .duration(DEFAULT_DURATION)
                .buildCompletable();
    }

}
