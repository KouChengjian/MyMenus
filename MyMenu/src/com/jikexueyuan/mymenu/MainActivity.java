package com.jikexueyuan.mymenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity {

	private MainUI mainUI;
	MenuUI menuUI;
	private LeftMenu leftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		menuUI = new MenuUI(this);
//		setContentView(menuUI);
//		leftMenu = new LeftMenu();
//		getSupportFragmentManager().beginTransaction()
//				.add(MainUI.MIDEELE_ID, leftMenu).commit();
//		mainUI = new MainUI(this);
//		setContentView(mainUI);
//		leftMenu = new LeftMenu();
//		getSupportFragmentManager().beginTransaction()
//				.add(MainUI.LEFT_ID, leftMenu).commit();
		View view = LayoutInflater.from(this).inflate(R.layout.left, null);
		LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(      
                LinearLayout.LayoutParams.WRAP_CONTENT,      
                LinearLayout.LayoutParams.WRAP_CONTENT      
        );   
		view.setLayoutParams(p);
		getViewGroup().addView(view);
	}
	
	private ViewGroup getViewGroup() {
        return (ViewGroup) this.findViewById(Window.ID_ANDROID_CONTENT);
        //return (ViewGroup) GSYApplication.getInstance().getWindow().findViewById(Window.ID_ANDROID_CONTENT);
    }

}
