package com.example.vangogh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.vangogh.R;
import com.pspdfkit.vangogh.api.FadeAnimations;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.tv);

        FadeAnimations.fadeOut(textView1).andThen(FadeAnimations.fadeIn(textView1)).subscribe();
    }
}
