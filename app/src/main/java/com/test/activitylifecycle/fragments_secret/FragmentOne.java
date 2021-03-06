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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Log.e("inside frag --- ","onCreateView");

        return view;
    }


}
