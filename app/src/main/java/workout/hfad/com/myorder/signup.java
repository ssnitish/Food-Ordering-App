package workout.hfad.com.myorder;

import android.app.Activity;
import android.os.Bundle;

import workout.hfad.com.myorder.R;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by sameershekhar on 02-Feb-16.
 */
public class signup extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    }
    public void onSignupClick(View v)
    {
        if(v.getId()==R.id.Bsignup)
        {
            EditText fname=(EditText)findViewById(R.id.TFname);
            EditText lname=(EditText)findViewById(R.id.TLname);
            EditText username=(EditText)findViewById(R.id.Tusername);
            EditText pass=(EditText)findViewById(R.id.Tpassword);
            EditText phone=(EditText)findViewById(R.id.Tphone);
            EditText room=(EditText)findViewById(R.id.Troom);
            EditText hostel=(EditText)findViewById(R.id.Thostel);

            String fnamestr=fname.getText().toString();
            String lnamestr=lname.getText().toString();
            String usernamestr=username.getText().toString();
            String passstr=pass.getText().toString();
            String phonestr=phone.getText().toString();
            String roomstr=room.getText().toString();
            String hostelstr=hostel.getText().toString();

            String method="register";
            Backgroundtask backgroundtask=new Backgroundtask(this);
            backgroundtask.execute(method,fnamestr,lnamestr,usernamestr,passstr,phonestr,roomstr,hostelstr);
            finish();
        }
    }
}


