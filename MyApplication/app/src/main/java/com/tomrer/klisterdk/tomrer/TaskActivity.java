package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.TagSten.Tagcategory;
import com.tomrer.klisterdk.tomrer.trekandt345.Trekandt345;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        TextView lofter = (TextView) findViewById(R.id.hloft);
        TextView trekandt = (TextView) findViewById(R.id.trekandt);
        TextView tag = (TextView) findViewById(R.id.tag);

        lofter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskActivity.this, Loft6060b1.class);
                startActivity(intent);
            }
        });
//        ImageView goFront = (ImageView) findViewById(R.id.homeh);
//
//        goFront.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TaskActivity.this,MainActivity.class);
//
//                startActivity(intent);
//            }
//        });

        trekandt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(TaskActivity.this, Trekandt345.class);
                startActivity(intent);
            }
        });
        tag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskActivity.this, Tagcategory.class);
                startActivity(intent);
            }
        });
    }
}
