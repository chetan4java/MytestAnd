package com.example.chetan.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends AppCompatActivity {
    int counter ;
    Button add,sub;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);
        counter=0;

        add=(Button) findViewById(R.id.bAdd);
        sub=(Button) findViewById(R.id.bSub);
        display=(TextView) findViewById(R.id.tvDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                display.setText("Your Total is = "+counter);

            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            counter--;
                display.setText("Your Total is = "+counter);


            }
        });



    }
    public void loadWebPage(View v)
    {
        Intent intent =new Intent(this,WebActivity.class);
        startActivity(intent);
    }
}
