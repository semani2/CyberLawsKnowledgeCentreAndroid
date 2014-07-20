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
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.os.Build;

public class OurFaculty extends ActionBarActivity {

	ImageButton backButton;
	LinearLayout linearLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_our_faculty);
		
		// Back to Home
				linearLayout = (LinearLayout) findViewById(R.id.linearLayout1);
				backButton = (ImageButton) linearLayout.findViewById(R.id.backButton);
				backButton.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
				Intent intent = new Intent(OurFaculty.this, HomeActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); 
				startActivity(intent);
					 }});;
	}


}
