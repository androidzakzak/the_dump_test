package com.dinogameandroid.thedumbtest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dinogameandroid.thedumbtest.R;

public class FinalActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBackMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        btnBackMenu=(Button)findViewById(R.id.btnBackMenu);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBackMenu:
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
