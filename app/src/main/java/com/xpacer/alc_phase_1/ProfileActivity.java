package com.xpacer.alc_phase_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle(R.string.my_profile);
    }

}