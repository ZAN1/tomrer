package com.tomrer.klisterdk.tomrer.TagSten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.R;

public class Tagcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagcategory);


        TextView sidevejs = (TextView) findViewById(R.id.tagsidevejs);

        sidevejs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tagcategory.this, TagStenSidevejs.class);

                startActivity(intent);
            }
        });

    }
}
