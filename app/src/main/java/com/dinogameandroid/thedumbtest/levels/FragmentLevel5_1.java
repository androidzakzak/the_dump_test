package com.dinogameandroid.thedumbtest.levels;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dinogameandroid.thedumbtest.R;
import com.dinogameandroid.thedumbtest.activity.GameActivity;

public class FragmentLevel5_1 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private Button buttonTrue;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;
    private ImageView imageView12;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView13;
    private ImageView imageView14;
    private ImageView imageView15;
    private ImageView imageView16;
    private boolean one;
    private boolean two;
    private boolean three;
    private boolean who;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level5_1, container, false);
        buttonTrue = (Button)mRootView.findViewById(R.id.buttonFalse5);

        buttonTrue.setOnClickListener(this);
        button = (Button)mRootView.findViewById(R.id.button);
        button2 = (Button)mRootView.findViewById(R.id.button2);
        button3 = (Button)mRootView.findViewById(R.id.button3);
        button4 = (Button)mRootView.findViewById(R.id.button4);
        imageView5 = (ImageView)mRootView.findViewById(R.id.imageView5);
        imageView6 = (ImageView)mRootView.findViewById(R.id.imageView6);
        imageView7 = (ImageView)mRootView.findViewById(R.id.imageView7);
        imageView8 = (ImageView)mRootView.findViewById(R.id.imageView8);
        imageView9 = (ImageView)mRootView.findViewById(R.id.imageView9);
        imageView10 = (ImageView)mRootView.findViewById(R.id.imageView10);
        imageView11 = (ImageView)mRootView.findViewById(R.id.imageView11);
        imageView12 = (ImageView)mRootView.findViewById(R.id.imageView12);
        imageView1 = (ImageView)mRootView.findViewById(R.id.imageView1);
        imageView2 = (ImageView)mRootView.findViewById(R.id.imageView2);
        imageView3 = (ImageView)mRootView.findViewById(R.id.imageView3);
        imageView4 = (ImageView)mRootView.findViewById(R.id.imageView4);
        imageView13 = (ImageView)mRootView.findViewById(R.id.imageView13);
        imageView14 = (ImageView)mRootView.findViewById(R.id.imageView14);
        imageView15 = (ImageView)mRootView.findViewById(R.id.imageView15);
        imageView16 = (ImageView)mRootView.findViewById(R.id.imageView16);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
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
                if(one&&two&&three&&who) {
                    ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new FragmentLevel6()).commit();
                }
                else{
                    ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                    tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                }
                break;
            case R.id.imageView5:
                one=false;
button.setBackground(getResources().getDrawable(R.drawable.red_circle));
                break;
            case R.id.imageView6:
                one=false;
                button.setBackground(getResources().getDrawable(R.drawable.green_circle));
                break;
            case R.id.imageView7:
                one=false;
                button.setBackground(getResources().getDrawable(R.drawable.yelow_circle));
                break;
            case R.id.imageView8:
                one=true;
                button.setBackground(getResources().getDrawable(R.drawable.blue_circle1));
                break;
            case R.id.imageView9:
                two=false;
                button2.setBackground(getResources().getDrawable(R.drawable.red_circle));
                break;
            case R.id.imageView10:
                two=false;
                button2.setBackground(getResources().getDrawable(R.drawable.green_circle));
                break;
            case R.id.imageView11:
                two=true;
                button2.setBackground(getResources().getDrawable(R.drawable.yelow_circle));
                break;
            case R.id.imageView12:
                two=false;
                button2.setBackground(getResources().getDrawable(R.drawable.blue_circle1));
                break;
            case R.id.imageView1:
                three=false;
                button3.setBackground(getResources().getDrawable(R.drawable.red_circle));
                break;
            case R.id.imageView2:
                three=true;
                button3.setBackground(getResources().getDrawable(R.drawable.green_circle));
                break;
            case R.id.imageView3:
                three=false;
                button3.setBackground(getResources().getDrawable(R.drawable.yelow_circle));
                break;
            case R.id.imageView4:
                three=false;
                button3.setBackground(getResources().getDrawable(R.drawable.blue_circle1));
                break;
            case R.id.imageView13:
                who=true;
                button4.setBackground(getResources().getDrawable(R.drawable.red_circle));
                break;
            case R.id.imageView14:
                who=false;

                button4.setBackground(getResources().getDrawable(R.drawable.green_circle));
                break;
            case R.id.imageView15:
                who=false;
                button4.setBackground(getResources().getDrawable(R.drawable.yelow_circle));
                break;
            case R.id.imageView16:
                who=false;
                button4.setBackground(getResources().getDrawable(R.drawable.blue_circle1));
                break;
        }
    }
}
