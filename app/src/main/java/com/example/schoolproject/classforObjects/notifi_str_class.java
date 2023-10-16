package com.example.schoolproject.classforObjects;

import java.sql.Time;
import java.util.Date;

public class notifi_str_class {
   Date notifi_date;
   Time notifi_time;

    public notifi_str_class(int i, int i1, String notifi_text_student) {
    }

    public Date getNotifi_date() {
        return notifi_date;
    }

    public void setNotifi_date(Date notifi_date) {
        this.notifi_date = notifi_date;
    }

    public Time getNotifi_time() {
        return notifi_time;
    }

    public void setNotifi_time(Time notifi_time) {
        this.notifi_time = notifi_time;
    }

    public String getNotifi_text_student() {
        return notifi_text_student;
    }

    public void setNotifi_text_student(String notifi_text_student) {
        this.notifi_text_student = notifi_text_student;
    }

    public notifi_str_class(Date notifi_date, Time notifi_time, String notifi_text_student) {
        this.notifi_date = notifi_date;
        this.notifi_time = notifi_time;
        this.notifi_text_student = notifi_text_student;
    }

    String notifi_text_student;
}
