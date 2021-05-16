package com.rejowan.cutesnackbarexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstraintLayout constraintLayout = findViewById(R.id.mLayout);

        Snackbar.make(constraintLayout,"Hello", Snackbar.LENGTH_SHORT).show();

   }
}