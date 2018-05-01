package com.example.vangogh;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vangogh.menu.MainMenuAdapter;
import com.example.vangogh.menu.MainMenuItem;
import com.example.vangogh.samples.SingleFadeAnimationActivity;
import com.example.vangogh.samples.SingleRotateAnimationActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainMenuAdapter.OnMainMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mainMenuList = findViewById(R.id.mainMenu);

        MainMenuAdapter adapter = new MainMenuAdapter(this, getMainMenuItems());
        adapter.setOnMainMenuItemClickListener(this);
        mainMenuList.setAdapter(adapter);
    }

    @Override
    public void onMainMenuItemClicked(@NonNull MainMenuItem item) {
        startActivity(new Intent(this, item.getActivityClass()));
    }

    @NonNull
    public List<MainMenuItem> getMainMenuItems() {
        List<MainMenuItem> items = new ArrayList<>();
        items.add(new MainMenuItem("Fade animation", "Showcases the fade in/out animation", SingleFadeAnimationActivity.class));
        items.add(new MainMenuItem("Rotate animation", "Showcases the rotation animation", SingleRotateAnimationActivity.class));
        return items;
    }

}
