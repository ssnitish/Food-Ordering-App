package workout.hfad.com.myorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sameershekhar on 24-Feb-16.
 */
public class Curry extends Activity {
    Button home,profile;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curry);
        home=(Button)findViewById(R.id.BChome);
        profile=(Button)findViewById(R.id.BCprofile);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Home.class);
                startActivity(i);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Profile.class);
                startActivity(i);
            }
        });
    }



}