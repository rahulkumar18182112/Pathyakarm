package com.example.schoolproject.frag_student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.schoolproject.R;
import com.example.schoolproject.classforObjects.notifi_str_class;

import java.util.ArrayList;

public class notification_student extends Fragment {
    RecyclerView notifi_student_recycler;
    ArrayList<notifi_str_class> model_notifi=new ArrayList<>();


    public notification_student() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notification_student, container, false);


        notifi_student_recycler=view.findViewById(R.id.notifi_student_recycler);
        notifi_student_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));
        model_notifi.add(new notifi_str_class(2023-10-14,21-11-00,"here we will get the notifications from administration"));






        return view;
    }
}