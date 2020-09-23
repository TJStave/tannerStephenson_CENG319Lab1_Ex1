package com.example.tannerstephenson_ceng319lab1_ex1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class LogFragment extends Fragment {
    TextView tvLog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log, container, false);
        tvLog = (TextView)view.findViewById(R.id.logWind);
        Toast toast = Toast.makeText(getContext(), getString(R.string.log_oncreateview), Toast.LENGTH_SHORT);
        toast.show();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getContext(), getString(R.string.log_onstart), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void addLog(String logString) {
        tvLog.setText(tvLog.getText() + logString);
    }
}