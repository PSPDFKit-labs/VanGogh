package com.pspdfkit.labs.vangogh.base;

import android.support.annotation.NonNull;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.pspdfkit.labs.vangogh.api.BaseAnimationsTest;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

import static org.junit.Assert.assertNotEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(AndroidJUnit4.class)
public class AnimationCompletableTest extends BaseAnimationsTest {

    private static final long DEFAULT_DURATION = 1500L;

    @Test
    @SuppressWarnings("unchecked")
    public void testAnimationCanceledOnDispose() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view).doOnAnimationCancel(c).subscribeOn(AndroidSchedulers.mainThread()).subscribe(o);
        o.await((long) (0.5f * DEFAULT_DURATION), TimeUnit.MILLISECONDS);
        o.dispose();
        o.assertNotComplete();

        // Wait for animation cancel event to be called.
        verify(c, timeout(2000).times(1)).accept(any(View.class));

        // Check that animation is stopped, meaning the
        // property values are somewhere in-between.
        assertNotEquals(0f, view.getRotation());
        assertNotEquals(90f, view.getRotation());
        assertNotEquals(0f, view.getTranslationX());
        assertNotEquals(30f, view.getTranslationX());
        assertNotEquals(0f, view.getAlpha());
        assertNotEquals(1f, view.getAlpha());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationReady() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view).doOnAnimationReady(c).subscribeOn(AndroidSchedulers.mainThread()).subscribe(o);
        o.awaitTerminalEvent();
        verify(c, times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationStart() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view).doOnAnimationStart(c).subscribeOn(AndroidSchedulers.mainThread()).subscribe(o);
        o.awaitTerminalEvent();
        verify(c, times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationCancel() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view).doOnAnimationCancel(c).subscribeOn(AndroidSchedulers.mainThread()).subscribe(o);
        o.await((long) (0.5f * DEFAULT_DURATION), TimeUnit.MILLISECONDS);
        o.dispose();
        o.assertNotComplete();

        verify(c, timeout(2000).times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationEnd() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view).doOnAnimationEnd(c).subscribe(o);
        o.awaitTerminalEvent();
        verify(c, times(1)).accept(any(View.class));
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
