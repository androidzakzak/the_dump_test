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

public class FragmentLevel23 extends Fragment implements View.OnClickListener{
    private TextView tvLevel;
    private TextView tvStrikes;
    private Button buttonTrue;
    private Button buttonFalse;
    Vibrator vibe1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_level23, container, false);
        buttonTrue = (Button)mRootView.findViewById(R.id.buttonTrue);
        buttonFalse = (Button)mRootView.findViewById(R.id.buttonFalse);
        buttonTrue.setOnClickListener(this);
        buttonFalse.setOnClickListener(this);
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
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);

                ((GameActivity) getActivity()).setLevel(((GameActivity) getActivity()).getLevel() + 1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,new FragmentLevel23_1()).commit();
                break;
            case R.id.buttonFalse:
                vibe1 = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                vibe1.vibrate(20);
                ((GameActivity) getActivity()).setStrikes((((GameActivity) getActivity()).getStrikes() + 1));
                tvStrikes.setText("Strikes:" + ((GameActivity) getActivity()).getStrikes());
                break;
        }
    }
}
