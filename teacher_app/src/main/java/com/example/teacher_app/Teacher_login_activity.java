package com.example.teacher_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Teacher_login_activity extends AppCompatActivity {
    EditText teacher_email,teacher_password;
    Button teacher_login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        teacher_login_btn=findViewById(R.id.teacher_login_btn);
        teacher_email=findViewById(R.id.teacher_email);
        teacher_password=findViewById(R.id.teacher_password);

        teacher_login_btn.setOnClickListener(view -> {
            String mail=teacher_email.getText().toString();
            String password=teacher_password.getText().toString();

        });
    }
}