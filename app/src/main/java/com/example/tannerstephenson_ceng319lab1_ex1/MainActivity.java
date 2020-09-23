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
        logRef.addLog("Main Activity\n");
        logRef.addLog("OnCreate called\n");
    }
    public void onStart() {
        super.onStart();
        logRef.addLog("OnStart called\n");
    }
    public void onRestart()
    {
        super.onRestart();
        logRef.addLog("OnRestart called\n");
    }
    public void onResume()
    {
        super.onResume();
        logRef.addLog("OnResume called\n");
    }
    public void onPause()
    {
        super.onPause();
        logRef.addLog("OnPause called\n");
    }
    //
    public void onStop()
    {
        super.onStop();
        logRef.addLog("OnStop called\n");
    }
    public void onDestroy()
    {
        super.onDestroy();
        logRef.addLog("OnDestroy called\n");
    }
}