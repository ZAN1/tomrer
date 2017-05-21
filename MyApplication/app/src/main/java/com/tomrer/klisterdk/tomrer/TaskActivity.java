package com.tomrer.klisterdk.tomrer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        TextView lofter = (TextView) findViewById(R.id.hloft);

        lofter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskActivity.this, Loft6060b1.class);
                startActivity(intent);
            }
        });
        ImageView goFront = (ImageView) findViewById(R.id.homeh);

        goFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskActivity.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
