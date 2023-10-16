package com.example.teacher_app.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.teacher_app.R;


public class Update_profile extends Fragment {
ImageView t_profile_pic;
EditText t_address,t_phone_no;
Button back_btn,update_t_profile_btn;



    public Update_profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_update_profile, container, false);

// findviewbyid section

        t_profile_pic=view.findViewById(R.id.t_profile_pic);
        t_phone_no=view.findViewById(R.id.t_phone_no);
        t_address=view.findViewById(R.id.t_address);
        back_btn=view.findViewById(R.id.back_btn);
        update_t_profile_btn=view.findViewById(R.id.update_t_profile_btn);





        Dialog dialog=new Dialog(getContext());
        dialog.setContentView(R.layout.dialog_box);
        EditText teacher_email=dialog.findViewById(R.id.teacher_email);
        Button no_btn=dialog.findViewById(R.id.no_btn);
        Button yes_btn=dialog.findViewById(R.id.yes_btn);

        no_btn.setOnClickListener(view14 -> dialog.dismiss());
        yes_btn.setOnClickListener(view13 -> {
            Intent i=new Intent(getContext(), Update_profile.class);
            startActivity(i);
            dialog.dismiss();
        });
        dialog.show();


        update_t_profile_btn.setOnClickListener(view12 -> {



        });

        back_btn.setOnClickListener(view1 -> returnToLastFragment());






        return view;
    }
    // this menthod will return the current fragment to the lastFragment while we tap on the back_btn
    private void returnToLastFragment() {
        // Use the FragmentManager to pop the last fragment from the back stack
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        fragmentManager.popBackStack();
    }
}