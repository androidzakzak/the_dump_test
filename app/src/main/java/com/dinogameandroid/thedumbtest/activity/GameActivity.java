package com.dinogameandroid.thedumbtest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.levels.FragmentLevel1;
import com.dinogameandroid.thedumbtest.utils.GameInfo;

public class GameActivity extends AppCompatActivity {
    private GameInfo mGameInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mGameInfo=new GameInfo();
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel1()).commit();
        }
    }

    public int getLevel() {
        return mGameInfo.getLevel();
    }

    public int getStrikes() {
        return mGameInfo.getLevel();
    }

    public void setLevel(int level) {
        mGameInfo.setLevel(level);
    }

    public void setStrikes(int strikes) {
        mGameInfo.setStrikes(strikes);
        if(strikes==3){
            Intent intent=new Intent(this,ErrorActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
