package com.dinogameandroid.thedumbtest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dinogameandroid.thedumbtest.R;

public class ErrorActivity extends AppCompatActivity implements View.OnClickListener{
private Button btnBackMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
        btnBackMenu=(Button)findViewById(R.id.btnBackMenu);
        btnBackMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackMenu:
                finish();
                break;
        }
    }
}
