package com.example.teacher_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.Adapters.asked_query_adapter;
import com.example.teacher_app.ClassesForObjects.query_str_class;
import com.example.teacher_app.R;

import java.util.ArrayList;


public class QnA extends Fragment {

RecyclerView qna_recycler;
ArrayList<query_str_class> model_query=new ArrayList<>();
    public QnA() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_qn_a, container, false);

        qna_recycler=view.findViewById(R.id.qna_recycler);
        qna_recycler.setLayoutManager(new LinearLayoutManager(getContext()));


        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rakesh kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahulllll kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rmaul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rl kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));
        model_query.add(new query_str_class("2023/12/21","8:30am","Rahul kumar","rahul@gmail.com","4","sir i wan to know about the books that you have yold aus in the last class cn you please send me the names  of that"));


        asked_query_adapter adapter=new asked_query_adapter(getContext(),model_query);
        qna_recycler.setAdapter(adapter);














        return view;
    }
}