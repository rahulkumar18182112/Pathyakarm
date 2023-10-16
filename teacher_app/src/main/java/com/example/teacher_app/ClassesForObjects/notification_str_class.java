package com.example.teacher_app.ClassesForObjects;

public class notification_str_class {
    public static String notifi_date;
    public static String notifi_time;

    public String getNotifi_date() {
        return notifi_date;
    }

    public void setNotifi_date(String notifi_date) {
        this.notifi_date = notifi_date;
    }

    public String getNotifi_time() {
        return notifi_time;
    }

    public void setNotifi_time(String notifi_time) {
        this.notifi_time = notifi_time;
    }

    public String getNotifi_text() {
        return notifi_text;
    }

    public void setNotifi_text(String notifi_text) {
        this.notifi_text = notifi_text;
    }

    public static String notifi_text;

    public notification_str_class(String notifi_date, String notifi_time, String notifi_text) {
        this.notifi_date = notifi_date;
        this.notifi_time = notifi_time;
        this.notifi_text = notifi_text;
    }
}
