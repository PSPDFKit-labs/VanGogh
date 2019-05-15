package com.example.vangogh.samples;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeIn;
import static com.pspdfkit.labs.vangogh.api.FadeAnimations.fadeOut;

public class SingleFadeAnimationActivity extends SingleAnimationActivity {

    @Override
    protected void onFabClicked(final FloatingActionButton fab) {
        fadeOut(fab)
                .doOnAnimationStart(view -> fab.setEnabled(false))
                .doOnAnimationEnd(view -> fab.setEnabled(true))
                .andThen(fadeIn(fab))
                .subscribe();
    }

}
