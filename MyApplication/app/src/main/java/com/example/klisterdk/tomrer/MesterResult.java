package com.example.klisterdk.tomrer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.klisterdk.tomrer.get_set.SwapMain;

import java.text.DecimalFormat;
import java.util.List;

public class MesterResult extends AppCompatActivity {



    @Override
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_result);
         /*   TextView punktmid;
        TextView kantPlade1;
        TextView antalplader1;
        TextView kantplade2;
        TextView antalplader; */

         protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_result);

       // SwapMain swap1 = new SwapMain();
       // SwapMain swap1;= new SwapMain(String wall12,String wall13);
        //String wall12;// = swap.getWall1();
      //  String wall13;// = swap.getWall2();
       //String  wall12 =  swap1.getWall1();
     //  String  wall13 = swap1.getWall2();
        //SwapMain swap = new SwapMain();

       String wall12 = SwapMain.getWall12();
        String wall13 = SwapMain.getWall13();
        Log.i("wall12", "fff" + wall12);
        Log.i("wall13", "ggg" + wall13);
        //wall12 = swap.getWall1();
        if(wall12 != null && wall13 != null){
        wall12.replace('.', ',');
        wall13.replace('.', ',');

        //  TextView punktmid = FindViewById<TextView>(Resource.Id.punktmid);
        TextView kantPlade1 = (TextView) findViewById(R.id.kantplade1);
        //    TextView antalplader1 = FindViewById<TextView>(Resource.Id.antalplader1);
        TextView kantplade2 = (TextView) findViewById(R.id.kantplade2);
        //  TextView antalplader = FindViewById<TextView>(Resource.Id.antalplader2);
        TextView kantplade1v2 = (TextView) findViewById(R.id.kantplade1v2);
        //   TextView antalplader1v2 = FindViewById<TextView>(Resource.Id.antalplader1v2);
        //   TextView antalplader2v2 = FindViewById<TextView>(Resource.Id.antalplader2v2);
        //   TextView punktmidv2 = FindViewById<TextView>(Resource.Id.punktmidv2);
        TextView kantplade2v2 = (TextView) findViewById(R.id.kantplade2v2);
         /*   TextView blabla1 = FindViewById<TextView>(Resource.Id.blabla1);
            TextView blared1 = FindViewById<TextView>(Resource.Id.blared1);
            TextView redbla1 = FindViewById<TextView>(Resource.Id.redbla1);
            TextView blas = FindViewById<TextView>(Resource.Id.blas);
            TextView label10 = FindViewById<TextView>(Resource.Id.label10);
            TextView label8 = FindViewById<TextView>(Resource.Id.label8);
            TextView label7 = FindViewById<TextView>(Resource.Id.label7);
            TextView label19 = FindViewById<TextView>(Resource.Id.label19);
            TextView label18 = FindViewById<TextView>(Resource.Id.label18);
            TextView label17 = FindViewById<TextView>(Resource.Id.label17);
            TextView label11 = FindViewById<TextView>(Resource.Id.label11);
            TextView label12 = FindViewById<TextView>(Resource.Id.label12);
            TextView label13 = FindViewById<TextView>(Resource.Id.label13);
            TextView label14 = FindViewById<TextView>(Resource.Id.label14);
            TextView label16 = FindViewById<TextView>(Resource.Id.label16);
            TextView label15 = FindViewById<TextView>(Resource.Id.label15);*/





//java new
        //  **************************************************************************


        List<Double> fromUregn = addition.Uregn(wall12);
        List<Double> fromUregn2 = addition.Uregn2(wall12);
        //  punktmid.Text = Math.Round(fromUregn[0], 3).ToString();
        DecimalFormat format = new DecimalFormat("0.000#");
        double dd1 = fromUregn.get(4);
         String ddd1 =  format.format(dd1);
            //Log.i("log","log" + dd1);
            //double dd =Math.round(fromUregn.get(4)));

       // String kantplade1Text = String.valueOf(dd1);


            DecimalFormat format1 = new DecimalFormat("0.000#");
        kantPlade1.setText(ddd1);
        double ss1 = fromUregn2.get(5);
        String sss1 =   format1.format(ss1);



        // double ss =format.format(fromUregn2.get(5));
            //format.format(ss);
      // String kantPlade2Text = String.valueOf(ss1);
                //kantPlade2Text
        kantplade2.setText(sss1);
        //     antalplader1.Text = Math.Round(fromUregn[5], 3).ToString();
        //punktmid.Text = fromUregn[3].ToString();
      ///  kantplade2.setText(kantPlade2Text); //= Math.Round(fromUregn2[5], 3).ToString();
        //   antalplader.Text = Math.Round(fromUregn2[6], 3).ToString();
        // kantplade2.Text = fromUregn2[].ToString();
        // kantplade2.Text = fromUregn2[].ToString();
        // kantplade2.Text = fromUregn2[].ToString();
       // double v1 = Double.parseDouble(wall13);
       // double v2 = Double.parseDouble(wall12);

        //List<Double> formUregn2wall2 = addition.Uregn2(wall12);
        //double ddv2 = Math.round(Double.valueOf(format.format(formUregn2wall2.get(5))));
            DecimalFormat format2 = new DecimalFormat("0.000#");
        double ddv2 = fromUregn.get(4);
           String rr1 = format2.format(ddv2);

           // String kantplade1v2Text = String.valueOf(rr1);

        kantplade1v2.setText(rr1);
            DecimalFormat format3 = new DecimalFormat("0.000#");
            double  ssv2 = fromUregn2.get(5);
         String rr = format3.format(ssv2);
           //double ssv2 =Math.round(Double.valueOf(format.format(fromUregn2.get(5))));
          // String kantPlade2v2Text = String.valueOf(ssv2);

           kantplade2v2.setText(rr);

       // List<Double> formUregnwall2 = addition.Uregnwall2(wall13);

        //List<Double> formUregn2wall2 = addition.Uregn2wall2(wall13);
       // kantplade1v2.Text = Math.Round(formUregnwall2[4], 3).ToString();
        //    antalplader2v2.Text = Math.Round(formUregnwall2[5], 3).ToString();
        //  punktmidv2.Text = Math.Round(formUregnwall2[0], 3).ToString();
        //----

        //   antalplader1v2.Text = Math.Round(formUregn2wall2[6], 3).ToString();
       // kantplade2v2.Text = Math.Round(formUregn2wall2[5], 3).ToString();
        //alle loft plader i alt


       // double blabla = Math.round(fromUregn2.get(6)) * Math.round(formUregn2wall2.get(6));
        //double blared = Math.round(fromUregn2.get(6)) * Math.round(formUregnwall2.get(5));
       // double redbla = Math.round(fromUregn.get(5)) * Math.round(formUregn2wall2.get(6));
       // double redred = Math.round(fromUregn.get(5)) * Math.round(formUregnwall2.get(5));
        //  blabla1.Text = Math.Round(blabla, 3).ToString();
        //    blared1.Text = Math.Round(blared, 3).ToString();
        //    redbla1.Text = Math.Round(redbla, 3).ToString();
        //    blas.Text = Math.Round(redred, 3).ToString();

        //midt midt spær

///*****************************************************************************************************
        /*    if (v1 < v2)
            {
                label10.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

                label8.Text = addition.midmid()[1].ToString();
                label7.Text = addition.midmid()[2].ToString();


                //*******kant kant spær

                label19.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";

                label18.Text = addition.kantkant()[1].ToString();
                label17.Text = addition.kantkant()[2].ToString();

                //****mid kant
                label11.Text = addition.midkant()[1].ToString();
                label12.Text = addition.midkant()[0].ToString();
                label13.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

                //kant mid

                label14.Text = addition.midkant()[3].ToString();
                label16.Text = addition.midkant()[2].ToString();
                label15.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";

            }
            else if (v1 > v2)
            {
                label10.Text = addition.midmid()[0].ToString() + " X " + wall12 + " m";

                label8.Text = addition.midmid()[1].ToString();
                label7.Text = addition.midmid()[2].ToString();


                //*******kant kant spær

                label19.Text = addition.kantkant()[0].ToString() + " X " + wall12 + " m";

                label18.Text = addition.kantkant()[1].ToString();
                label17.Text = addition.kantkant()[2].ToString();

                //****mid kant
                label11.Text = addition.midkant()[1].ToString();
                label12.Text = addition.midkant()[0].ToString();
                label13.Text = addition.midmid()[0].ToString() + " X " + wall12 + " m";

                //kant mid
                label14.Text = addition.midkant()[3].ToString();
                label16.Text = addition.midkant()[2].ToString();
                label15.Text = addition.kantkant()[0].ToString() + " X " + wall12 + " m";


            }
            else if (v1 == v2)
            {
                label10.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

                label8.Text = addition.midmid()[1].ToString();
                label7.Text = addition.midmid()[2].ToString();


                //*******kant kant spær

                label19.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";

                label18.Text = addition.kantkant()[1].ToString();
                label17.Text = addition.kantkant()[2].ToString();

                //****mid kant
                label11.Text = addition.midkant()[1].ToString();
                label12.Text = addition.midkant()[0].ToString();
                label13.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

                //kant mid
                label14.Text = addition.midkant()[3].ToString();
                label16.Text = addition.midkant()[2].ToString();
                label15.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";



            }*/
       }

    }
}