package com.example.teacher_app.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.Adapters.Routine_recycler_adapter;
import com.example.teacher_app.ClassesForObjects.Routine_str_class;
import com.example.teacher_app.R;

import java.util.ArrayList;

public class Routine extends Fragment {

    TextView teacher_name,routine_date,day_of_class,routine_sub,routine_class,routine_time,period_no;

    RecyclerView routine_recycler;
    ArrayList<Routine_str_class> model_routine =new ArrayList<>();




    public Routine() {
        // Required empty public constructor
    }



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_routine, container, false);


        routine_recycler=view.findViewById(R.id.routine_recycler);

        routine_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));
        model_routine.add(new Routine_str_class("Rahul kumar sir","12/12/2023","Monday","1","1","Mathematics","08:25"));


        Routine_recycler_adapter adapter=new Routine_recycler_adapter(getContext(),model_routine);
        routine_recycler.setAdapter(adapter);




        return view;

    }
}