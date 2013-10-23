package com.example.jashpredicts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;

public class Main extends Activity implements OnClickListener {

	 /** Called when the activity is first created. */
		EditText text1,text2;
		Button button,button2,btnCal,btnFlames,btnShake;
			
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        text1=(EditText) findViewById(R.id.editText1);
	        button=(Button) findViewById(R.id.button1);
	        button2=(Button) findViewById(R.id.button2);
	        btnCal=(Button) findViewById(R.id.btnCal);
	        btnFlames=(Button) findViewById(R.id.btnFlames);
	        btnShake=(Button) findViewById(R.id.btnShake);
	        button.setOnClickListener(this);
	        button2.setOnClickListener(this);
	        btnCal.setOnClickListener(this);
	        btnFlames.setOnClickListener(this);
	        btnShake.setOnClickListener(this);
	    }
	    
    
		@Override
		public void onClick(View v) {
			
			
			InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE); 
			inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
			// TODO Auto-generated method stub
			String str1;
			int result,i;
			result = 0;
			str1=text1.getEditableText().toString();
			
			if (str1.compareTo("")!=0)
				{
					
			//str2=text2.getEditableText().toString();
			for(i=0;i<str1.length();i++)
			{
				
			if (str1.substring(i,i+1).compareTo("A") == 0 || str1.substring(i,i+1).compareTo("I") == 0  || str1.substring(i,i+1).compareTo("J") == 0 || str1.substring(i,i+1).compareTo("Q") == 0  || str1.substring(i,i+1).compareTo("Y") == 0 || str1.substring(i,i+1).compareTo("a") == 0 || str1.substring(i,i+1).compareTo("i") == 0  || str1.substring(i,i+1).compareTo("j") ==0|| str1.substring(i,i+1).compareTo("q")==0  || str1.substring(i,i+1).compareTo("y")==0)
				{
						result = result + 1;
				}
			else if (str1.substring(i,i+1).compareTo("B") == 0 || str1.substring(i,i+1).compareTo("K") == 0  || str1.substring(i,i+1).compareTo("R") == 0 || str1.substring(i,i+1).compareTo("b") == 0  || str1.substring(i,i+1).compareTo("k") == 0 || str1.substring(i,i+1).compareTo("r") == 0 )
				{
					result = result + 2;
				}
			else if (str1.substring(i,i+1).compareTo("C") == 0 || str1.substring(i,i+1).compareTo("G") == 0  || str1.substring(i,i+1).compareTo("L") == 0 || str1.substring(i,i+1).compareTo("S") == 0  || str1.substring(i,i+1).compareTo("c") == 0 || str1.substring(i,i+1).compareTo("g") == 0 || str1.substring(i,i+1).compareTo("l") == 0 || str1.substring(i,i+1).compareTo("s") == 0 )
				{
					result = result + 3;
				}
			else if (str1.substring(i,i+1).compareTo("D") == 0 || str1.substring(i,i+1).compareTo("M") == 0  || str1.substring(i,i+1).compareTo("T") == 0 || str1.substring(i,i+1).compareTo("d") == 0  || str1.substring(i,i+1).compareTo("m") == 0 || str1.substring(i,i+1).compareTo("t") == 0 )
				{
					result = result + 4;
				}
			else if (str1.substring(i,i+1).compareTo("E") == 0 || str1.substring(i,i+1).compareTo("H") == 0  || str1.substring(i,i+1).compareTo("N") == 0 || str1.substring(i,i+1).compareTo("X") == 0  || str1.substring(i,i+1).compareTo("e") == 0 || str1.substring(i,i+1).compareTo("h") == 0 || str1.substring(i,i+1).compareTo("n") == 0 || str1.substring(i,i+1).compareTo("x") == 0 )
				{
					result = result + 5;
				}
			else if (str1.substring(i,i+1).compareTo("U") == 0 || str1.substring(i,i+1).compareTo("V") == 0  || str1.substring(i,i+1).compareTo("W") == 0 || str1.substring(i,i+1).compareTo("u") == 0  || str1.substring(i,i+1).compareTo("v") == 0 || str1.substring(i,i+1).compareTo("w") == 0 )
				{
					result = result + 6;
				}

			else if (str1.substring(i,i+1).compareTo("O") == 0 || str1.substring(i,i+1).compareTo("Z") == 0  || str1.substring(i,i+1).compareTo("o") == 0 || str1.substring(i,i+1).compareTo("z") == 0  )
				{
					result = result + 7;
				}
			else if (str1.substring(i,i+1).compareTo("F") == 0 || str1.substring(i,i+1).compareTo("P") == 0  || str1.substring(i,i+1).compareTo("f") == 0 || str1.substring(i,i+1).compareTo("p") == 0  )
				{
					result = result + 8;
				}
					
			}	


			 if (v == button2)
			{
					//AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
					//alertDialog.setTitle("Result");
					//alertDialog.setMessage("Yes");
					//alertDialog.show();
					Intent myIntent = new Intent(v.getContext(), Random.class);
					myIntent.putExtra("random",result);
					startActivityForResult(myIntent,0);

			}		

			else if (v == button )
			{
					//AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
					//alertDialog.setTitle("Result");
					//alertDialog.setMessage("No");
					//alertDialog.show();
					Intent myIntent = new Intent(v.getContext(), Result.class);
					myIntent.putExtra("result", result);
			        startActivityForResult(myIntent,0);
					
			}		
		
			else if (v == btnCal)
			{
					//AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
					//alertDialog.setTitle("Result");
					//alertDialog.setMessage("No");
					//alertDialog.show();
					Intent myIntent = new Intent(v.getContext(), Percent.class);
					myIntent.putExtra("percent", result);
			        startActivityForResult(myIntent,0);
					
			}	
		
			else if (v == btnFlames)
			{
					//AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
					//alertDialog.setTitle("Result");
					//alertDialog.setMessage("No");
					//alertDialog.show();
					Intent myIntent = new Intent(v.getContext(), Flames.class);
					myIntent.putExtra("flames", result);
			        startActivityForResult(myIntent,0);
					
			}
			 
			 
		
		  }
			
			else
			{
				AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
				alertDialog.setTitle("Sorry !");
				alertDialog.setMessage("Enter any name pls !");
				alertDialog.show();
					
				
				
			}
			
			if (v == btnShake)
			{
					//AlertDialog alertDialog = new AlertDialog.Builder(Main.this).create();
					//alertDialog.setTitle("Result");
					//alertDialog.setMessage("No");
					//alertDialog.show();
					Intent myIntent = new Intent(v.getContext(), Shake.class);
					myIntent.putExtra("shake", result);
			        startActivityForResult(myIntent,0);
					
			}
			
			}
		}        