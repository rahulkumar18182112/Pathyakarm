package com.example.schoolproject.frag_student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.schoolproject.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class diary_fragment extends Fragment {

    TextView date;
    ListView list;
    ArrayList<String> arr=new ArrayList<>();

    public diary_fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_diary_fragment, container, false);

//current date setting to a textView *******************************************
        date=view.findViewById(R.id.date);
        String Date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        date.setText(Date);

        //**********************************************************************
        list = view.findViewById(R.id.list);
        arr.add("Mathematics");
        arr.add("Hindi");
        arr.add("English");
        arr.add("Social Studies");
        arr.add("Science");
        arr.add("Sanskrit");
        arr.add("Notice");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,arr);

        list.setAdapter(adapter);

     /*   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent=new Intent(getContext(),Mathematic_activity.class);
                    startActivity(intent);

                    Toast.makeText(getContext(), arr.get(i), Toast.LENGTH_SHORT).show();
                }
                else if (i==1){
                    Intent intent=new Intent(getContext(), Hindi_activity.class);
                    startActivity(intent);


                } else if (i==2) {
                    Intent intent=new Intent(getContext(), English_Activity.class);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(getContext(), sst_activity.class);
                    startActivity(intent);

                }
                else if(i==4){
                    Intent intent=new Intent(getContext(), Science_activity.class);
                    startActivity(intent);

                }else if(i==5){
                    Intent intent=new Intent(getContext(), Sanskrit_activity.class);
                    startActivity(intent);


                }else if(i==6){
                    Intent intent=new Intent(getContext(), Notice_activity.class);
                    startActivity(intent);
                }
            }
        });

      */

        return view;
    }


}