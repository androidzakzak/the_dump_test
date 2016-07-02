package com.dinogameandroid.thedumbtest.levels;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel32 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private ImageView imageView;
    private Button button5;
    int count;
    int height=100;

    Vibrator vibe1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level32, container, false);
        imageView = (ImageView)mRootView.findViewById(R.id.imageView);
        button5 = (Button)mRootView.findViewById(R.id.button5);
        imageView.setOnClickListener(this);
        button5.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(height, height);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
imageView.setLayoutParams(layoutParams);
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
            case R.id.imageView:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                count++;
                height=height+15;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(height, height);
                layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
                layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                imageView.setLayoutParams(layoutParams);

                break;
            case R.id.button5:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==17){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel23()).commit();
                }
                else {
                    count=0;
                    height=100;
                    RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(height, height);
                    layoutParams1.addRule(RelativeLayout.CENTER_VERTICAL);
                    layoutParams1.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    imageView.setLayoutParams(layoutParams1);
                    ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }

                break;

        }
    }
}
