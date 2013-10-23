package com.example.jashpredicts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
//import android.app.AlertDialog;

public class Result extends Activity {

	TextView result,remarks;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.result);
		 result=(TextView) findViewById(R.id.lblResult);
		 remarks=(TextView) findViewById(R.id.lblRemarks);
		 int resultFromMainScreen=getIntent().getIntExtra("result", RESULT_OK);
		
		 int sum = 0 ,rem = 0 ;
		 while(resultFromMainScreen>=1)
		 {
			 rem = resultFromMainScreen % 10;
			 resultFromMainScreen = resultFromMainScreen / 10;
			 sum = sum + rem ;
		 }
		 
		 if (sum == 10)
		 {
			 sum = 1;
		 }
		 result.setText(String.valueOf(sum));
		 
		 switch(sum)
		 {
		 case 1:
		 {
			 remarks.setText("a Great Leader");
			 break;
		 }
		 case 2:
		 {
			 remarks.setText("Reserved and Shy");
			 break;
		 }
		 case 3:
		 {
			 remarks.setText("Highly Attractive");
			 break;
		 }
		 case 4:
		 {
			 remarks.setText("Kind and Trusty");
			 break;
		 }
		 case 5:
		 {
			 remarks.setText("Stimulating");
			 break;
		 }
		 case 6:
		 {
			 remarks.setText("Very Understanding");
			 break;
		 }
		 case 7:
		 {
			 remarks.setText("a Mysterious person");
			 break;
		 }
		 case 8:
		 {
			 remarks.setText("an Extremist");
			 break;
		 }
		 case 9:
		 {
			 remarks.setText("Person of Principles");
			 break;
		 }
		 
		 }
	}
}
