package com.example.vangogh.menu;

import android.app.Activity;
import android.support.annotation.NonNull;

public class MainMenuItem<T extends Activity> {

    @NonNull
    private final String title;

    @NonNull
    private final String desc;

    @NonNull
    private final Class<T> activityClass;

    public MainMenuItem(@NonNull String title, @NonNull String desc, @NonNull Class<T> activityClass) {
        this.title = title;
        this.desc = desc;
        this.activityClass = activityClass;
    }

    @NonNull
    String getTitle() {
        return title;
    }

    @NonNull
    String getDesc() {
        return desc;
    }

    @NonNull
    public Class<T> getActivityClass() {
        return activityClass;
    }

}
