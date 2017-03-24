package com.cube.lush.player.mobile.content;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cube.lush.player.R;

public class ContentFragment extends Fragment
{
	public ContentFragment()
	{
		// Required empty public constructor
	}

	public static ContentFragment newInstance()
	{
		ContentFragment fragment = new ContentFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	@Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_content, container, false);
	}
}