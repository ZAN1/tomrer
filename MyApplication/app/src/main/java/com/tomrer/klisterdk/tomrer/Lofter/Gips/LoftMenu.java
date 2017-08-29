package com.tomrer.klisterdk.tomrer.Lofter.Gips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tomrer.klisterdk.tomrer.Loft6060b1;
import com.tomrer.klisterdk.tomrer.R;
import com.tomrer.klisterdk.tomrer.TaskActivity;

public class LoftMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loft_menu);

        TextView lofter = (TextView) findViewById(R.id.hloft);

        lofter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoftMenu.this, Loft6060b1.class);
                startActivity(intent);
            }
        });
    }
}
