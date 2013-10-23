package com.example.jashpredicts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.ScrollView;
import android.widget.TextView;
import android.app.AlertDialog;
//import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;


public class Flames extends Activity implements Shaker.Callback, OnClickListener{
	 /** Called when the activity is first created. */
	EditText text1;
	TextView lbl,desc;
	Button button;
	int count=0;
	private Shaker shaker=null;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flames);
        text1=(EditText) findViewById(R.id.txtPair);
        lbl= (TextView) findViewById( R.id.lblFlames);
        desc= (TextView) findViewById( R.id.lblFlamesDesc);
        button=(Button) findViewById(R.id.btnC);
        button.setOnClickListener(this);
		int resultFromMainScreen=getIntent().getIntExtra("flames", RESULT_OK);
        shaker=new Shaker(this, 1.25d, 500, this);
      
     }
    
    @Override
    public void onDestroy() {
      super.onDestroy();
      
      shaker.close();
    }
    
    public void shakingStarted() {
	
  }
    
    public void shakingStopped() {
//      Log.d("ShakerDemo", "Shaking stopped!");
//     transcript.setText(transcript.getText().toString()+"Shaking stopped\n");
//     scroll.fullScroll(View.FOCUS_DOWN);
    	InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE); 
		inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
		
    	
    	count = count + 1;
if (count<=1)
{
	

		String str;
		str = text1.getEditableText().toString();
		
		if (str.compareTo("")==0)
		{
			AlertDialog alertDialog1 = new AlertDialog.Builder(Flames.this).create();
			alertDialog1.setTitle("Sorry !");
			alertDialog1.setMessage("Enter any name pls !");
			alertDialog1.show();
				
		}
		else
		{
			
		// TODO Auto-generated method stub
			
			int choice = (int)(6.0 * Math.random()) + 1;
			
			if ( choice==0)
			{
			choice = 1;
			}
			
			switch (choice)
			{
			case 1:
			{
				lbl.setText("F");
				desc.setText("Friend :)");
				break;
			}
			
			case 2:
			{
				lbl.setText("L");
				desc.setText("Love :P");
				break;
			}
			
			case 3:
			{
				lbl.setText("A");
				desc.setText("Affection :D");
				break;
			}
			
			case 4:
			{
				lbl.setText("M");
				desc.setText("Marriage B-)");
				break;
			}
			
			case 5:
			{
				lbl.setText("E");
				desc.setText("Enemy ;-)");
				break;
			}
			
			case 6:
			{
				lbl.setText("S");
				desc.setText("Sissy :(");
				break;
			}
			
			default:
			{
				lbl.setText("A");
				desc.setText("Affection :)");
				break;
			}
			}
		}			
	}
    }
  
    @Override
	public void onClick(View v) {
    	
    	InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE); 
		inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
		
    	
		count = count + 1;
if (count<=1)
{
	

		String str;
		str = text1.getEditableText().toString();
		
		if (str.compareTo("")==0)
		{
			AlertDialog alertDialog1 = new AlertDialog.Builder(Flames.this).create();
			alertDialog1.setTitle("Sorry !");
			alertDialog1.setMessage("Enter any name pls !");
			alertDialog1.show();
				
		}
		else
		{
			
		// TODO Auto-generated method stub
			
			int choice = (int)(6.0 * Math.random()) + 1;
			
			if ( choice==0)
			{
			choice = 1;
			}
			
			switch (choice)
			{
			case 1:
			{
				lbl.setText("F");
				desc.setText("Friend :)");
				break;
			}
			
			case 2:
			{
				lbl.setText("L");
				desc.setText("Love :P");
				break;
			}
			
			case 3:
			{
				lbl.setText("A");
				desc.setText("Affection :D");
				break;
			}
			
			case 4:
			{
				lbl.setText("M");
				desc.setText("Marriage B-)");
				break;
			}
			
			case 5:
			{
				lbl.setText("E");
				desc.setText("Enemy ;-)");
				break;
			}
			
			case 6:
			{
				lbl.setText("S");
				desc.setText("Sissy :(");
				break;
			}
			
			default:
			{
				lbl.setText("A");
				desc.setText("Affection :)");
				break;
			}
			}
		}			
	}
	}		
    }

		
	
	
