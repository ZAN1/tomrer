package com.tomrer.klisterdk.tomrer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.get_set.SwapMain;

import java.util.List;

import static com.tomrer.klisterdk.tomrer.addition.Uregn;
import static com.tomrer.klisterdk.tomrer.addition.Uregn2;
import static com.tomrer.klisterdk.tomrer.addition.Uregn2wall2;
import static com.tomrer.klisterdk.tomrer.addition.Uregnwall2;


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
               List<Double> formuregn = Uregn(wall12);
        List<Double> formuregn2 = Uregn2(wall12);
        List<Double> formUregnwall2 = Uregnwall2(wall13);
        List<Double> formUregn2wall2  = Uregn2wall2(wall13);
//
//       double pladerialtblabla = formuregn2.get(6) * formUregn2wall2.get(6);
//        double pladerialtblared = formuregn2.get(6) * formUregnwall2.get(5);
//        double pladerialtredred = formuregn.get(5) * formUregnwall2.get(5);
//        double pladerialtredbla = formuregn2.get(5) * formUregn2wall2.get(6);

       double kantskinne1 = (v1 * 2) + (v2 * 2 );
        String kantskinne2 = Double.toString(kantskinne1);


//***********************************************************************************************
        if (SwapMain.isBlabla()){




            setContentView(R.layout.activity_mester_materialer_blabla);
            TextView storskinneblabla = (TextView) findViewById(R.id.storskinneblabla);
            TextView mellemskinneblabla = (TextView) findViewById(R.id.mellemskinneblabla);
            TextView lilleskinneblabla = (TextView) findViewById(R.id.lilleskinneblabla);
            TextView pladerialtblabla = (TextView) findViewById(R.id.pladerialtblabla);
            TextView kantskinne = (TextView) findViewById(R.id.kantskinne);
            kantskinne.setText(kantskinne2 + "m");
          double  pladerialtblabla1 =  formuregn2.get(6) * formUregn2wall2.get(6);
            String pladerialtblabla2 = Double.toString(pladerialtblabla1);
             pladerialtblabla.setText(pladerialtblabla2 + " stk");
                        if (v1 < v2)
            {
                String storskinneblabla1 = midmid.get(0).toString() + " X " + wall13 + " m";

                 String   mellemskinneblabla1  = midmid.get(1).toString();
                 String  lilleskinneblabla1 = midmid.get(2).toString();

                storskinneblabla.setText(storskinneblabla1);
                mellemskinneblabla.setText(mellemskinneblabla1);
                lilleskinneblabla.setText(lilleskinneblabla1);

//                sUregn.add(b);//0 stor blå blå v1 < v2
//                sUregn.add(e);//1 mellem blå blå
//                sUregn.add(h);//2 små blå blå
//                sUregn.add(c);//3
//                sUregn.add(m);//4
            }
            else if (v1 > v2)
            {
                String storskinneblabla1 = midmid.get(0).toString() + " X " + wall12 + " m";

              String  mellemskinneblabla1 = midmid.get(1).toString();
                 String  lilleskinneblabla1 = midmid.get(2).toString();

                storskinneblabla.setText(storskinneblabla1);
                mellemskinneblabla.setText(mellemskinneblabla1);
                lilleskinneblabla.setText(lilleskinneblabla1);

//                sUregn.add(b);//0 stor blå blå
//                sUregn.add(e);//1 mellem blå blå
//                sUregn.add(h);//2 lille blå blå v2 < v1
//                sUregn.add(c);//3
//                sUregn.add(m);//4

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
            TextView pladerialtredbla = (TextView) findViewById(R.id.pladerialtredbla);
            TextView kantskinne = (TextView) findViewById(R.id.kantskinne);
            kantskinne.setText(kantskinne2 + "m");



            if (v1 < v2)
            {

//                kkUregn.add(n);//3 mellem spær rød blå
//                kkUregn.add(m);//4 små spær rød blå
//                kkUregn.add(q);//5 antal spær væg 1 rød
                double  pladerialtredbla1 =  formuregn.get(5) * formUregn2wall2.get(6);
                //   *
                String pladerialtredbla2 = Double.toString(pladerialtredbla1);
                pladerialtredbla.setText(pladerialtredbla2 + " stk");

                String lilleskinneredbla1 = midkant.get(4).toString();
             String   mellemskinneredbla1 = midkant.get(3).toString();
                String storskinneredbla11 = midkant.get(5).toString() + " X " + wall13 + " m";

                lilleskinneredbla.setText(lilleskinneredbla1);
                mellemskinneredbla.setText(mellemskinneredbla1);
                storskinneredbla.setText(storskinneredbla11);

            }
            else if (v1 > v2)
            {


                double  pladerialtredbla1 =  formuregn2.get(6) * formUregnwall2.get(5);
                //   *
                String pladerialtredbla2 = Double.toString(pladerialtredbla1);
                pladerialtredbla.setText(pladerialtredbla2 + " stk");

                //kant mid
                String lilleskinneredbla1 = midkant.get(11).toString();
                String   mellemskinneredbla1 = midkant.get(10).toString();
                String storskinneredbla11 = midkant.get(9).toString() + " X " + wall12 + " m";

                lilleskinneredbla.setText(lilleskinneredbla1);
                mellemskinneredbla.setText(mellemskinneredbla1);
                storskinneredbla.setText(storskinneredbla11);
                /////////////////////////////////
//                String   mellemskinneblared1 = midkant.get(0).toString();
//                String  lilleskinneblared1 = midkant.get(1).toString();
//                String storskinneblared1 = midkant.get(2).toString() + " X " + wall13 + " m";
//kkUregn.add(e);//0 mellemspær blå rød
//                kkUregn.add(f);//1 små spær blå rød
//                kkUregn.add(b);//2 antal store spær væg 1 blå
//                kkUregn.add(n);//3 mellem spær rød blå
//                kkUregn.add(m);//4 små spær rød blå
//                kkUregn.add(q);//5 antal store spær væg 1 rød
//                kkUregn.add(a);//6 antal store spær væg 2 blå
//                kkUregn.add(k);//7 mellem spær blå rød modsat
//                kkUregn.add(i);//8 små spær blå rød modsat
//                kkUregn.add(w);//9antal store spær rød blå
//                kkUregn.add(c);//10 mellem spær rød blå modsat
//                kkUregn.add(g);// 11 små spær rød blå modsat
//
//                storskinneblared.setText(storskinneblared1);
//                mellemskinneblared.setText(mellemskinneblared1);
//                lilleskinneblared.setText(lilleskinneblared1);


            }
            else if (v1 == v2)
            {






                //kant mid
                String lilleskinneredbla1 = midkant.get(4).toString();
                String   mellemskinneredbla1 = midkant.get(3).toString();
                String storskinneredbla11 = midkant.get(5).toString() + " X " + wall13 + " m";

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
            TextView pladerialtredred = (TextView) findViewById(R.id.pladerialtredred);
            TextView kantskinne = (TextView) findViewById(R.id.kantskinne);
            kantskinne.setText(kantskinne2 + "m");
            double  pladerialtredred1 =  formuregn.get(5) * formUregnwall2.get(5);
            String pladerialtredred2 = Double.toString(pladerialtredred1);
            pladerialtredred.setText(pladerialtredred2 + " stk");

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
            TextView pladerialtblared = (TextView) findViewById(R.id.pladerialtblared);
            TextView kantskinne = (TextView) findViewById(R.id.kantskinne);
            kantskinne.setText(kantskinne2 + "m");

//
            if (v1 < v2)
            {

//                kkUregn.add(e);//0 mellemspær blå rød
//                kkUregn.add(f);//1 små spær blå rød
//                kkUregn.add(b);//2 antal store spær væg 1 blå
//                kkUregn.add(n);//3 mellem spær rød blå
//                kkUregn.add(m);//4 små spær rød blå
//                kkUregn.add(q);//5 antal store spær væg 1 rød
                double  pladerialtblared1 =  formuregn2.get(6) * formUregnwall2.get(5);
                String pladerialtblared2 = Double.toString(pladerialtblared1);
                pladerialtblared.setText(pladerialtblared2 + " stk");

                //****mid kant
                String   mellemskinneblared1 = midkant.get(0).toString();
                String  lilleskinneblared1 = midkant.get(1).toString();
                String storskinneblared1 = midkant.get(2).toString() + " X " + wall13 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);



            }
            else if (v1 > v2)
            {
                double  pladerialtblared1 =  formuregn.get(5) * formUregn2wall2.get(6);
                String pladerialtblared2 = Double.toString(pladerialtblared1);
                pladerialtblared.setText(pladerialtblared2 + " stk");

                String   mellemskinneblared1 = midkant.get(7).toString();
                String  lilleskinneblared1 = midkant.get(8).toString();
                String storskinneblared1 = midkant.get(6).toString() + " X " + wall12 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);

////              kkUregn.add(e);//0 mellemspær blå rød
//                kkUregn.add(f);//1 små spær blå rød
//                kkUregn.add(b);//2 antal store spær væg 1 blå
//                kkUregn.add(n);//3 mellem spær rød blå
//                kkUregn.add(m);//4 små spær rød blå
//                kkUregn.add(q);//5 antal store spær væg 1 rød
//                kkUregn.add(a);//6 antal store spær væg 2 blå
//                kkUregn.add(k);//7 mellem spær blå rød modsat
//                kkUregn.add(i);//8 små spær blå rød modsat
//                kkUregn.add(w);//9antal store spær rød blå
//                kkUregn.add(c);//mellem spær rød blå modsat
//                kkUregn.add(g);//små spær rød blå modsat

            }
            else if (v1 == v2)
            {
                String   mellemskinneblared1 = midkant.get(0).toString();
                String  lilleskinneblared1 = midkant.get(1).toString();
                String storskinneblared1 = midkant.get(2).toString() + " X " + wall13 + " m";


                storskinneblared.setText(storskinneblared1);
                mellemskinneblared.setText(mellemskinneblared1);
                lilleskinneblared.setText(lilleskinneblared1);



            }

        }

//        ImageView goFront = (ImageView) findViewById(R.id.homeh);
//
//        goFront.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MesterMaterialer.this,MainActivity.class);
//
//                startActivity(intent);
//            }
//        });




    }

}