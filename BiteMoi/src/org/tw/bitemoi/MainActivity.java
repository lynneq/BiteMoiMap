package org.tw.bitemoi;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.RelativeLayout;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout layout = new RelativeLayout(this);
		super.setContentView(layout);
		setContentView(R.layout.activity_main);

	}
}
