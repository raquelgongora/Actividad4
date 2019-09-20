package com.example.claselistviewactivity;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewitem> provideItems(){
        ArrayList<ListViewitem> list = new ArrayList<>();

        list.add(new ListViewitem(R.drawable.android,"android", android.R.color.holo_green_dark));
        list.add(new ListViewitem(R.drawable.child_care,"child care", android.R.color.holo_blue_dark));
        list.add(new ListViewitem(R.drawable.direction_bike_,"directions bike", android.R.color.holo_blue_light));
        list.add(new ListViewitem(R.drawable.directions_subway,"direction subway", android.R.color.holo_green_light));
        list.add(new ListViewitem(R.drawable.airport,"local airport", android.R.color.holo_orange_dark));
        list.add(new ListViewitem(R.drawable.notifications_active,"notifications active", android.R.color.holo_orange_light));
        list.add(new ListViewitem(R.drawable.pan_tool,"pan tol", android.R.color.holo_red_dark));
        list.add(new ListViewitem(R.drawable.record_voice_over,"record voice over", android.R.color.holo_red_light));
        list.add(new ListViewitem(R.drawable.wb_sunny,"wb sunny", android.R.color.holo_purple));



        return list;
    }
}

