package com.tomrer.klisterdk.tomrer.Gips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tomrer.klisterdk.tomrer.R;
import com.tomrer.klisterdk.tomrer.get_set.GetSetGipsLoft;

public class GipsLoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gips_loft);

        final EditText gipsLoftLaengde = (EditText) findViewById(R.id.loftLængde);
        Button gipslaengdebutton = (Button) findViewById(R.id.gipslofthent);


        gipslaengdebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loftdeling = new Intent(GipsLoft.this , GipsLoftResult.class );
                GetSetGipsLoft getsetlaengde = new GetSetGipsLoft();
                String laengde = gipsLoftLaengde.getText().toString();

                if(gipsLoftLaengde != null){
                    getsetlaengde.setLaengde(laengde);
                    startActivity(Loftdeling);

                }



            }
        });

    }
}
