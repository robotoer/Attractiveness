package com.appspot.attractiveness.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Attractiveness implements EntryPoint {
	/**
	 * This is the entry point method of our application.
	 */
	public void onModuleLoad() {
		RootPanel.get("contentDiv").add(new RatingWidget());
	}
}
