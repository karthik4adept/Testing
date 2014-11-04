package com.karthik.sample.demo1;

import com.example.android.mediafx.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Main extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	GridView gridView= (GridView) findViewById(R.id.gridOne);
}
}
