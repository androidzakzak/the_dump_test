package com.dinogameandroid.thedumbtest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.levels.FragmentLevel1;
import com.dinogameandroid.thedumbtest.utils.GameInfo;

public class GameActivity extends AppCompatActivity {
    private GameInfo mGameInfo;
    private static int mLevel;
    private static int mStrikes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mLevel=1;
        mGameInfo=new GameInfo();
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel1()).commit();
        }
    }

    public int getLevel() {
        return mLevel;
    }

    public int getStrikes() {
        return mStrikes;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public void setStrikes(int strikes) {
        mStrikes =strikes;
        if(strikes==3){
            Intent intent=new Intent(this,ErrorActivity.class);
            startActivity(intent);
            mStrikes=0;
            finish();
        }
    }
    public void finaly(){
        Intent intent=new Intent(this,FinalActivity.class);
        startActivity(intent);
        mStrikes=0;
    }
    public void onClickError(View v) {
       setStrikes(getStrikes() + 1);
    }
}
