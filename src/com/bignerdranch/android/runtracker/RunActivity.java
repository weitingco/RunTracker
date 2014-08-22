package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

public class RunActivity extends SingleFragmentActivity {
	/** A key for passing a run Id as a long*/
	public static final String EXTRA_RUN_ID = 
			"com.bignerdranch.android.runtracker";
	@Override
	protected Fragment createFragment() {
		long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
		if(runId != -1){
			return RunFragment.newInstance(runId);
		} else{
			return new RunFragment();
		}
	}
	
}
