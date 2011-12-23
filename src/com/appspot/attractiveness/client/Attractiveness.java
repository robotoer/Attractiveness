package com.appspot.attractiveness.client;

import javax.jdo.PersistenceManager;

import com.appspot.attractiveness.PMF;
import com.appspot.attractiveness.Portrait;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Attractiveness implements EntryPoint {
	// Some semblance of organized layout.  This should probably be in static code eventually
	private VerticalPanel mainPanel = new VerticalPanel();
	private HorizontalPanel submitPanel = new HorizontalPanel();
	private VerticalPanel ratePanel = new VerticalPanel();
	
	// The dynamic elements! (kinda)
	private RadioButton rate1 = new RadioButton("rating", "1");
	private RadioButton rate2 = new RadioButton("rating", "2");
	private RadioButton rate3 = new RadioButton("rating", "3");
	private RadioButton rate4 = new RadioButton("rating", "4");
	private RadioButton rate5 = new RadioButton("rating", "5");
	private Button submitBtn = new Button("Rate!");
	private Image portrait = new Image("http://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Smiley.svg/600px-Smiley.svg.png");
	
	// For storing state
	//private Cursor current;

	/**
	 * This is the entry point method of our application.
	 * This method should do the following:
	 * <ul>
	 * <li>Gather and store the rater's facebook information
	 * <li>Construct the UI</li>
	 * </ul>
	 */
	public void onModuleLoad() {
		//PersistenceManager pm = PMF.get().getPersistenceManager();
		
		// Gather & store user's facebook information
		// TODO: actually do this
		
		// Get image URL to use
		// TODO: actually do this using cursors and stuff
		
		// Build the UI.  Hooray for in code UI building!
		ratePanel.add(rate1);
		ratePanel.add(rate2);
		ratePanel.add(rate3);
		ratePanel.add(rate4);
		ratePanel.add(rate5);
		submitPanel.add(ratePanel);
		submitPanel.add(submitBtn);
		//portrait.setUrl();
		mainPanel.add(portrait);
		mainPanel.add(submitPanel);
		RootPanel.get("contentDiv").add(mainPanel);

		// Add the click handler.  This should:
		//  - Save the labeled image to the datastore
		//  - Load the next image and reset the UI
		submitBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				// Get the rating
				int rating = 0;
				if (rate1.getValue())
					rating = 1;
				else if (rate2.getValue())
					rating = 2;
				else if (rate3.getValue())
					rating = 3;
				else if (rate4.getValue())
					rating = 4;
				else if (rate5.getValue())
					rating = 5;
				
				// Save the rating to the datastore
			}
		});
	}
}
