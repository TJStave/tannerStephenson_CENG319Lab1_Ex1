package com.example.tannerstephenson_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {
    TextView tvAILog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        tvAILog = (TextView)findViewById(R.id.aiText);
        tvAILog.setText(tvAILog.getText() + getString(R.string.oncreate_call));
    }
    public void onStart() {
        super.onStart();
        tvAILog.setText(tvAILog.getText() + getString(R.string.onstart_call));
    }
    public void onStop() {
        super.onStop();
        tvAILog.setText(tvAILog.getText() + getString(R.string.onstop_call));
    }
    public void onDestroy() {
        super.onDestroy();
        tvAILog.setText(tvAILog.getText() + getString(R.string.ondestroy_call));
    }
}