package com.example.teacher_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.ClassesForObjects.query_str_class;
import com.example.teacher_app.R;

import java.util.ArrayList;

public class asked_query_adapter extends RecyclerView.Adapter<asked_query_adapter.ViewHolder> {
    Context context;
    ArrayList<query_str_class> model_query;

    public asked_query_adapter(Context context, ArrayList<query_str_class> model_query) {
        this.context = context;
        this.model_query = model_query;
    }

    @NonNull
    @Override
    public asked_query_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.qna_recycler_design,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.asked_date.setText(model_query.get(position).getAsked_date());
        holder.asked_time.setText(model_query.get(position).getAsked_time());
        holder.asked_query.setText(model_query.get(position).getAsked_query());
        holder.student_name.setText(model_query.get(position).getStudent_name());
        holder.student_class.setText(model_query.get(position).getStudent_class());
        holder.student_mail.setText(model_query.get(position).getStudent_mail());

    }

    @Override
    public int getItemCount() {
        return model_query.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        TextView asked_date,asked_time,asked_query,student_name,student_mail,student_class;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            asked_date=itemView.findViewById(R.id.asked_date);
            asked_time=itemView.findViewById(R.id.asked_time);
            asked_query=itemView.findViewById(R.id.asked_query);
            student_class=itemView.findViewById(R.id.student_class);
            student_mail=itemView.findViewById(R.id.student_mail);
            student_name=itemView.findViewById(R.id.student_name);


        }
    }
}
