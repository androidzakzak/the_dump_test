package com.dinogameandroid.thedumbtest.levels;


import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
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
    private ImageView redTriagle;
    private ImageView redCircle;
    private ImageView yellowSquare;
    private ImageView yellowCircle;
    private ImageView blueTriagle;
    private ImageView redSquare;
    private ImageView blueCircle;
    int count;
    Vibrator vibe1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level_23_2, container, false);
        redTriagle = (ImageView) mRootView.findViewById(R.id.redTriagle);
        redCircle = (ImageView) mRootView.findViewById(R.id.redCircle);
        yellowSquare = (ImageView) mRootView.findViewById(R.id.yellowSquare);
        yellowCircle = (ImageView) mRootView.findViewById(R.id.yellowCircle);
        blueTriagle = (ImageView) mRootView.findViewById(R.id.blueTriagle);
        redSquare = (ImageView) mRootView.findViewById(R.id.redSquare);
        blueCircle = (ImageView) mRootView.findViewById(R.id.blueCircle);

        redTriagle.setOnClickListener(this);
        redCircle.setOnClickListener(this);
        yellowSquare.setOnClickListener(this);
        yellowCircle.setOnClickListener(this);
        blueTriagle.setOnClickListener(this);
        redSquare.setOnClickListener(this);
        blueCircle.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvLevel.setOnClickListener(this);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.redTriagle:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(count==0){
    count++;
}
                else {
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.redCircle:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==5 ){
                    count++;
                }
                else {
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.yellowSquare:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.yellowCircle:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==6){
                    count++;
                    tvLevel.setText("24");
                }
                else {
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.blueTriagle:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==3 || count == 4){
                    count++;
                }
                else {
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.redSquare:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(count==1 || count == 2){
    count++;
}
else {
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
}
                break;
            case R.id.blueCircle:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.tvLevel:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==7){
                    ((GameActivity) getActivity()).finaly();

                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
        }
    }
}
