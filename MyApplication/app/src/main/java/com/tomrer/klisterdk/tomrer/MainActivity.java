package com.tomrer.klisterdk.tomrer;


import android.content.Intent;
import android.opengl.GLES10;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.flurry.android.FlurryAgent;

import javax.microedition.khronos.opengles.GL10;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "DFW7JJM5R3828N9SJFJ8");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Fabric.with(this, new Crashlytics());
        int[] maxTextureSize = new int[1];
        GLES10.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0);


        TextView handvarker = (TextView) findViewById(R.id.handvarker);
        TextView mester = (TextView) findViewById(R.id.mester);
        //ImageView goFront = (ImageView) findViewById(R.id.homeh);

//        goFront.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,MainActivity.class);
//
//                startActivity(intent);
//            }
//        });

        mester.setOnClickListener(new View.OnClickListener(){

        @Override
                public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, MesterCategory.class);

            startActivity(intent);

        }

        });
        handvarker.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TaskActivity.class);

                startActivity(intent);
            }







        });




    }




    
}
