package com.tomrer.klisterdk.tomrer.Gips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.R;
import com.tomrer.klisterdk.tomrer.get_set.GetSetGipsLoft;

public class GipsLoftResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gips_loft_result);

        TextView gipsLoftPladetilkant = (TextView) findViewById(R.id.Loftpladetilkant);
        String gipsLoftlaengde = GetSetGipsLoft.getLaengde();

        double LoftlaengdeMeter = Double.parseDouble(gipsLoftlaengde);
        double Loftlaengde = LoftlaengdeMeter * 100;// går fra meter til cm
        double pladeStorelse = 90;

        




    }
}
