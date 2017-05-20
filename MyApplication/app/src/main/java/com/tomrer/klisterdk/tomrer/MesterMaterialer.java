package com.tomrer.klisterdk.tomrer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.get_set.SwapMain;

import java.util.List;

import static com.tomrer.klisterdk.tomrer.R.id.kantplade1v2;
import static com.tomrer.klisterdk.tomrer.R.id.kantplade2v2;

public class MesterMaterialer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_materialer_redbla);

        String wall12 = SwapMain.getWall12();
        String wall13 = SwapMain.getWall13();

        if (SwapMain.isBlabla()){

            setContentView(R.layout.activity_mester_materialer_blabla);


        }
        if (SwapMain.isRedbla()){

            setContentView(R.layout.activity_mester_materialer_redbla);


        }
        if (SwapMain.isRedred()){

            setContentView(R.layout.activity_mester_materialer_redred);


        }
        if (SwapMain.isBlared()){

            setContentView(R.layout.activity_mester_materialer_blared);


        }





       //     TextView antalplader1 = (TextView)findViewById(R.id.antalplader1);
      //  TextView antalplader2 = (TextView)findViewById(R.id.antalplader2);
       // TextView antalplader1v2 = (TextView)findViewById(R.id.antalplader1v2);
       // TextView antalplader2v2 = (TextView)findViewById(R.id.antalplader2v2);

        //  TextView antalplader = FindViewById<TextView>(Resource.Id.antalplader2);

        //   TextView antalplader1v2 = FindViewById<TextView>(Resource.Id.antalplader1v2);
        //   TextView antalplader2v2 = FindViewById<TextView>(Resource.Id.antalplader2v2);
        //   TextView punktmidv2 = FindViewById<TextView>(Resource.Id.punktmidv2);

           TextView blabla1 = (TextView) (R.id.blabla1);
            TextView blared1 = FindViewById<TextView>(Resource.Id.blared1);
            TextView redbla1 = FindViewById<TextView>(Resource.Id.redbla1);
            TextView blas = FindViewById<TextView>(Resource.Id.blas);
            TextView label10 = FindViewById<TextView>(Resource.Id.label10);
            TextView label8 = FindViewById<TextView>(Resource.Id.label8);
            TextView label7 = FindViewById<TextView>(Resource.Id.label7);
            TextView label19 = FindViewById<TextView>(Resource.Id.label19);
        TextView label18 = (TextView) findViewById(R.id.label8);
            TextView label17 = FindViewById<TextView>(Resource.Id.label17);
            TextView label11 = FindViewById<TextView>(Resource.Id.label11);
            TextView label12 = FindViewById<TextView>(Resource.Id.label12);
            TextView label13 = FindViewById<TextView>(Resource.Id.label13);
            TextView label14 = FindViewById<TextView>(Resource.Id.label14);
            TextView label16 = FindViewById<TextView>(Resource.Id.label16);
            TextView label15 = FindViewById<TextView>(Resource.Id.label15);


        List<Double> formUregnwall2 = addition.Uregnwall2(wall13);

        List<Double> formUregn2wall2 = addition.Uregn2wall2(wall13);
         double antallade1v2 = Math.round(formUregnwall2.get(4));
           double antalplader2v2 = Math.round(formUregnwall2.get(5));
         double punktmidv2 = Math.round(formUregnwall2.get(0));


           antalplader1v2.Text = Math.Round(formUregn2wall2[6], 3).ToString();
         kantplade2v2.Text = Math.Round(formUregn2wall2[5], 3).ToString();
         alle loft plader i alt


         double blabla = Math.round(fromUregn2.get(6)) * Math.round(formUregn2wall2.get(6));
        double blared = Math.round(fromUregn2.get(6)) * Math.round(formUregnwall2.get(5));
         double redbla = Math.round(fromUregn.get(5)) * Math.round(formUregn2wall2.get(6));
         double redred = Math.round(fromUregn.get(5)) * Math.round(formUregnwall2.get(5));
          blabla1.Text = Math.Round(blabla, 3).ToString();
            blared1.Text = Math.Round(blared, 3).ToString();
            redbla1.Text = Math.Round(redbla, 3).ToString();
            blas.Text = Math.Round(redred, 3).ToString();

        midt midt spær

//*****************************************************************************************************
        if (v1 < v2) {
            label10.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

            label8.Text = addition.midmid()[1].ToString();
            label7.Text = addition.midmid()[2].ToString();


            //*******kant kant spær

            label19.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";
            String hh = addition.kantkant(1)
            label18.setText(addition.kantkant(1).toString());
            label17.Text = addition.kantkant()[2].ToString();

            //****mid kant
            label11.Text = addition.midkant()[1].ToString();
            label12.Text = addition.midkant()[0].ToString();
            label13.Text = addition.midmid()[0].ToString() + " X " + wall13 + " m";

            //kant mid

            label14.Text = addition.midkant()[3].ToString();
            label16.Text = addition.midkant()[2].ToString();
            label15.Text = addition.kantkant()[0].ToString() + " X " + wall13 + " m";

        } else if (v1 > v2) {
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


        } else if (v1 == v2) {
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
    }
}