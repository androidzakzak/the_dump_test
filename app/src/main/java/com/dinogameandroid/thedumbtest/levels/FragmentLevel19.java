package com.dinogameandroid.thedumbtest.levels;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel19 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private Button buttonTrue;
    private Button buttonFalse2;
    private Button buttonFalse3;
    private Button buttonFalse4;
    private Button buttonFalse5;
    private Button buttonFalse6;
    private Button buttonFalse7;
    private Button buttonFalse8;
    private Button buttonFalse9;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level19, container, false);
        buttonTrue = (Button)mRootView.findViewById(R.id.buttonTrue);
        buttonFalse2 = (Button)mRootView.findViewById(R.id.buttonFalse2);
        buttonFalse3 = (Button)mRootView.findViewById(R.id.buttonFalse3);
        buttonFalse4 = (Button)mRootView.findViewById(R.id.buttonFalse4);
        buttonFalse5 = (Button)mRootView.findViewById(R.id.buttonFalse5);
        buttonFalse6 = (Button)mRootView.findViewById(R.id.buttonFalse6);
        buttonFalse7 = (Button)mRootView.findViewById(R.id.buttonFalse7);
        buttonFalse8 = (Button)mRootView.findViewById(R.id.buttonFalse8);
        buttonFalse9 = (Button)mRootView.findViewById(R.id.buttonFalse9);
        buttonTrue.setOnClickListener(this);
        buttonFalse2.setOnClickListener(this);
        buttonFalse3.setOnClickListener(this);
        buttonFalse4.setOnClickListener(this);
        buttonFalse5.setOnClickListener(this);
        buttonFalse6.setOnClickListener(this);
        buttonFalse7.setOnClickListener(this);
        buttonFalse8.setOnClickListener(this);
        buttonFalse9.setOnClickListener(this);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonTrue:
                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel20()).commit();
                break;
            case R.id.buttonFalse2:
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse3:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse4:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse5:
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse6:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse7:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse8:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.buttonFalse9:
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;

        }
    }
}