package com.example.teacher_app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.teacher_app.R;

public class Teacher_profile extends Fragment {
    TextView t_name,t_father_name,t_subjects,t_phone_no,t_blood_grp,t_address;



    public Teacher_profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_teacher_profile, container, false);
        t_address=view.findViewById(R.id.t_address);
        t_name=view.findViewById(R.id.t_name);
        t_father_name=view.findViewById(R.id.t_father_name);
        t_subjects=view.findViewById(R.id.t_subjects);
        t_blood_grp=view.findViewById(R.id.t_blood_grp);
        t_phone_no=view.findViewById(R.id.t_phone_no);





        return view;
    }
}