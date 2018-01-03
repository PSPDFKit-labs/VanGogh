package com.example.vangogh.menu;

import android.app.Activity;
import android.support.annotation.NonNull;

public class MainMenuItem {

    @NonNull
    private final String title;

    @NonNull
    private final String desc;

    @NonNull
    private final Activity activity;

    public MainMenuItem(@NonNull String title, @NonNull String desc, @NonNull Activity activity) {
        this.title = title;
        this.desc = desc;
        this.activity = activity;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    @NonNull
    public String getDesc() {
        return desc;
    }

    @NonNull
    public Activity getActivity() {
        return activity;
    }

}
