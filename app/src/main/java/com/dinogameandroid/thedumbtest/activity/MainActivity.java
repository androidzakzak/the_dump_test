package com.dinogameandroid.thedumbtest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dinogameandroid.thedumbtest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart=(Button)findViewById(R.id.btn_start);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start:
                Intent intent=new Intent(this,GameActivity.class);
                startActivity(intent);
                break;
        }
    }
}
