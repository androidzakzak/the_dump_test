package com.dinogameandroid.thedumbtest.levels;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel9 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private Button buttonTrue;
    private Button buttonFalse2;
    private Button buttonFalse3;
    private Button buttonFalse4;
    Vibrator vibe1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level9, container, false);
        buttonTrue = (Button)mRootView.findViewById(R.id.buttonFalse5);
        buttonFalse2 = (Button)mRootView.findViewById(R.id.buttonFalse2);
        buttonFalse3 = (Button)mRootView.findViewById(R.id.buttonFalse3);
        buttonFalse4 = (Button)mRootView.findViewById(R.id.buttonFalse4);
        buttonTrue.setOnClickListener(this);
        buttonFalse2.setOnClickListener(this);
        buttonFalse3.setOnClickListener(this);
        buttonFalse4.setOnClickListener(this);

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
            case R.id.buttonFalse5:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(((GameActivity) getActivity()).getStrikes()==1){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel10()).commit();
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.buttonFalse2:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);

                if(((GameActivity) getActivity()).getStrikes()==2){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel10()).commit();
                }
                else{
                    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.buttonFalse3:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse4:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(((GameActivity) getActivity()).getStrikes()==0){
    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel10()).commit();
}
                else{
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }

                break;
        }
    }
}
