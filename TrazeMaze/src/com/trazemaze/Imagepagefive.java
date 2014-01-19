package com.trazemaze;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;

public class Imagepagefive extends Activity {
	Vibrator v;
	Namefive touch;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate

	(savedInstanceState);
	    setContentView(R.layout.activity_imagepagefour);
	    v= (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
	    touch = (Namefive)findViewById(R.id.ImageView);
	    touch.setInstance(this);
	    
	}


	public void vibrate()
	{
	v.vibrate(300);
	}


	
		
		

	@Override
	public 
	boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu; this adds items to the action bar 


	    getMenuInflater().inflate(R.menu.pageone, menu);
	    return true;
	}



}
