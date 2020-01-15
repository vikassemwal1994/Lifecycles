package com.test.activitylifecycle.fragments_secret;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.test.activitylifecycle.R;
import io.reactivex.Observable;

public class FragmentOne extends Fragment {

    Observable<String> animalsObservable = Observable.just("Ant", "Bee", "Cat", "Dog", "Fox");

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("inside frag --- ","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("inside frag --- ","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Log.e("inside frag --- ","onCreateView");


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("inside frag --- ","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("inside frag --- ","Onstart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("inside frag --- ","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("inside frag --- ","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("inside frag --- ", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("inside frag --- ","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("inside frag --- ","onDetach");
    }
}
