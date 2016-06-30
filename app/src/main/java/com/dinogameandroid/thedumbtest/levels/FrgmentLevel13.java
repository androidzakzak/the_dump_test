package com.dinogameandroid.thedumbtest.levels;


import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FrgmentLevel13 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private TextView buttonTrue;
    private TextView buttonTrue1;
    private TextView buttonFalse2;
    private TextView buttonFalse3;
    private TextView buttonFalse4;
    private TextView buttonFalse1;
    Vibrator vibe1;
    private TextView buttonFalse5;
    private TextView buttonFalse6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level13, container, false);
        buttonTrue = (TextView)mRootView.findViewById(R.id.buttonFalse4);
        buttonTrue1 = (TextView)mRootView.findViewById(R.id.buttonTrue1);
        buttonFalse1 = (TextView)mRootView.findViewById(R.id.buttonFalse1);
        buttonFalse2 = (TextView)mRootView.findViewById(R.id.buttonFalse2);
        buttonFalse3 = (TextView)mRootView.findViewById(R.id.buttonFalse3);
        buttonFalse4 = (TextView)mRootView.findViewById(R.id.buttonTrue);
        buttonFalse5 = (TextView)mRootView.findViewById(R.id.buttonFalse5);
        buttonFalse6 = (TextView)mRootView.findViewById(R.id.buttonFalse6);
        buttonTrue.setOnClickListener(this);
        buttonTrue1.setOnClickListener(this);
        buttonFalse2.setOnClickListener(this);
        buttonFalse3.setOnClickListener(this);
        buttonFalse4.setOnClickListener(this);
        buttonFalse1.setOnClickListener(this);
        buttonFalse5.setOnClickListener(this);
        buttonFalse6.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonFalse4:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel14()).commit();
                break;
            case R.id.buttonTrue1:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel14()).commit();
                break;
            case R.id.buttonFalse2:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse3:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonTrue:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse1:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse5:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse6:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;

        }
    }
}
