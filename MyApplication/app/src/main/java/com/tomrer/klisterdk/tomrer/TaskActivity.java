package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.Lofter.Gips.LoftMenu;
import com.tomrer.klisterdk.tomrer.TagSten.Tagcategory;
import com.tomrer.klisterdk.tomrer.trekandt345.Trekandt345;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);


        TextView trekandt = (TextView) findViewById(R.id.trekandt);
        TextView tag = (TextView) findViewById(R.id.tag);
        TextView loftMenu = (TextView) findViewById(R.id.loftmenu);

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

        loftMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loftmenu = new Intent(TaskActivity.this, LoftMenu.class);
                startActivity(loftmenu);
            }
        });


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
