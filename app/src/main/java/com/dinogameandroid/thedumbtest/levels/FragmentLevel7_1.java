package com.dinogameandroid.thedumbtest.levels;


import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel7_1 extends Fragment implements View.OnClickListener{
int count=1;
    ImageView imageButton;
    TextView tvStrikes;
    Vibrator vibe1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level7_1, container, false);
        imageButton = (ImageView) mRootView.findViewById(R.id.imageButton);
        tvStrikes=(TextView)mRootView.findViewById(R.id.tvStrikes);
        ImageView imageButton = (ImageView) mRootView.findViewById(R.id.imageButton);
        ImageView imageButton2 = (ImageView) mRootView.findViewById(R.id.imageButton2);
        ImageView imageButton3 = (ImageView) mRootView.findViewById(R.id.imageButton3);
        ImageView imageButton4 = (ImageView) mRootView.findViewById(R.id.imageButton4);
        ImageView imageButton5 = (ImageView) mRootView.findViewById(R.id.imageButton5);
        ImageView imageButton6 = (ImageView) mRootView.findViewById(R.id.imageButton6);
        ImageView imageButton7 = (ImageView) mRootView.findViewById(R.id.imageButton7);
        ImageView imageButton8 = (ImageView) mRootView.findViewById(R.id.imageButton8);
        ImageView imageButton9 = (ImageView) mRootView.findViewById(R.id.imageButton9);
        ImageView imageButton10 = (ImageView) mRootView.findViewById(R.id.imageButton10);
        ImageView imageButton11 = (ImageView) mRootView.findViewById(R.id.imageButton11);
        ImageView imageButton12 = (ImageView) mRootView.findViewById(R.id.imageButton12);
        ImageView imageButton13 = (ImageView) mRootView.findViewById(R.id.imageButton13);
        ImageView imageButton14 = (ImageView) mRootView.findViewById(R.id.imageButton14);
        ImageView imageButton15 = (ImageView) mRootView.findViewById(R.id.imageButton15);
        ImageView imageButton16 = (ImageView) mRootView.findViewById(R.id.imageButton16);
        ImageView imageButton17 = (ImageView) mRootView.findViewById(R.id.imageButton17);
        ImageView imageButton18 = (ImageView) mRootView.findViewById(R.id.imageButton18);
        tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
        imageButton.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton13.setOnClickListener(this);
        imageButton15.setOnClickListener(this);
        imageButton16.setOnClickListener(this);
        imageButton18.setOnClickListener(this);

        imageButton2.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
        imageButton10.setOnClickListener(this);
        imageButton11.setOnClickListener(this);
        imageButton12.setOnClickListener(this);
        imageButton14.setOnClickListener(this);
        imageButton17.setOnClickListener(this);
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton2:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton5:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton6:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton8:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton9:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton10:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton11:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton12:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton14:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton17:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                break;
            case R.id.imageButton:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==1 || count==3 || count==4){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton3:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==5){
                    count++;
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel8()).commit();
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton4:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==2){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton7:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==2){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton13:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);

                if(count==5){
                    count++;
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel8()).commit();
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton15:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==1 || count==3 || count==4){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton16:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==2){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;
            case R.id.imageButton18:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                if(count==1 || count==3 || count==4){
                    count++;
                }else {
                    ((GameActivity) getContext()).setStrikes( (((GameActivity) getContext()).getStrikes()+1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getContext()).getStrikes());
                }
                break;

        }
        Log.e("click",""+count);
    }


}
