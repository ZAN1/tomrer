package com.tomrer.klisterdk.tomrer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.get_set.SwapMain;

import java.util.List;


public class MesterMaterialer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_materialer_redbla);


       // List<Double> bb = addition.sUregn;
       // addition.sUregn.get(0).toString();


        String wall12 = SwapMain.getWall12();
        List<Double> midmid = addition.midmid(wall12);
      //  String wall13 = SwapMain.getWall13();
      //  List<Double> fromUregn = addition.Uregn(wall12);
     //   List<Double> fromUregn2 = addition.Uregn2(wall12);
     //   List<Double> formUregn2wall2 = addition.Uregn2wall2(wall12);
      //  List<Double> midmid = addition.midmid();
       // List<Double> midtkant = addition.();
      //  List<Double> kantkant = addition.kantkant();



//***********************************************************************************************
        if (SwapMain.isBlabla()){

            setContentView(R.layout.activity_mester_materialer_blabla);
            TextView storskinneblabla = (TextView) findViewById(R.id.storskinneblabla);
            TextView mellemskinneblabla = (TextView) findViewById(R.id.mellemskinneblabla);
            TextView lilleskinneblabla = (TextView) findViewById(R.id.lilleskinneblabla);

          String   mellemskinneblabla1 = midmid.get(1).toString();
           String  lilleskinneblabla1 = midmid.get(2).toString();
           String storskinneblabla1 = midmid.get(0).toString();
            storskinneblabla.setText(storskinneblabla1);
            mellemskinneblabla.setText(mellemskinneblabla1);
            lilleskinneblabla.setText(lilleskinneblabla1);
        }
        if (SwapMain.isRedbla()){

            setContentView(R.layout.activity_mester_materialer_redbla);

            TextView storskinneredbla = (TextView) findViewById(R.id.storskinneredbla);
            TextView mellemskinneredbla = (TextView) findViewById(R.id.mellemskinneredbla);
            TextView lilleskinneredbla = (TextView) findViewById(R.id.lilleskinneredbla);
            String   mellemskinneredbla1 = midmid.get(1).toString();
            String  lilleskinneredbla1 = midmid.get(2).toString();
            String storskinneredbla1 = midmid.get(0).toString();
            storskinneredbla.setText(storskinneredbla1);
            mellemskinneredbla.setText(mellemskinneredbla1);
            lilleskinneredbla.setText(lilleskinneredbla1);


        }
        if (SwapMain.isRedred()){

            setContentView(R.layout.activity_mester_materialer_redred);

            TextView storskinneredred = (TextView) findViewById(R.id.storskinneredred);
            TextView mellemskinneredred = (TextView) findViewById(R.id.mellemskinneredred);
            TextView lilleskinneredred = (TextView) findViewById(R.id.lilleskinneredred);
            String   mellemskinneblabla1 = midmid.get(1).toString();
            String  lilleskinneblabla1 = midmid.get(2).toString();
            String storskinneblabla1 = midmid.get(0).toString();

            storskinneredred.setText(storskinneblabla1);
            mellemskinneredred.setText(mellemskinneblabla1);
            lilleskinneredred.setText(lilleskinneblabla1);

        }
        if (SwapMain.isBlared()){

            setContentView(R.layout.activity_mester_materialer_blared);

            TextView storskinneblared = (TextView) findViewById(R.id.storskinneblared);
            TextView mellemskinneblared = (TextView) findViewById(R.id.mellemskinneblared);
            TextView lilleskinneblared = (TextView) findViewById(R.id.lilleskinneblared);
            String   mellemskinneblabla1 = midmid.get(1).toString();
            String  lilleskinneblabla1 = midmid.get(2).toString();
            String storskinneblabla1 = midmid.get(0).toString();

            storskinneblared.setText(storskinneblabla1);
            mellemskinneblared.setText(mellemskinneblabla1);
            lilleskinneblared.setText(lilleskinneblabla1);


        }






    }
}