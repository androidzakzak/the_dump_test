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


public class FragmentLevel1 extends Fragment implements View.OnClickListener {
    private TextView tvLevel;
    private TextView tvStrikes;
    private TextView tvGoodClick;
    private TextView tvBadClick;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level1, container, false);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvGoodClick=(TextView)mRootView.findViewById(R.id.mTvGoodClick);
        tvBadClick=(TextView)mRootView.findViewById(R.id.mTvBadClick);
        tvBadClick.setOnClickListener(this);
        tvGoodClick.setOnClickListener(this);
        tvLevel.setText("" + ((GameActivity) getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mTvGoodClick:
                Vibrator vibe = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe.vibrate(20);
                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel2()).commit();
                break;
            case R.id.mTvBadClick:
                Vibrator vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
        }
    }
}
