package com.example.teacher_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.ClassesForObjects.Routine_str_class;
import com.example.teacher_app.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Routine_recycler_adapter extends RecyclerView.Adapter<Routine_recycler_adapter.ViewHolder> {

    Context context;
    ArrayList<Routine_str_class> model_routine;

    public Routine_recycler_adapter(Context context, ArrayList<Routine_str_class> model_routine) {
        this.context = context;
        this.model_routine = model_routine;
    }

    @NonNull
    @Override
    public Routine_recycler_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.routine_list_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Routine_recycler_adapter.ViewHolder holder, int position) {
        holder.day_of_routine.setText(model_routine.get(position).getDay_of_class());
        holder.routine_class.setText(model_routine.get(position).getRoutine_class());
        holder.routine_sub.setText(model_routine.get(position).getRoutine_sub());
        holder.routine_time.setText(model_routine.get(position).getRoutine_time());
        holder.routine_date.setText(model_routine.get(position).getRoutine_date());
        holder.period_no.setText(model_routine.get(position).getPeriod_no());
        holder.teacher_name.setText(model_routine.get(position).getTeacher_name());

    }

    @Override
    public int getItemCount() {
        return model_routine.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView teacher_name;
        TextView routine_class;
        TextView routine_time;
        TextView routine_sub;
        TextView period_no;
        TextView day_of_routine;
        TextView routine_date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            teacher_name=itemView.findViewById(R.id.teacher_name);
            routine_class=itemView.findViewById(R.id.routine_class);
            routine_time=itemView.findViewById(R.id.routine_time);
            routine_sub=itemView.findViewById(R.id.routine_sub);
            routine_date=itemView.findViewById(R.id.routine_date);

            period_no=itemView.findViewById(R.id.period_no);
            day_of_routine=itemView.findViewById(R.id.day_of_class);



        }
    }
}
