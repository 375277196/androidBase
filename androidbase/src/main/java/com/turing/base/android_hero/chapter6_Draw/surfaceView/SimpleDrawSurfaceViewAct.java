package com.turing.base.android_hero.chapter6_Draw.surfaceView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SimpleDrawSurfaceViewAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SimpleDrawBySurfaceView(this));
    }
}
