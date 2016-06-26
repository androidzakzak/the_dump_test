package com.dinogameandroid.thedumbtest.levels;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

/**
 * Created by notebook on 26.06.2016.
 */
public class FragmentLevel2 extends Fragment {
    private TextView tvLevel;
    private TextView tvStrikes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level2, container, false);
        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }
}
