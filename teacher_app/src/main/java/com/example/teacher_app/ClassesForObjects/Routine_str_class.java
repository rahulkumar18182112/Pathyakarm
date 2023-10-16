package com.example.teacher_app.ClassesForObjects;

public class Routine_str_class {
    String teacher_name,routine_date,day_of_class,period_no, routine_class,routine_sub, routine_time;

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getRoutine_date() {
        return routine_date;
    }

    public void setRoutine_date(String routine_date) {
        this.routine_date = routine_date;
    }

    public String getDay_of_class() {
        return day_of_class;
    }

    public void setDay_of_class(String day_of_class) {
        this.day_of_class = day_of_class;
    }

    public String getPeriod_no() {
        return period_no;
    }

    public void setPeriod_no(String period_no) {
        this.period_no = period_no;
    }

    public String getRoutine_class() {
        return routine_class;
    }

    public void setRoutine_class(String routine_class) {
        this.routine_class = routine_class;
    }

    public String getRoutine_sub() {
        return routine_sub;
    }

    public void setRoutine_sub(String routine_sub) {
        this.routine_sub = routine_sub;
    }

    public String getRoutine_time() {
        return routine_time;
    }

    public void setRoutine_time(String routine_time) {
        this.routine_time = routine_time;
    }

    public Routine_str_class(String teacher_name, String routine_date, String day_of_class, String period_no, String routine_class, String routine_sub, String routine_time) {
        this.teacher_name = teacher_name;
        this.routine_date = routine_date;
        this.day_of_class = day_of_class;
        this.period_no = period_no;
        this.routine_class = routine_class;
        this.routine_sub = routine_sub;
        this.routine_time = routine_time;
    }
}
