package com.tomrer.klisterdk.tomrer.Gips;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tomrer.klisterdk.tomrer.R;

public class GipsLoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gips_loft);

        EditText gipsLoftLaengde = (EditText) findViewById(R.id.loftLængde);
        Button gipslaengdebutton = (Button) findViewById(R.id.gipslofthent);


        gipslaengdebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
