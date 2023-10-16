package com.example.schoolproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproject.R;
import com.example.schoolproject.classforObjects.notifi_str_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class notification_adapter extends RecyclerView.Adapter<notification_adapter.ViewHolder> {
    Context context;
    ArrayList<notifi_str_class> model_notifi;

    public notification_adapter(Context context, ArrayList<notifi_str_class> model_notifi) {
        this.context = context;
        this.model_notifi = model_notifi;
    }

    @NonNull
    @Override
    public notification_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.notification_design,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull notification_adapter.ViewHolder holder, int position) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as per your Date object
        String formattedDate = dateFormat.format(model_notifi.get(position).getNotifi_date());
        holder.notifi_date.setText(formattedDate);


        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // Adjust the format as per your Time object
        String formattedTime = timeFormat.format(model_notifi.get(position).getNotifi_time());
        holder.notifi_time.setText(formattedTime);
        holder.notifi_text_student.setText(model_notifi.get(position).getNotifi_text_student());

    }

    @Override
    public int getItemCount() {
        return model_notifi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView notifi_date;
        TextView notifi_time;
        TextView notifi_text_student;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            notifi_date=itemView.findViewById(R.id.notifi_date);
            notifi_time=itemView.findViewById(R.id.notifi_time);
            notifi_text_student=itemView.findViewById(R.id.notifi_text_student);
        }
    }
}
