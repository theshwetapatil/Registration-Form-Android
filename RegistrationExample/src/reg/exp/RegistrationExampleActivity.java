// RegistrationExampleActivity.java : Defines the entry point for the android application.
// Android: Registration form with database
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package reg.exp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationExampleActivity extends Activity implements OnClickListener{
	EditText u,p,a,e;
	Button r,c;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        u=(EditText)findViewById(R.id.e1);
        p=(EditText)findViewById(R.id.e2);
        a=(EditText)findViewById(R.id.e3);
        e=(EditText)findViewById(R.id.e4);
        
        r=(Button)findViewById(R.id.b1);
        c=(Button)findViewById(R.id.b2);
        
        r.setOnClickListener(this);
        c.setOnClickListener(this);
    }

	public void onClick(View v) {
			if(v.getId()==R.id.b1)
			{
				if(u.getText().toString()==null||u.getText().toString().length()<1||p.getText().toString()==null||p.getText().toString().length()<1||a.getText().toString()==null||a.getText().toString().length()<1||e.getText().toString()==null||e.getText().toString().length()<1)
				{
					Toast.makeText(getApplicationContext(), "Invalid Entry",5000).show();
				}
				
				else
				{
					Intent i=new Intent("reg.exp.HomeActivity");
					startActivity(i);	
				}
			}
			else 
			if(v.getId()==R.id.b2)
			{
				Intent i=new Intent("reg.exp.CancelActivity");
				startActivity(i);
			}	
	}
}