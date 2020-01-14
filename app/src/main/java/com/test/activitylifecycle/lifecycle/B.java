package com.test.activitylifecycle.lifecycle;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.test.activitylifecycle.R;

public class B extends AppCompatActivity {
    Button btn_click;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("inside B--- ","onCreate");

        btn_click = findViewById(R.id.btn_click);
        text = findViewById(R.id.text);
        text.setText("B");

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                pDialog.dismiss();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("inside B--- ","Onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("inside B--- ","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("inside B--- ","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("inside B--- ","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("inside B--- ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("inside B--- ","onDestroy");
    }
}
