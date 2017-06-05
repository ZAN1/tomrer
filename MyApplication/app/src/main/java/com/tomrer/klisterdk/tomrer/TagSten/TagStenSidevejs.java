package com.tomrer.klisterdk.tomrer.TagSten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tomrer.klisterdk.tomrer.MainActivity;
import com.tomrer.klisterdk.tomrer.R;

public class TagStenSidevejs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_sten_sidevejs);


        final  EditText max = (EditText) findViewById(R.id.max);
        final  EditText min = (EditText) findViewById(R.id.min);
      final  EditText afstand = (EditText) findViewById(R.id.afstand);
        final  EditText kontrol = (EditText) findViewById(R.id.kontrolmaal);
          Button hentmaal = (Button) findViewById(R.id.hentmaal);






        if(max.getText().toString().trim().isEmpty() && min.getText().toString().trim().isEmpty()
                && afstand.getText().toString().trim().isEmpty() && kontrol.getText().toString().trim().isEmpty()){




            max.setText("");
            min.setText("");
            afstand.setText("");
            kontrol.setText("");









        }










            hentmaal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent reload = new Intent(TagStenSidevejs.this,TagStenSidevejs.class);


                    if(max.getText().toString().trim().isEmpty() || max.getText() == null || min.getText().toString().trim().isEmpty()
                       ||  min.getText() == null   || afstand.getText().toString().trim().isEmpty() || afstand.getText() == null || kontrol.getText().toString().trim().isEmpty() || kontrol.getText() == null){
                       setContentView(R.layout.activity_tag_sten_sidevejs);
                      Toast allfeild =  Toast.makeText(TagStenSidevejs.this,"Alle felter skal udfyldes",Toast.LENGTH_LONG);
                        allfeild.setGravity(Gravity.CENTER,0,0);
                        allfeild.show();
                        startActivity(reload);



                    }

                        if(afstand != null
                                && !afstand.getText().toString().trim().isEmpty()
                                &&!max.getText().toString().trim().isEmpty()
                                && max != null
                                && min != null
                                && !min.getText().toString().trim().isEmpty()
                                && kontrol != null
                                && !kontrol.getText().toString().trim().isEmpty()) {

                            setContentView(R.layout.tag_sidevejs_result);

                        double tagStenMax = Double.parseDouble(max.getText().toString());
                        double tagStenMin = Double.parseDouble(min.getText().toString());
                        double tagAfstand = Double.parseDouble(afstand.getText().toString());


                        final double kontrolMaal = Double.parseDouble(kontrol.getText().toString());

                        final double antalSten = Math.ceil(tagAfstand / tagStenMax);
                        final double nyStenMaal = tagAfstand / antalSten;

                        final double kontrolAfstand = nyStenMaal * kontrolMaal;






                            TextView nytmaal = (TextView) findViewById(R.id.nytstenmaalresult);
                            TextView kontrol = (TextView) findViewById(R.id.kontrolresult);
                            TextView antal = (TextView) findViewById(R.id.antalstenresult);


                        kontrol.setText(String.valueOf(kontrolAfstand) + " M ");
                        nytmaal.setText(String.valueOf(nyStenMaal) + " M ");
                        antal.setText(String.valueOf(antalSten) + " Stk. ");

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
