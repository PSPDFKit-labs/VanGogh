package com.example.vangogh;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vangogh.menu.MainMenuAdapter;
import com.example.vangogh.menu.MainMenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainMenuAdapter.OnMainMenuItemClickListener {

    private ListView mainMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainMenuList = findViewById(R.id.mainMenu);

        MainMenuAdapter adapter = new MainMenuAdapter(this, new ArrayList<MainMenuItem>());
        mainMenuList.setAdapter(adapter);
    }

    @Override
    public void onMainMenuItemClicked(@NonNull MainMenuItem item) {
        startActivity(new Intent(this, item.getActivity().getClass()));
    }

}
