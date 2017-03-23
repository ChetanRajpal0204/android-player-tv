package com.cube.lush.player.mobile;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.cube.lush.player.mobile.nav.BottomNavigationItemSelectedListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
	@BindView(R2.id.navigation) BottomNavigationView navigation;
	@BindView(R2.id.container) FrameLayout container;

	@Override protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_phone);
		ButterKnife.bind(this);

		BottomNavigationItemSelectedListener navigationListener = new BottomNavigationItemSelectedListener(container, getSupportFragmentManager());
		navigation.setOnNavigationItemSelectedListener(navigationListener);

		navigationListener.showDefaultItem();
	}
}