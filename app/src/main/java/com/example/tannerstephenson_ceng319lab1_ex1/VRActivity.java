package com.example.tannerstephenson_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {
    TextView tvVRLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        tvVRLog = (TextView)findViewById(R.id.vrText);
        tvVRLog.setText(tvVRLog.getText() + getString(R.string.oncreate_call));
    }
    public void onStart() {
        super.onStart();
        tvVRLog.setText(tvVRLog.getText() + getString(R.string.onstart_call));
    }
    public void onStop() {
        super.onStop();
        tvVRLog.setText(tvVRLog.getText() + getString(R.string.onstop_call));
    }
    public void onDestroy() {
        super.onDestroy();
        tvVRLog.setText(tvVRLog.getText() + getString(R.string.ondestroy_call));
    }
}