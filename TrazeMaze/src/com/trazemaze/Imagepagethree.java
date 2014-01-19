package com.trazemaze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.View;

public class Imagepagethree extends Activity {
	Vibrator v;
	Namethree touch;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate

	(savedInstanceState);
	    setContentView(R.layout.activity_imagepagetwo);
	    v= (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
	    touch = (Namethree)findViewById(R.id.imageView1);
	    touch.setInstance(this);
	    
	}


	public void vibrate()
	{
	v.vibrate(300);
	}


	public void next(View v)
	{
	Intent i = new Intent(Imagepagethree.this,Imagepagefour.class);
	startActivity(i);
	finish();
	}

		
		

	@Override
	public 
	boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu; this adds items to the action bar 


	    getMenuInflater().inflate(R.menu.pageone, menu);
	    return true;
	}


}
