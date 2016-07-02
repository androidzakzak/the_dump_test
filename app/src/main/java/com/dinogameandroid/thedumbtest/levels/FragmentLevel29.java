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

public class FragmentLevel29 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private ImageView buttonTrue1;
    private ImageView buttonTrue2;
    private ImageView buttonTrue3;
    private ImageView buttonTrue4;
    private ImageView buttonTrue5;
    Vibrator vibe1;
    int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level29, container, false);
        buttonTrue1 = (ImageView)mRootView.findViewById(R.id.buttonTrue1);
        buttonTrue2 = (ImageView)mRootView.findViewById(R.id.buttonTrue2);
        buttonTrue3 = (ImageView)mRootView.findViewById(R.id.buttonTrue3);
        buttonTrue4 = (ImageView)mRootView.findViewById(R.id.buttonTrue4);
        buttonTrue5 = (ImageView)mRootView.findViewById(R.id.buttonTrue5);

        buttonTrue1.setOnClickListener(this);
        buttonTrue2.setOnClickListener(this);
        buttonTrue3.setOnClickListener(this);
        buttonTrue4.setOnClickListener(this);
        buttonTrue5.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonTrue1:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==0){
                    count++;
                    buttonTrue1.setVisibility(View.INVISIBLE);
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.buttonTrue2:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==1){
                    count++;
                    buttonTrue2.setVisibility(View.INVISIBLE);
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.buttonTrue3:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==2){
                    count++;
                    buttonTrue3.setVisibility(View.INVISIBLE);
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.buttonTrue4:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==3){
                    count++;
                    buttonTrue4.setVisibility(View.INVISIBLE);
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }

                break;
            case R.id.buttonTrue5:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==4){
                    buttonTrue5.setVisibility(View.INVISIBLE);
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel30()).commit();
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;

        }
    }
}

