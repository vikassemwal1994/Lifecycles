package com.test.activitylifecycle.fragments_secret;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.test.activitylifecycle.R;


public class MainBaseActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    TextView btn_click;
    LinearLayout ll_one, ll_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_base_antivity);
        btn_click = findViewById(R.id.btn_click);
        ll_one = findViewById(R.id.ll_one);
        ll_two = findViewById(R.id.ll_two);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragmentOne =new FragmentOne();
        fragmentTransaction.add(R.id.ll_one, fragmentOne);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                FragmentTwo fragmentTwo = new FragmentTwo();
                fragmentTransaction.replace(R.id.ll_two, fragmentTwo);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

    }

    @Override
    public void onBackPressed() {
        if (fragmentManager.getBackStackEntryCount()==1){
            finish();
        }else{
            super.onBackPressed();
        }

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
