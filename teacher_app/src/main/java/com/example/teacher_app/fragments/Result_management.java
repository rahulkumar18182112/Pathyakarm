package com.example.teacher_app.fragments;

import static android.R.layout.simple_spinner_dropdown_item;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.teacher_app.R;

import java.util.ArrayList;


public class Result_management extends Fragment {
    Spinner class_spinner,subject_spinner;
    EditText student_mail,test_marks;
    Button update_marks_btn;

ArrayList<Integer> arr_class=new ArrayList<>();
ArrayList<String> arr_subject=new ArrayList<>();
    public Result_management() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_result_management, container, false);
        class_spinner=view.findViewById(R.id.class_spinner);
        subject_spinner=view.findViewById(R.id.subject_spinner);
        student_mail=view.findViewById(R.id.student_mail);
        test_marks=view.findViewById(R.id.test_marks);
        update_marks_btn=view.findViewById(R.id.update_marks_btn);



        arr_class.add(1);
        arr_class.add(2);
        arr_class.add(3);
        arr_class.add(4);
        arr_class.add(5);
        arr_class.add(6);
        arr_class.add(7);
        arr_class.add(8);
        arr_class.add(9);
        arr_class.add(10);



// subject_spinner content
        arr_subject.add("Hindi");
        arr_subject.add("English");
        arr_subject.add("Mathematics");
        arr_subject.add("Sanskrit");
        arr_subject.add("Vayakaran");
        arr_subject.add("Grammer");
        arr_subject.add("History");
        arr_subject.add("Science");
        arr_subject.add("Social Studies");
        arr_subject.add("Geography");
        arr_subject.add("Economics");
        arr_subject.add("Chemistry");
        arr_subject.add("Biology");
        arr_subject.add("Physics");
        arr_subject.add("Drawing");
        arr_subject.add("Physical Education");


        ArrayAdapter<Integer> class_addapter=new ArrayAdapter<>(getContext(), simple_spinner_dropdown_item,arr_class);
        class_spinner.setAdapter(class_addapter);


        ArrayAdapter<String> subject_addapter=new ArrayAdapter<>(getContext(), simple_spinner_dropdown_item,arr_subject);
        subject_spinner.setAdapter(subject_addapter);


        update_marks_btn.setOnClickListener(view1 -> {
            // here all the coding will be done from getting the text from the edit text to pass it to the api and update the marks...

            Toast.makeText(getContext(), "Updated successfully", Toast.LENGTH_SHORT).show();
        });



        return view;
    }
}