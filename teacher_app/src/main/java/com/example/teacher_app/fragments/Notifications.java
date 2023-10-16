package com.example.teacher_app.fragments;

import static com.example.teacher_app.ClassesForObjects.notification_str_class.notifi_date;
import static com.example.teacher_app.ClassesForObjects.notification_str_class.notifi_time;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.Adapters.notifi_recycler_adapter;
import com.example.teacher_app.ClassesForObjects.notification_str_class;
import com.example.teacher_app.R;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Notifications extends Fragment {

    RecyclerView notifi_recycler;
    ArrayList<notification_str_class> model_notification=new ArrayList<>();

    public Notifications() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_notifications, container, false);

        notifi_recycler=view.findViewById(R.id.notifi_recycler);
        notifi_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        notifi_date= String.valueOf(Calendar.getInstance());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notifi_time= String.valueOf(LocalTime.now());
        }

        model_notification.add(new notification_str_class("12/06/18","7:00am","Here notification will be displayed which is send by the college/school administration"));
      model_notification.add(new notification_str_class(notifi_date,notifi_time,"tomarrow will be holiday"));
        model_notification.add(new notification_str_class(notifi_date,notifi_time,"Here notification will be displayed which is send by the college/school administration"));
        model_notification.add(new notification_str_class(notifi_date,notifi_time,"Here notification will be displayed which is send by the college/school administration"));
        model_notification.add(new notification_str_class(notifi_date,notifi_time,"Here notification will be displayed which is send by the college/school administration"));


        notifi_recycler_adapter adapter=new notifi_recycler_adapter(getContext(),model_notification);
        notifi_recycler.setAdapter(adapter);

        return view;
    }
}