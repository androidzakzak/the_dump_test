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
    private ImageView redTriagle;
    private ImageView redCircle;
    private ImageView yellowSquare;
    private ImageView yellowCircle;
    private ImageView blueTriagle;
    private ImageView redSquare;
    private ImageView blueCircle;
    int count;


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
if(count==0){
    count++;
}
                else {
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.redCircle:
                if(count==5 ){
                    count++;
                }
                else {
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.yellowSquare:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.yellowCircle:
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
                if(count==3 || count == 4){
                    count++;
                }
                else {
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.redSquare:
if(count==1 || count == 2){
    count++;
}
else {
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
}
                break;
            case R.id.blueCircle:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.tvLevel:
                if(count==7){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel19()).commit();
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
        }
    }
}
