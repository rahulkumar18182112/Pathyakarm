package com.example.schoolproject.frag_student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.schoolproject.R;


public class Ask_doubt extends Fragment {
       Spinner teacher_spinner;
       EditText doubt_query;
       Button ask_doubt_btn;


    public Ask_doubt() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ask_doubt, container, false);
        teacher_spinner=view.findViewById(R.id.teacher_spinner);
        doubt_query=view.findViewById(R.id.doubt_query);
        ask_doubt_btn=view.findViewById(R.id.ask_doubt_btn);

        ask_doubt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=doubt_query.getText().toString();
                
            }
        });
        return  view;
    }
}