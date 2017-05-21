package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.tomrer.klisterdk.tomrer.get_set.SwapMain;

import static com.tomrer.klisterdk.tomrer.R.id.wall1;
import static com.tomrer.klisterdk.tomrer.R.id.wall2;

public class Loft6060b1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loft6060b1);


        final EditText dd = (EditText) findViewById(wall1);
        final EditText dd1 = (EditText) findViewById(wall2);



        Button hent = (Button) findViewById(R.id.hent);

        hent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String wall112 = dd.getText().toString();
//                if(TextUtils.isEmpty(wall112)){
//                    dd.setError("Felt må ikke være tomt!");
//                }
//                String wall113 = dd1.getText().toString();
//                if(TextUtils.isEmpty(wall113)){
//                    dd.setError("Felt må ikke være tomt!");
//                }
                SwapMain swap = new SwapMain();
                Intent intent = new Intent(Loft6060b1.this, HandResult.class);
                Intent goBack = new Intent(Loft6060b1.this,Loft6060b1.class);

                //intent.putExtra("wall12", wall1.toString());
                //
                String ss = dd.getText().toString();
                String ss1 = dd1.getText().toString();

                if(ss.trim().isEmpty() || ss1.trim().isEmpty()){
                    swap.setWall12("0");
                    swap.setWall13("0");
                    Toast.makeText(Loft6060b1.this ,"Indsæt mål i væg nr.1 og væg nr 2!",Toast.LENGTH_LONG).show();
                    startActivity(goBack);
                }else {


                    swap.setWall12(ss);
                    swap.setWall13(ss1);
                    //Log.i("wall12", "fff" + swap.getWall12());
                    // Log.i("wall13", "ggg" + swap.getWall13());


                    startActivity(intent);


                    Log.i("log", "" + ss + ss1);


                }









            }



        });
        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loft6060b1.this,MainActivity.class);

                startActivity(intent);
            }
        });

    }





}
