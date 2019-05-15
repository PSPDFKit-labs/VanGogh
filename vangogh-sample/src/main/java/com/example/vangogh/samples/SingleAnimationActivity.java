package com.example.vangogh.samples;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vangogh.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public abstract class SingleAnimationActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_animation);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(v -> onFabClicked(fab));
    }

    protected abstract void onFabClicked(FloatingActionButton fab);

}
