package com.example.tannerstephenson_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    LogFragment logRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logRef = (LogFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_log);
        logRef.addLog(getString(R.string.main_activity));
        logRef.addLog(getString(R.string.oncreate_call));
    }
    public void onStart() {
        super.onStart();
        logRef.addLog(getString(R.string.onstart_call));
    }
    public void onRestart()
    {
        super.onRestart();
        logRef.addLog(getString(R.string.onrestart_call));
    }
    public void onResume()
    {
        super.onResume();
        logRef.addLog(getString(R.string.onresume_call));
    }
    public void onPause()
    {
        super.onPause();
        logRef.addLog(getString(R.string.onpause_call));
    }
    //
    public void onStop()
    {
        super.onStop();
        logRef.addLog(getString(R.string.onstop_call));
    }
    public void onDestroy()
    {
        super.onDestroy();
        logRef.addLog(getString(R.string.ondestroy_call));
    }
}