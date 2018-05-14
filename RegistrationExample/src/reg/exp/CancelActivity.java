// CancelActivity.java : Defines cancel page for the android application.
// Android: Registration form with database
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package reg.exp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class CancelActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	public void onClick(View v) {
		if(v.getId()==R.id.b1)
		{
			Intent i=new Intent("reg.exp.HomeActivity");
			startActivity(i);
		}
		else 
		if(v.getId()==R.id.b2)
		{
			Intent i=new Intent("reg.exp.CancelActivity");
			startActivity(i);
		}
	}
}
	

