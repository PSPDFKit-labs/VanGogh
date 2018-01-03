package com.example.vangogh.menu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vangogh.R;

import java.util.ArrayList;

public class MainMenuAdapter extends ArrayAdapter<MainMenuItem> {

    private OnMainMenuItemClickListener listener;

    public MainMenuAdapter(@NonNull Context context, ArrayList<MainMenuItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final MainMenuItem item = getItem(position);
        if (item == null) return super.getView(position, convertView, parent);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_main_menu_item, parent, false);
        }

        TextView itemTitle = convertView.findViewById(R.id.itemTitle);
        TextView itemDesc = convertView.findViewById(R.id.itemDesc);

        itemTitle.setText(item.getTitle());
        itemDesc.setText(item.getDesc());

        LinearLayout itemLayout = convertView.findViewById(R.id.itemLayout);
        itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onMainMenuItemClicked(item);
                }
            }
        });

        return convertView;
    }

    public void setOnMainMenuItemClickListener(@Nullable OnMainMenuItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnMainMenuItemClickListener {
        void onMainMenuItemClicked(@NonNull MainMenuItem item);
    }

}
