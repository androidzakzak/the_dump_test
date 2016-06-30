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

public class FragmentLevel27 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private ImageView arrowTop;
    private ImageView arrowBottom;
    private ImageView arrowLeft;
    private ImageView arrowRight;
    private TextView tvText;
    Vibrator vibe1;
    int count;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level27, container, false);
        arrowTop = (ImageView)mRootView.findViewById(R.id.arrowTop);
        arrowBottom = (ImageView)mRootView.findViewById(R.id.arrowBottom);
        arrowLeft = (ImageView)mRootView.findViewById(R.id.arrowLeft);
        arrowRight = (ImageView)mRootView.findViewById(R.id.arrowRight);
        tvText = (TextView)mRootView.findViewById(R.id.tvText);

        arrowTop.setOnClickListener(this);
        arrowBottom.setOnClickListener(this);
        arrowLeft.setOnClickListener(this);
        arrowRight.setOnClickListener(this);

        tvLevel=(TextView)mRootView.findViewById(R.id.tvLevel);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        tvLevel.setText(""+((GameActivity)getContext()).getLevel());
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrowTop:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(count==2){
    count++;
    arrowLeft.setBackground(getResources().getDrawable(R.drawable.right_arrow));
}
                else{
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.arrowBottom:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
            case R.id.arrowLeft:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(count==0){
    count++;
    arrowLeft.setBackground(getResources().getDrawable(R.drawable.right_arrow));
    arrowRight.setBackground(getResources().getDrawable(R.drawable.left_arrow));
    tvText.setVisibility(View.INVISIBLE);
}
              else   if(count==3){
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel28()).commit();
                }
else{
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
}
                break;
            case R.id.arrowRight:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
if(count==1){
    count++;
    arrowLeft.setBackground(getResources().getDrawable(R.drawable.bottom_arrow));
    arrowRight.setBackground(getResources().getDrawable(R.drawable.bottom_arrow));
}
else{
    ((GameActivity) getActivity()).setStrikes( (((GameActivity) getActivity()).getStrikes()+1));
    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
}
                break;


        }
    }
}
