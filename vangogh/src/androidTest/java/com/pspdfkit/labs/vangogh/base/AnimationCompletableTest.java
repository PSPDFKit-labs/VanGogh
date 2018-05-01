package com.pspdfkit.labs.vangogh.base;

import android.support.annotation.NonNull;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.pspdfkit.labs.vangogh.api.BaseAnimationsTest;
import com.pspdfkit.labs.vangogh.rx.AnimationCompletable;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

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
    public void testDoOnAnimationReady() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view)
                .doOnAnimationReady(c)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
        o.awaitTerminalEvent();
        verify(c, times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationStart() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view)
                .doOnAnimationStart(c)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
        o.awaitTerminalEvent();
        verify(c, times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationCancel() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view)
                .doOnAnimationStart(new Consumer<View>() {
                    @Override
                    public void accept(View view) throws Exception {
                        o.dispose();
                    }
                })
                .doOnAnimationCancel(c)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
        o.awaitTerminalEvent();
        verify(c, timeout(2000).times(1)).accept(any(View.class));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDoOnAnimationEnd() throws Exception {
        Consumer<View> c = mock(Consumer.class);
        animate(view)
                .doOnAnimationEnd(c)
                .subscribe(o);
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
