package com.example.teacher_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teacher_app.ClassesForObjects.notification_str_class;
import com.example.teacher_app.R;

import java.util.ArrayList;

public class notifi_recycler_adapter extends RecyclerView.Adapter<notifi_recycler_adapter.ViewHolder> {
    Context context;
    ArrayList<notification_str_class> model_notification;


    public notifi_recycler_adapter(Context context, ArrayList<notification_str_class> model_notification) {
        this.context = context;
        this.model_notification = model_notification;
    }



    @NonNull
    @Override
    public notifi_recycler_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.notifi_design,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull notifi_recycler_adapter.ViewHolder holder, int position) {
        holder.notifi_date.setText(model_notification.get(position).getNotifi_date());
        holder.notifi_time.setText(model_notification.get(position).getNotifi_time());
        holder.notifi_text.setText(model_notification.get(position).getNotifi_text());

    }

    @Override
    public int getItemCount() {
        return model_notification.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView notifi_date;
        TextView notifi_time;
        TextView notifi_text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            notifi_date=itemView.findViewById(R.id.notifi_date);
            notifi_time=itemView.findViewById(R.id.notifi_time);
            notifi_text=itemView.findViewById(R.id.notifi_text);

        }
    }
}
