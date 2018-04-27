package com.example.vangogh.samples;

import android.support.design.widget.FloatingActionButton;
import android.view.View;

import io.reactivex.functions.Consumer;

import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeIn;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeOut;

public class SingleFadeAnimationActivity extends SingleAnimationActivity {

    @Override
    protected void onFabClicked(final FloatingActionButton fab) {
        fadeOut(fab)
                .doOnAnimationStart(new Consumer<View>() {
                    @Override
                    public void accept(View view) throws Exception {
                        fab.setEnabled(false);
                    }
                })
                .doOnAnimationEnd(new Consumer<View>() {
                    @Override
                    public void accept(View view) throws Exception {
                        fab.setEnabled(true);
                    }
                })
                .andThen(fadeIn(fab))
                .subscribe();
    }

}
