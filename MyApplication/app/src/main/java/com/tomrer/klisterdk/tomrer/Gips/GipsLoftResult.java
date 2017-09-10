package com.tomrer.klisterdk.tomrer.Gips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.R;
import com.tomrer.klisterdk.tomrer.get_set.GetSetGipsLoft;

import static java.lang.Math.floor;

public class GipsLoftResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gips_loft_result);

        TextView gipsLoftPladetilkant = (TextView) findViewById(R.id.Loftpladetilkant);
        TextView gipsLoftPladetilkant2 = (TextView) findViewById(R.id.Loftpladetilkant2);
        String gipsLoftlaengde = GetSetGipsLoft.getLaengde();

        double LoftlaengdeMeter = Double.parseDouble(gipsLoftlaengde);
        double Loftlaengde = LoftlaengdeMeter * 100;// går fra meter til cm
        double pladeStorelse = 90;

        double antalPlader = Loftlaengde / pladeStorelse;



           double kantPlade = (Loftlaengde - ((floor(antalPlader))*90)) / 2;

        String kantPladetiltext1 = Double.toString(kantPlade);

        gipsLoftPladetilkant.setText(kantPladetiltext1 + " cm");
        gipsLoftPladetilkant2.setText(kantPladetiltext1 + " cm");

            if(kantPlade == 0){
               double kantPlade1 = (Loftlaengde - ((floor(antalPlader)-1))) / 2;
                String kantPladetiltext =Double.toString(kantPlade1);
                gipsLoftPladetilkant.setText(kantPladetiltext + " cm");
                gipsLoftPladetilkant2.setText(kantPladetiltext + " cm");
            }

            if(kantPlade < 30){

                 double unevenkantplade =  60 - kantPlade * 2 ;
                       double newPlade = (kantPlade * 2) + unevenkantplade;
                    double gipsplade = 90 - unevenkantplade;
                    String kantPladetiltext = Double.toString(newPlade);
                String kantPlade2tiltext = Double.toString(gipsplade);
                    gipsLoftPladetilkant.setText(kantPladetiltext + " cm");
                    gipsLoftPladetilkant2.setText(kantPlade2tiltext + " cm");

            }


    }
}
