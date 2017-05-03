package com.jikexueyuan.mymenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

	private MainUI mainUI;
	MenuUI menuUI;
	private LeftMenu leftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		menuUI = new MenuUI(this);
		setContentView(menuUI);
		leftMenu = new LeftMenu();
		getSupportFragmentManager().beginTransaction()
				.add(MainUI.MIDEELE_ID, leftMenu).commit();
//		mainUI = new MainUI(this);
//		setContentView(mainUI);
//		leftMenu = new LeftMenu();
//		getSupportFragmentManager().beginTransaction()
//				.add(MainUI.LEFT_ID, leftMenu).commit();
	}

}
