package com.example.schoolproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Student_login extends AppCompatActivity {
    EditText UserName;
    EditText Password;
    Button loginbtn;
    TextView goto_regis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_login);
        UserName=findViewById(R.id.UserName);
        Password=findViewById(R.id.Password);
        loginbtn=findViewById(R.id.loginbtn);
        goto_regis=findViewById(R.id.goto_regis);
     /*   goto_regis.setOnClickListener(view -> {
            Intent i=new Intent(getApplicationContext(),Register_Activity.class);
            startActivity(i);
        });

      */

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userlogin();


                
            }

            private void userlogin() {

                String Email= UserName.getText().toString();
                String Password1=Password.getText().toString();

                if(Email.isEmpty()){
                    UserName.requestFocus();
                    UserName.setError("daal username");
                    return;
                }
                if(Password1.isEmpty()){
                    Password.requestFocus();
                    Password.setError("password glt h bhai");
                    return ;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                    UserName.requestFocus();
                    UserName.setError("Please enter the correct Email");
                    return;
                }


                Call<ResponseBody> call=Retrofitclient.getInstance().getApi().login(Email,Password1);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(@NonNull Call<ResponseBody> call, @NonNull Response<ResponseBody> response) {
                        ResponseBody loginResponse=response.body();

                        if(response.isSuccessful()){
                            assert loginResponse != null;
                            Toast.makeText(Student_login.this, loginResponse.toString(), Toast.LENGTH_SHORT).show();

                            Intent i=new Intent(getApplicationContext(), MainActivity.class);
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i);

                        }
                        assert loginResponse != null;
                        Toast.makeText(Student_login.this, loginResponse.toString(), Toast.LENGTH_SHORT).show();
                    }



                    @Override
                    public void onFailure(@NonNull Call<ResponseBody> call, @NonNull Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });


            }
        });





    }


}