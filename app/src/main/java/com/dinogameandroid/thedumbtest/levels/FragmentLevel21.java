package com.dinogameandroid.thedumbtest.levels;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel21 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    Vibrator vibe1;
    private TextView textView23;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level21, container, false);
       textView23 = (TextView)mRootView.findViewById(R.id.textView23);

        textView23.setOnClickListener(this);

        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel22()).commit();
            }
        }, 3000);
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
          case R.id.textView23:
              vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
              vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;




        }
    }
}
