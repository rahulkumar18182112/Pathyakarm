package com.example.schoolproject;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.schoolproject.frag_student.Result_fragment;
import com.example.schoolproject.frag_student.Routine_fragment;
import com.example.schoolproject.frag_student.diary_fragment;
import com.example.schoolproject.frag_student.home_fragment;
import com.example.schoolproject.frag_student.logout_fragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawer;
NavigationView navigation;
Toolbar toolbar_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer=findViewById(R.id.drawer);
        navigation=findViewById(R.id.navigation);
        toolbar_main=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar_main);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar_main,
                R.string.OpenDrawer,R.string.CloaseDrawer);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        loadFragment(new home_fragment(),true);

        navigation.setNavigationItemSelectedListener(item -> {
            int itemId=item.getItemId();
             if (itemId==R.id.Student_Routine) {


                loadFragment(new Routine_fragment(),false);
            }
            else if (itemId==R.id.Student_Diary) {
                loadFragment(new diary_fragment(),false);

            }else if (itemId==R.id.Student_Result) {
                loadFragment(new Result_fragment(),false);

            }else if (itemId==R.id.Student_Logout) {
                loadFragment(new logout_fragment(),false);

            }

            drawer.closeDrawer(GravityCompat.START);

            return true;
        });


    }

    @Override
    public void onBackPressed() {
        if(drawer.isOpen()){
            drawer.closeDrawer(GravityCompat.START);

        }else{
            super.onBackPressed();
        }

    }

    private void loadFragment(Fragment fragment,boolean flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        if(flag==true){
            ft.add(R.id.container,fragment);
        }else
        {
            ft.replace(R.id.container,fragment);
        }
        ft.commit();

    }
}