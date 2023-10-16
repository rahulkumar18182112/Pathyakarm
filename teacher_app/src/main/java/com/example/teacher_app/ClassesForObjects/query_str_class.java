package com.example.teacher_app.ClassesForObjects;

public class query_str_class {
    public static  String asked_date;
    public static  String asked_time;
    public static   String student_name;
    public static   String student_mail;
    public static    String student_class;
    public static   String asked_query;

    public String getAsked_date() {
        return asked_date;
    }

    public void setAsked_date(String asked_date) {
        this.asked_date = asked_date;
    }

    public String getAsked_time() {
        return asked_time;
    }

    public void setAsked_time(String asked_time) {
        this.asked_time = asked_time;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_mail() {
        return student_mail;
    }

    public void setStudent_mail(String student_mail) {
        this.student_mail = student_mail;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public String getAsked_query() {
        return asked_query;
    }

    public void setAsked_query(String student_query) {
        this.asked_query = student_query;
    }

    public query_str_class(String asked_date, String asked_time, String student_name, String student_mail, String student_class, String asked_query) {
        this.asked_date = asked_date;
        this.asked_time = asked_time;
        this.student_name = student_name;
        this.student_mail = student_mail;
        this.student_class = student_class;
        this.asked_query = asked_query;
    }


}
