package com.trazemaze;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Pageone extends Activity {
	public void next(View v)
	{
		Intent i = new Intent(Pageone.this,Imagepageone.class);
		startActivity(i);
		finish();
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageone);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pageone, menu);
        return true;
    }
    
}
