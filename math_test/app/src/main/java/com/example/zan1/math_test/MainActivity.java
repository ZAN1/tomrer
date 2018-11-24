package com.example.zan1.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.zan1.math_test.Mathclass.Calc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView bla1 = (TextView) findViewById(R.id.spaersk);

        Calc ca = new Calc();

        bla1.setText(Double.toString(ca.antal_Plader_I_Alt(4,9))); //antal spær

    }











}
