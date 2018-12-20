package com.example.essam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView backGround;
    ImageView logo;
    TextView goodMooring, hi;
    Animation backgroundAnim, cloverAnim, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backGround = (ImageView) findViewById(R.id.background);
        logo = (ImageView) findViewById(R.id.logo);
        goodMooring = (TextView) findViewById(R.id.goodMooring);
        hi = (TextView) findViewById(R.id.hi);

        backgroundAnim = AnimationUtils.loadAnimation(this, R.anim.bganimation);
        cloverAnim = AnimationUtils.loadAnimation(this, R.anim.cloveranim);
        text = AnimationUtils.loadAnimation(this, R.anim.text_anim);
        backGround.animate().translationY(-900).setDuration(800).setStartDelay(300);
        goodMooring.animate().translationY(150).alpha(0).setDuration(800).setStartDelay(300);

        logo.startAnimation(cloverAnim);
        hi.startAnimation(text);
        logo.setVisibility(View.GONE);
    }
}
