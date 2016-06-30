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

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel11 extends Fragment implements View.OnClickListener{
    private TextView tvStrikes;
    private TextView tvLevel;
    private ImageView buttonTrue;
    private ImageView buttonTrue1;
    private ImageView buttonTrue3;
    private TextView textView12;
    boolean one;
    boolean two;
    Vibrator vibe1;
    int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level11, container, false);
        buttonTrue = (ImageView)mRootView.findViewById(R.id.buttonFalse4);
        buttonTrue.setOnClickListener(this);
        buttonTrue1 = (ImageView)mRootView.findViewById(R.id.buttonTrue1);
        buttonTrue1.setOnClickListener(this);
        buttonTrue3 = (ImageView)mRootView.findViewById(R.id.buttonTrue3);
        buttonTrue3.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        textView12=(TextView)mRootView.findViewById(R.id.textView12);
        tvLevel.setOnClickListener(this);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonFalse4: vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);

                if(count==12){
                    if(one){
                        ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                        tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                    }
buttonTrue.setImageDrawable(getResources().getDrawable(R.drawable.blue_circle1));
                    buttonTrue1.setVisibility(View.VISIBLE);
                    one = true;
                }
                else if(count==23){
                    if(two){
                        ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                        tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                    }
                    buttonTrue.setImageDrawable(getResources().getDrawable(R.drawable.red_circle));
                    buttonTrue3.setVisibility(View.VISIBLE);
                    two=true;
                }
                else if(count==25){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel12()).commit();
                }
                else {
                    buttonTrue.setVisibility(View.INVISIBLE);
                    buttonTrue.setVisibility(View.VISIBLE);
                    count++;
                    textView12.setText("" + count);
                }
                break;
            case R.id.buttonTrue1:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                buttonTrue1.setVisibility(View.INVISIBLE);
                count++;
                textView12.setText("" + count);
                buttonTrue.setImageDrawable(getResources().getDrawable(R.drawable.green_circle));
                break;
            case R.id.buttonTrue3:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                buttonTrue3.setVisibility(View.INVISIBLE);
                count++;
                textView12.setText("" + count);
                buttonTrue.setImageDrawable(getResources().getDrawable(R.drawable.green_circle));
                break;
        }
    }
}

