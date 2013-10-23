package com.example.jashpredicts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
//import android.app.AlertDialog;


public class Random  extends Activity {
	TextView res;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.random);
		 res=(TextView) findViewById(R.id.lblRand);
		 
		 int resultFromMainScreen=getIntent().getIntExtra("random", RESULT_OK);
		
		 int rem = 0 ;
		 rem = resultFromMainScreen % 26;
		 
		 rem= rem+65;
	
		 char str= (char) rem;
		 
		 res.setText(String.valueOf(str));
			}

}