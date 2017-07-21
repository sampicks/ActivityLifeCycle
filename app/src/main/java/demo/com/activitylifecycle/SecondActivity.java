package demo.com.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("SecondActivity","======== B onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SecondActivity","======== B onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("SecondActivity","======== B onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecondActivity","======== B onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecondActivity","======== B onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("SecondActivity","======== B onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity","======== B onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity","======== B onDestroy");
    }

}
