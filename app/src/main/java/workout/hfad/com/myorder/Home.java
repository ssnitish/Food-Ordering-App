package workout.hfad.com.myorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sameershekhar on 17-Feb-16.
 */
public class Home extends Activity{

    Button paratha,curry,rice,snack,drink;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        paratha=(Button)findViewById(R.id.Bparatha);
        curry=(Button)findViewById(R.id.Bcurry);
        rice=(Button)findViewById(R.id.Brice);
        snack=(Button)findViewById(R.id.Bsnacks);
        drink=(Button)findViewById(R.id.Bdrinks);



        paratha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Paratha.class);
                startActivity(i);
            }
        });

        curry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Curry.class);
                startActivity(i);
            }
        });


        rice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Rice.class);
                startActivity(i);
            }
        });


        snack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Snacks.class);
                startActivity(i);
            }
        });


        drink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Drinks.class);
                startActivity(i);
            }
        });
    }

 }




