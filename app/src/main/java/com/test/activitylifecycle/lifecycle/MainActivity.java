package com.test.activitylifecycle.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.activitylifecycle.R;

public class MainActivity extends AppCompatActivity {
    Button btn_click;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("inside --- ","onCreate");

        btn_click = findViewById(R.id.btn_click);
        text = findViewById(R.id.text);
        text.setText("A");

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog pDialog = new ProgressDialog(MainActivity.this);
//                pDialog.setMessage("Loading...");
                pDialog.setCancelable(false);
                pDialog.show();

                new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {
                            sleep(3000);
                            pDialog.dismiss();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
//                startActivity(new Intent(MainBaseActivity.this, B.class));
                startActivityForResult(new Intent(MainActivity.this, B.class), 1);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("inside --- ","Onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("inside --- ","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("inside --- ","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("inside --- ","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("inside --- ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("inside --- ","onDestroy");
    }
}
