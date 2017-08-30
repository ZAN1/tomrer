package com.tomrer.klisterdk.tomrer.Lofter.Gips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.Gips.GipsLoft;
import com.tomrer.klisterdk.tomrer.Loft6060b1;
import com.tomrer.klisterdk.tomrer.R;

public class LoftMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loft_menu);

        TextView lofter60x60 = (TextView) findViewById(R.id.hloft);
        TextView gipsloft = (TextView) findViewById(R.id.gipsloft);
        lofter60x60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoftMenu.this, Loft6060b1.class);
                startActivity(intent);
            }
        });

        gipsloft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_giosloft = new Intent(LoftMenu.this, GipsLoft.class);
                startActivity(intent_giosloft);
            }
        });

    }
}
