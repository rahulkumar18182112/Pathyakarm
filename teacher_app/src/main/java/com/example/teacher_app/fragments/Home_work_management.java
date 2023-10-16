package com.example.teacher_app.fragments;

import static android.R.layout.simple_spinner_dropdown_item;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.teacher_app.R;

import java.util.ArrayList;


public class Home_work_management extends Fragment {


    Spinner class_spinner,subject_spinner;
    EditText homework_task;
    Button hw_update_btn;

    ArrayList<String> arr_subject=new ArrayList<>();
    ArrayList<Integer> arr_class=new ArrayList<>();

    public Home_work_management() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_work_management, container, false);
        class_spinner=view.findViewById(R.id.class_spinner);
        subject_spinner=view.findViewById(R.id.subject_spinner);
        homework_task=view.findViewById(R.id.homework_task);
        hw_update_btn=view.findViewById(R.id.hw_update_btn);
// Adding class to the Arraylist of class


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
        // Adding Subjects to Spinner arraylist

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

// adding adapter to the subject Spinner
        ArrayAdapter<String> subject_addapter=new ArrayAdapter<>(getContext(), simple_spinner_dropdown_item,arr_subject);
        subject_spinner.setAdapter(subject_addapter);

// adding adapter to the class Spinner

        ArrayAdapter<Integer> class_addapter=new ArrayAdapter<>(getContext(), simple_spinner_dropdown_item,arr_class);
        class_spinner.setAdapter(class_addapter);

        // Setting up set on clickListerner

        subject_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = subject_spinner.getSelectedItem().toString();
                Toast.makeText(getContext(), selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });

        // Setting up set on clickListerner on class_spinner

        class_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int selectedItem = arr_class.get(position);
                Toast.makeText(getContext(), String.valueOf(selectedItem), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });
        hw_update_btn.setOnClickListener(view1 -> Toast.makeText(getContext(), "Homework Updated", Toast.LENGTH_SHORT).show());


        return  view;
    }
    }
