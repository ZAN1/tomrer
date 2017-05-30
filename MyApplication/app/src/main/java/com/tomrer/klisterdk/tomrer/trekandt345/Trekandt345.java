package com.tomrer.klisterdk.tomrer.trekandt345;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.tomrer.klisterdk.tomrer.MainActivity;
import com.tomrer.klisterdk.tomrer.R;

public class Trekandt345 extends AppCompatActivity {
    double scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trekandt345);


        Button findmal = (Button) findViewById(R.id.findmal);


        EditText a = (EditText) findViewById(R.id.lillea);
        EditText b = (EditText) findViewById(R.id.lilleb);
        EditText c = (EditText) findViewById(R.id.lillec);


       if (a.getText().toString().trim().isEmpty() || b.getText().toString().trim().isEmpty() || c.getText().toString().trim().isEmpty() ){

           a.setText("0");
           b.setText("0");
           c.setText("0");


       }









        findmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText a = (EditText) findViewById(R.id.lillea);
                EditText b = (EditText) findViewById(R.id.lilleb);
                EditText c = (EditText) findViewById(R.id.lillec);

                double a1 = Double.parseDouble(a.getText().toString());
                double b1 = Double.parseDouble(b.getText().toString());
                double c1 = Double.parseDouble(c.getText().toString());
                if (a.getText() != null && b1 == 0 && c1 == 0){

                    scale =  a1 / 3 ;

                    b.setText(Double.toString(scale * 4));
                    c.setText(Double.toString(scale * 5));

                }else if(b.getText() != null && a1 == 0 && c1 == 0){

                    scale= b1/4;

                    a.setText(Double.toString(scale * 3));
                    c.setText(Double.toString(scale * 5));

                }else if(c.getText() != null && a1 == 0 && b1 == 0){

                    scale = c1 / 5;

                    b.setText(Double.toString(scale * 4));
                    a.setText(Double.toString(scale * 3));
                }else {
                    a.setText("0");
                    b.setText("0");
                    c.setText("0");
                }




            }
        });
        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trekandt345.this,MainActivity.class);

                startActivity(intent);
            }
        });



    }
}
