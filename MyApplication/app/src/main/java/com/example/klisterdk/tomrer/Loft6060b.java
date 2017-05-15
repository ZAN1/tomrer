package com.example.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.klisterdk.tomrer.get_set.SwapMain;

import static com.example.klisterdk.tomrer.R.id.wall1;
import static com.example.klisterdk.tomrer.R.id.wall2;

public class Loft6060b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loft6060b);


       final EditText dd = (EditText) findViewById(wall1);
       final EditText dd1 = (EditText) findViewById(wall2);


        Button hent = (Button) findViewById(R.id.hent);

        hent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Loft6060b.this,MesterResult.class);


                //intent.putExtra("wall12", wall1.toString());
               //
                String  ss = dd.getText().toString();
                String ss1 = dd1.getText().toString();
                SwapMain swap = new SwapMain();
                swap.setWall12(ss);
                swap.setWall13(ss1);


                Log.i("wall12", "fff" + swap.getWall12());
                Log.i("wall13", "ggg" + swap.getWall13());


                startActivity(intent);
            }


        });


    }





}
