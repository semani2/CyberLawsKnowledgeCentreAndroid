package com.example.cyberlawsknowledgecenter;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.TextView;
import android.os.Build;

public class ContactUs extends ActionBarActivity {

	// UI TextView
	TextView website, email, telephone;
	ImageButton backButton;
	LinearLayout linearLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_contact_us);
		
		// Back to Home
				linearLayout = (LinearLayout) findViewById(R.id.linearLayout1);
				backButton = (ImageButton) linearLayout.findViewById(R.id.backButton);
				backButton.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
				Intent intent = new Intent(ContactUs.this, HomeActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); 
				startActivity(intent);
					 }});;
	
	}
	// Open website
	public void openWebsite(View v)
	{
		
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse("http://cyberlawsknowledgece.wix.com/clkc"));
		startActivity(i);
	}

	
	public void openEmail(View v)
	{
		Intent sendIntent = new Intent(Intent.ACTION_VIEW);
		sendIntent.setType("plain/text");
		sendIntent.setData(Uri.parse("cyberlawsknowledgecentre@gmail.com"));
		sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
		startActivity(sendIntent);
	}
	
	public void callPhone(View v)
	{
		Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+91 99491 83863"));
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_us, menu);
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
