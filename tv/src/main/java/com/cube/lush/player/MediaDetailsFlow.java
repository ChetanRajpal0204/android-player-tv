package com.cube.lush.player;

import android.support.annotation.NonNull;

import com.cube.lush.player.model.MediaContent;

/**
 * @author Jamie Cruwys
 * @project lush-player-android-client
 */
public interface MediaDetailsFlow
{
	/**
	 * Populates the content view with the given {@link MediaContent}.
	 * You MUST call {@link #revealContentView()} at the end of your implementation of this method.
	 * @param item that will be used to populate the view
	 */
	void populateContentView(@NonNull MediaContent item);

	/**
	 * Makes the content view visible.
	 * This should be called when the content view has been successfully populated.
	 * You MUST call {@link #populateHiddenView(MediaContent)} at the end of your implementation of this method.
	 * For most cases, this should ALWAYS be called at the END of {@link #populateContentView(MediaContent)}.
	 * If any loading is asynchronous, then this should be called once all asynchronous populating has been completed.
	 */
	void revealContentView();

	/**
	 * Populates the hidden content view with the given {@link MediaContent}.
	 * This should be called when the content view has been successfully revealed.
	 * You MUST call {@link #revealHiddenView()} at the end of your implementation of this method.
	 * @param item that will be used to populate the view
	 */
	void populateHiddenView(@NonNull MediaContent item);

	/**
	 * Makes the hidden content view visible.
	 * This should only be called when the hidden content view has been successfully populated.
	 * If any loading is asynchronous, then this should be called once all asynchronous populating has been completed.
	 */
	void revealHiddenView();
}