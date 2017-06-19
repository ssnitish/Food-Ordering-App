package workout.hfad.com.myorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sameershekhar on 24-Feb-16.
 */
public class Rice extends Activity {

    Button home,profile;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rice);

        home=(Button)findViewById(R.id.BRhome);
        profile=(Button)findViewById(R.id.BRprofile);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Rice.this,Home.class);
                startActivity(i);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Rice.this,Profile.class);
                startActivity(i);
            }
        });
    }

}