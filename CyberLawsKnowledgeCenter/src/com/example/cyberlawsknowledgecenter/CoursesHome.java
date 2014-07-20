package com.example.cyberlawsknowledgecenter;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.os.Build;

public class CoursesHome extends ActionBarActivity {
	
	ImageButton itLawButton, cyberLawButton, iprLawButton, cddpLawButton;
	ImageButton backButton;
	LinearLayout linearLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_courses_home);
		
		// Retreiving UI elements
		itLawButton = (ImageButton)findViewById(R.id.itLawButton);
		cyberLawButton = (ImageButton)findViewById(R.id.cyberLawButton);
		iprLawButton = (ImageButton)findViewById(R.id.iprLawButton);
		cddpLawButton = (ImageButton)findViewById(R.id.cddpLawButton);
		
		// Setting on Click Listeners with pay load to navigate to each course page
		itLawButton.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
		            Intent toCourse = new Intent(CoursesHome.this, ItLawCourse.class);
		            startActivity(toCourse);
		        }});;
		        
		cyberLawButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
	            Intent toCourse = new Intent(CoursesHome.this, CyberLawCourse.class);
	            startActivity(toCourse);
	        }});;
	        
	    iprLawButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		            Intent toCourse = new Intent(CoursesHome.this, IprLawCourse.class);
		            startActivity(toCourse);
		        }});;
		        
		cddpLawButton.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
				            Intent toCourse = new Intent(CoursesHome.this, CDDCPActivity.class);
				            startActivity(toCourse);
				        }});;
				        
				     // Back to Home
						linearLayout = (LinearLayout) findViewById(R.id.linearLayout1);
						backButton = (ImageButton) linearLayout.findViewById(R.id.backButton);
						backButton.setOnClickListener(new OnClickListener() {
							public void onClick(View v) {
						Intent intent = new Intent(CoursesHome.this, HomeActivity.class);
						intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); 
						startActivity(intent);
							 }});;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.courses_home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
