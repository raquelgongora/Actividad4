package com.example.claselistviewactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClaseAdapter extends BaseAdapter {

    private ArrayList<ListViewitem> items;

    public ClaseAdapter(ArrayList<ListViewitem> items){
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ListViewitem getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater
                    .from(viewGroup.getContext())
                    .inflate(R.layout.listview_item,viewGroup, false);


        }
        decorateWith(view, items.get(i));
        return view;




    }

    private void decorateWith(View view, ListViewitem listViewItem) {
        ImageView imageView = view.findViewById(R.id.imageView2);
        TextView textView = view.findViewById(R.id.textView2);
        imageView.setImageResource(listViewItem.getImageResource());
        textView.setText(listViewItem.getTitle());
    }
}


