package com.example.teacher_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.teacher_app.fragments.Attendence;
import com.example.teacher_app.fragments.Diary;
import com.example.teacher_app.fragments.Home_work_management;
import com.example.teacher_app.fragments.Notifications;
import com.example.teacher_app.fragments.QnA;
import com.example.teacher_app.fragments.Result_management;
import com.example.teacher_app.fragments.Routine;
import com.example.teacher_app.fragments.Teacher_profile;
import com.example.teacher_app.fragments.Update_profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer_teacher;
    NavigationView navigation;
    FrameLayout container_teacher;

    BottomNavigationView bottom_navi_bar;
    Toolbar toolbar_main_teacher;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer_teacher=findViewById(R.id.drawer_teacher);
        navigation=findViewById(R.id.navigation);
        toolbar_main_teacher=findViewById(R.id.toolbar_main_teacher);
        bottom_navi_bar=findViewById(R.id.bottom_navi_bar);
        container_teacher=findViewById(R.id.container_teacher);

        setSupportActionBar(toolbar_main_teacher);
      // abi abi add kra h maine ise
        toolbar_main_teacher.getMenu();

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer_teacher,toolbar_main_teacher,
                R.string.OpenDrawer,R.string.CloaseDrawer);
        drawer_teacher.addDrawerListener(toggle);
        toggle.syncState();
        LoadFragment(new Teacher_profile(),true);

        navigation.setNavigationItemSelectedListener(item -> {
            int itemId=item.getItemId();

            if(itemId==R.id.class_attendence){

                Toast.makeText(this, "This feature is in progress sonn it will come", Toast.LENGTH_SHORT).show();
            } else if (itemId==R.id.diary_management) {
                LoadFragment(new Diary(),false);

            } else if (itemId==R.id.Student_Result) {
                LoadFragment(new Result_management(),false);

            }else if (itemId==R.id.Update_teacher_profile) {

                LoadFragment(new Update_profile(),false);
            } else if (itemId==R.id.teacher_Logout) {
                AlertDialog.Builder alertdialog=new AlertDialog.Builder(getApplicationContext());

                alertdialog.setIcon(R.drawable.baseline_android_24)
                .setTitle("Logout")
                        .setMessage("Are you sure, You want to Logout")
                        .setPositiveButton("Yes", (dialogInterface, i) -> finishAffinity()).setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss());

            }
            drawer_teacher.closeDrawer(GravityCompat.START);

            return false;
        });

// coding for bottom Navigation
        bottom_navi_bar.setOnItemSelectedListener(item -> {
            int itemId=item.getItemId();

            if(itemId==R.id.routine){
                LoadFragment(new Routine(),false);
            }else if(itemId==R.id.homework){
                LoadFragment(new Home_work_management(),false);

            } else if (itemId==R.id.notifications_teacher) {
                LoadFragment(new Notifications(),false);

            } else if (itemId==R.id.qna_teacher) {
                LoadFragment(new QnA(),false);

            }



            return false;
        });






    }

    private void LoadFragment(Fragment fragment, Boolean flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        if(flag){
            ft.add(R.id.container_teacher,fragment);
        }else
        {
            ft.replace(R.id.container_teacher,fragment);
        }
        ft.commit();

    }







    }
