package demo.com.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    /*

    MainActivity: ======== A onCreate
    MainActivity: ======== A onStart
    MainActivity: ======== A onResume

    ################### START SECOND ACTIVITY ##################
    MainActivity: ======== A onPause
    SecondActivity: ======== B onCreate
    SecondActivity: ======== B onStart
    SecondActivity: ======== B onResume
    MainActivity: ======== A onSaveInstanceState
    MainActivity: ======== A onStop

    ################### CLOSE SECOND ACTIVITY BY BACK ##################
    SecondActivity: ======== B onPause
    MainActivity: ======== A onRestart
    MainActivity: ======== A onStart
    MainActivity: ======== A onResume
    SecondActivity: ======== B onStop
    SecondActivity: ======== B onDestroy

    ################### CLOSE APP BY BACK ##################
    MainActivity: ======== A onPause
    MainActivity: ======== A onStop
    MainActivity: ======== A onDestroy

    */





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity","======== A onCreate");
        findViewById(R.id.btn_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","======== A onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","======== A onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","======== A onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","======== A onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("MainActivity","======== A onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","======== A onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","======== A onDestroy");
    }
}
