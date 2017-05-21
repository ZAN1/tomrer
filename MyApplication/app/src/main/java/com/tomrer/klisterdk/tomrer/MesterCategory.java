package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MesterCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mester_category);

        TextView lofter = (TextView) findViewById(R.id.loft);

            lofter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MesterCategory.this,MesterActivity.class);
                    startActivity(intent);
                }
            });
        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MesterCategory.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
