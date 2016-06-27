package com.dinogameandroid.thedumbtest.levels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;
import com.dinogameandroid.thedumbtest.utils.MyAnimation;

public class FragmentLevel4 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private ImageView buttonTrue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level4, container, false);
        buttonTrue=(ImageView)mRootView.findViewById(R.id.buttonTrue);
        buttonTrue.setOnClickListener(this);
        Animation anim = new MyAnimation(buttonTrue, 150);
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(700);
        buttonTrue.startAnimation(anim);
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
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel5()).commit();
                break;

        }
    }
}
