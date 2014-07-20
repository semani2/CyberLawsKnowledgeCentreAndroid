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
import android.widget.Button;
import android.os.Build;

public class HomeActivity extends ActionBarActivity {

	//UI Elements
		Button aboutUs, courses, faculty, contactUs;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.activity_home);
			
			// Setting the onClickListener for the Faculty button to navigate to the faculty activity
			faculty = (Button)findViewById(R.id.faculty);
			faculty.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                Intent toFacultyActivity = new Intent(HomeActivity.this, OurFaculty.class);
	                startActivity(toFacultyActivity);
	            }
	        });
			
			//Setting the onClickListener for the AboutUs button to navigate to the AboutUs activity
			aboutUs = (Button)findViewById(R.id.aboutUs);
			aboutUs.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
	            Intent toAboutUsActivity = new Intent(HomeActivity.this, AboutUs.class);
	            startActivity(toAboutUsActivity);
	        }});
			
			//Setting the onClickListener for the Courses button to navigate to the Courses activity
			courses = (Button)findViewById(R.id.courses);
			courses.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
	            Intent toHomeActivity = new Intent(HomeActivity.this, CoursesHome.class);
	            startActivity(toHomeActivity);
	        }});
			
			//Setting the onClickListener for the contact us button to navigate to the Contact Us Activity
			contactUs = (Button)findViewById(R.id.contactUs);
			contactUs.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
		            Intent toHomeActivity = new Intent(HomeActivity.this, ContactUs.class);
		            startActivity(toHomeActivity);
		        }});

		}

}
