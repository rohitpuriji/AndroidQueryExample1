package com.example.androidqueryexample1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import com.androidquery.AQuery;
import com.androidquery.callback.ImageOptions;

/* This is based on Android query that is used to make code easier if we are using Asynchronous 
 * tasks and manipulating UI updates....So Write less, do more....  */

public class MainActivity extends Activity {

	private AQuery aq;
	private ProgressDialog dialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		dialog = new ProgressDialog(this);
		dialog.setTitle("AQuery");
		dialog.setMessage("Downloading....Please wait !");
		dialog.setIndeterminate(false);
		dialog.setMax(100);
		dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		dialog.setCancelable(false);
		
		ImageOptions options = new ImageOptions();
		options.round = 10;
		
		aq = new AQuery(this);
		aq.id(R.id.imgAQuery).progress(dialog).image("http://programmerguru.com/android-tutorial/wp-content/uploads/2014/01/asynctask_thumb.png",false,false);
		

	}

}
