package com.example.root.thirdpartylibraries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;

import com.daasuu.cat.CountAnimationTextView;

public class MainActivity extends AppCompatActivity {
CountAnimationTextView countAnimationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countAnimationTextView=findViewById(R.id.count_animation_textView);

       // countAnimationTextView.setAnimationDuration(50000).countAnimation(950,1000);

        countAnimationTextView.setInterpolator(new AccelerateInterpolator()).setAnimationDuration(5000).countAnimation(0,100000);
    }
}
