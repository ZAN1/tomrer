package com.tomrer.klisterdk.tomrer.TagSten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.tomrer.klisterdk.tomrer.MainActivity;
import com.tomrer.klisterdk.tomrer.R;

public class TagStenSidevejs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_sten_sidevejs);


        EditText max = (EditText) findViewById(R.id.max);
        EditText min = (EditText) findViewById(R.id.min);
        EditText afstand = (EditText) findViewById(R.id.afstand);
        EditText kontrol = (EditText) findViewById(R.id.kontrolmaal);
        Button hentmaal = (Button) findViewById(R.id.hentmaal);

        double tagStenMax = Double.parseDouble(max.getText().toString());
        double tagStenMin = Double.parseDouble(min.getText().toString());
        double tagAfstand = Double.parseDouble(afstand.getText().toString());
        double kontrolMaal = Double.parseDouble(kontrol.getText().toString());

        if(afstand != null && max != null && min != null && kontrol != null){

           double antalSten =  Math.ceil( tagAfstand / tagStenMax) ;
            double nyStenMaal = tagAfstand / antalSten;

            double kontrolAfstand = nyStenMaal * kontrolMaal;


        }


        hentmaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.tag_sidevejs_result);



            }
        });








        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TagStenSidevejs.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
