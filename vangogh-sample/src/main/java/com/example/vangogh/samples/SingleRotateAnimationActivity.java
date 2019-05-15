package com.example.vangogh.samples;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.pspdfkit.labs.vangogh.api.RotateAnimations.rotateBy;

public class SingleRotateAnimationActivity extends SingleAnimationActivity {

    @Override
    protected void onFabClicked(final FloatingActionButton fab) {
        rotateBy(fab, 360)
                .doOnAnimationStart(view -> fab.setEnabled(false))
                .doOnAnimationEnd(view -> fab.setEnabled(true))
                .andThen(rotateBy(fab, -360))
                .subscribe();
    }
}
