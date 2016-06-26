package com.dinogameandroid.thedumbtest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.levels.FragmentLevel1;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel1()).commit();
        }
    }
}
