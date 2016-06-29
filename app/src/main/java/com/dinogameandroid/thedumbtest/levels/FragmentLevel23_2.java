package com.dinogameandroid.thedumbtest.levels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel23_2 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private ImageView buttonRed;
    private ImageView buttonBlue;
    private ImageView buttonGreen;
    private ImageView buttonYellow;
    private TextView button24;
    int count;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level_23_2, container, false);
        buttonRed = (ImageView) mRootView.findViewById(R.id.buttonRed);
        buttonBlue = (ImageView) mRootView.findViewById(R.id.buttonBlue);
        buttonGreen = (ImageView) mRootView.findViewById(R.id.buttonGreen);
        buttonYellow = (ImageView) mRootView.findViewById(R.id.buttonYellow);
        button24 = (TextView) mRootView.findViewById(R.id.button24);
        button24.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRed:

                break;
        }
    }
}
