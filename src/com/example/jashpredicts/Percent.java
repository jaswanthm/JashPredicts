package com.example.jashpredicts;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.Context;


public class Percent extends Activity implements OnClickListener {
	 /** Called when the activity is first created. */
		EditText text1;
		TextView lbl;
		Button button;
		int count=0;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.percent);
	        text1=(EditText) findViewById(R.id.txtPartner);
	        lbl= (TextView) findViewById( R.id.lblPercent);
	        button=(Button) findViewById(R.id.btnCalc);
	        button.setOnClickListener(this);
	   }
	    
   
		@Override
		public void onClick(View v) {
			
			InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE); 
			inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
			
			count = count + 1;
			String str;
			str = text1.getEditableText().toString();
			if (str.compareTo("")==0)
			{
				AlertDialog alertDialog = new AlertDialog.Builder(Percent.this).create();
				alertDialog.setTitle("Sorry !");
				alertDialog.setMessage("Enter any name pls !");
				alertDialog.show();
					
				
			}
			else
			{
				
			
			if (count <= 1 )
			{
				
			// TODO Auto-generated method stub
		double random;
		random = Math.random();
		int r;
		r= (int) (random * 100) ;
		lbl.setText(String.valueOf(r)+"%");
			}
			
		}
		}
}