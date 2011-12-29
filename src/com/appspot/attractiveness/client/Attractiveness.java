package com.appspot.attractiveness.client;

import com.appspot.attractiveness.shared.AttractivenessRequestFactory;
import com.appspot.attractiveness.shared.PersonProxy;
import com.appspot.attractiveness.shared.PersonRequest;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

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
	
	// Data layer stuff
	private AttractivenessRequestFactory requestFactory;

	/**
	 * This is the entry point method of our application.
	 * This method should do the following:
	 * <ul>
	 * <li>Gather and store the rater's facebook information
	 * <li>Construct the UI</li>
	 * </ul>
	 */
	public void onModuleLoad() {
		// Setup RequestFactory
		EventBus eventBus = new SimpleEventBus();
		requestFactory = GWT.create(AttractivenessRequestFactory.class);
		requestFactory.initialize(eventBus);
		
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
				PersonRequest request = requestFactory.personRequest();
				PersonProxy newPerson = request.create(PersonProxy.class);
//				newPerson.setAge(21);
//				newPerson.setAvailable(false);
//				newPerson.setLanguage("en");
//				newPerson.setMale(true);
//				request.persist().using(newPerson).fire(new Receiver<Void>() {
//					@Override
//					public void onSuccess(Void response) {
//						Window.alert("Successfully added person!");
//					}
//					
//					@Override
//					public void onFailure(ServerFailure error) {
//						super.onFailure(error);
//						Window.alert("Failed to add person!");
//					}
//				});
				
				Window.alert("Rating: " + rating);
			}
		});
	}
}
