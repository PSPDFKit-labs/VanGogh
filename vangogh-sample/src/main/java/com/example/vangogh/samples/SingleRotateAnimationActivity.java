package com.example.vangogh.samples;

import android.support.design.widget.FloatingActionButton;
import android.view.View;

import io.reactivex.functions.Consumer;

import static com.pspdfkit.labs.vangogh.api.RotateAnimations.rotateBy;

public class SingleRotateAnimationActivity extends SingleAnimationActivity {

    @Override
    protected void onFabClicked(final FloatingActionButton fab) {
        rotateBy(fab, 360)
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
                .andThen(rotateBy(fab, -360))
                .subscribe();
    }
}
