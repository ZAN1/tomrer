package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MesterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester);


        final TextView loft6060 = (TextView) findViewById(R.id.loft60x60);


        loft6060.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MesterActivity.this,Loft6060b.class);
                startActivity(intent);
            }
        });

//        ImageView goFront = (ImageView) findViewById(R.id.homeh);
//
//        goFront.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MesterActivity.this,MainActivity.class);
//
//                startActivity(intent);
//            }
//        });


    }
}
