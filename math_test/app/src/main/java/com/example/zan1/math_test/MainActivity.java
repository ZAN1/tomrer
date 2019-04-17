package com.example.zan1.math_test;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.zan1.math_test.Mathclass.Calc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView bla1 = (TextView) findViewById(R.id.pladerialt);
        TextView bla2 = (TextView) findViewById(R.id.kantwall1);
        TextView bla3 = (TextView) findViewById(R.id.kantwall2);


        Calc ca = new Calc();

        bla1.setText(Double.toString(ca.antal_Plader_I_Alt(4,4))); //antal spær
        bla2.setText(Double.toString(ca.kant_Plade_Mid_mid(4)));
        bla3.setText(Double.toString(ca.kant_Plade_Red_Red(4)));
    }











}
