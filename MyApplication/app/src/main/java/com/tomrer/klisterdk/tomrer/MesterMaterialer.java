package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.get_set.SwapMain;

import java.util.List;


public class MesterMaterialer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_materialer_redbla);





        String wall12 = SwapMain.getWall12();
        List<Double> midmid = addition.midmid();
        List<Double> kantkant = addition.kantkant();
        List<Double> midkant = addition.midkant();
        String wall13 = SwapMain.getWall13();
        double v1 = Double.parseDouble(wall12);
        double v2 = Double.parseDouble(wall13);




//***********************************************************************************************
        if (SwapMain.isBlabla()){




            setContentView(R.layout.activity_mester_materialer_blabla);
            TextView storskinneblabla = (TextView) findViewById(R.id.storskinneblabla);
            TextView mellemskinneblabla = (TextView) findViewById(R.id.mellemskinneblabla);
            TextView lilleskinneblabla = (TextView) findViewById(R.id.lilleskinneblabla);


                        if (v1 < v2)
            {
                String storskinneblabla1 = midmid.get(0).toString() + " X " + wall13 + " m";

                 String   mellemskinneblabla1  = midmid.get(1).toString();
                 String  lilleskinneblabla1 = midmid.get(2).toString();

                storskinneblabla.setText(storskinneblabla1);
                mellemskinneblabla.setText(mellemskinneblabla1);
                lilleskinneblabla.setText(lilleskinneblabla1);


            }
            else if (v1 > v2)
            {
                String storskinneblabla1 = midmid.get(0).toString() + " X " + wall12 + " m";

              String  mellemskinneblabla1 = midmid.get(1).toString();
                 String  lilleskinneblabla1 = midmid.get(2).toString();

                storskinneblabla.setText(storskinneblabla1);
                mellemskinneblabla.setText(mellemskinneblabla1);
                lilleskinneblabla.setText(lilleskinneblabla1);



            }
            else if (v1 == v2)
            {
                String storskinneblabla1 = midmid.get(0).toString() + " X " + wall13 + " m";

                  String  mellemskinneblabla1 = midmid.get(1).toString();
                 String  lilleskinneblabla1 = midmid.get(2).toString();
                storskinneblabla.setText(storskinneblabla1);
                mellemskinneblabla.setText(mellemskinneblabla1);
                lilleskinneblabla.setText(lilleskinneblabla1);






            }
        }
        if (SwapMain.isRedbla()){

            setContentView(R.layout.activity_mester_materialer_redbla);

            TextView storskinneredbla = (TextView) findViewById(R.id.storskinneredbla);
            TextView mellemskinneredbla = (TextView) findViewById(R.id.mellemskinneredbla);
            TextView lilleskinneredbla = (TextView) findViewById(R.id.lilleskinneredbla);

            if (v1 < v2)
            {


//

                String lilleskinneredbla1 = midkant.get(3).toString();
             String   mellemskinneredbla1 = midkant.get(2).toString();
                String storskinneredbla11 = kantkant.get(0).toString() + " X " + wall13 + " m";

                lilleskinneredbla.setText(lilleskinneredbla1);
                mellemskinneredbla.setText(mellemskinneredbla1);
                storskinneredbla.setText(storskinneredbla11);

            }
            else if (v1 > v2)
            {




                //kant mid
                String lilleskinneredbla1 = midkant.get(3).toString();
                String   mellemskinneredbla1 = midkant.get(2).toString();
                String storskinneredbla11 = kantkant.get(0).toString() + " X " + wall12 + " m";

                lilleskinneredbla.setText(lilleskinneredbla1);
                mellemskinneredbla.setText(mellemskinneredbla1);
                storskinneredbla.setText(storskinneredbla11);


            }
            else if (v1 == v2)
            {






                //kant mid
                String lilleskinneredbla1 = midkant.get(3).toString();
                String   mellemskinneredbla1 = midkant.get(2).toString();
                String storskinneredbla11 = kantkant.get(0).toString() + " X " + wall13 + " m";

                lilleskinneredbla.setText(lilleskinneredbla1);
                mellemskinneredbla.setText(mellemskinneredbla1);
                storskinneredbla.setText(storskinneredbla11);



            }

        }
        if (SwapMain.isRedred()){

            setContentView(R.layout.activity_mester_materialer_redred);

            TextView storskinneredred = (TextView) findViewById(R.id.storskinneredred);
            TextView mellemskinneredred = (TextView) findViewById(R.id.mellemskinneredred);
            TextView lilleskinneredred = (TextView) findViewById(R.id.lilleskinneredred);

            if (v1 < v2)
            {
                String storskinneredred1 = kantkant.get(0).toString() + " X " + wall13 + " m";

                String   mellemskinneredred1  = kantkant.get(1).toString();
                String  lilleskinneredred1 = kantkant.get(2).toString();

                storskinneredred.setText(storskinneredred1);
                mellemskinneredred.setText(mellemskinneredred1);
                lilleskinneredred.setText(lilleskinneredred1);


            }
            else if (v1 > v2)
            {
                String storskinneredred1 = kantkant.get(0).toString() + " X " + wall12 + " m";

                String  mellemskinneredred1 = kantkant.get(1).toString();
                String  lilleskinneredred1 = kantkant.get(2).toString();

                storskinneredred.setText(storskinneredred1);
                mellemskinneredred.setText(mellemskinneredred1);
                lilleskinneredred.setText(lilleskinneredred1);



            }
            else if (v1 == v2)
            {
                String storskinneredred1 = kantkant.get(0).toString() + " X " + wall13 + " m";

                String  mellemskinneredred1 = kantkant.get(1).toString();
                String  lilleskinneredred1 = kantkant.get(2).toString();
                storskinneredred.setText(storskinneredred1);
                mellemskinneredred.setText(mellemskinneredred1);
                lilleskinneredred.setText(lilleskinneredred1);






            }
        }
        if (SwapMain.isBlared()){

            setContentView(R.layout.activity_mester_materialer_blared);

            TextView storskinneblared = (TextView) findViewById(R.id.storskinneblared);
            TextView mellemskinneblared = (TextView) findViewById(R.id.mellemskinneblared);
            TextView lilleskinneblared = (TextView) findViewById(R.id.lilleskinneblared);
//
            if (v1 < v2)
            {




                //****mid kant
                String   mellemskinneblared1 = midkant.get(0).toString();
                String  lilleskinneblared1 = midkant.get(1).toString();
                String storskinneblared1 = midmid.get(0).toString() + " X " + wall13 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);



            }
            else if (v1 > v2)
            {
                String   mellemskinneblared1 = midkant.get(0).toString();
                String  lilleskinneblared1 = midkant.get(1).toString();
                String storskinneblared1 = midmid.get(0).toString() + " X " + wall12 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);

            }
            else if (v1 == v2)
            {
                String   mellemskinneblared1 = midkant.get(0).toString();
                String  lilleskinneblared1 = midkant.get(1).toString();
                String storskinneblared1 = midmid.get(0).toString() + " X " + wall13 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);



            }

        }

        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MesterMaterialer.this,MainActivity.class);

                startActivity(intent);
            }
        });




    }

}