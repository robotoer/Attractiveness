package com.appspot.attractiveness.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Attractiveness implements EntryPoint {
	private VerticalPanel mainPanel = new VerticalPanel();
	private HorizontalPanel submitPanel = new HorizontalPanel();
	private VerticalPanel ratePanel = new VerticalPanel();
	private RadioButton rate1 = new RadioButton("rating", "1");
	private RadioButton rate2 = new RadioButton("rating", "2");
	private RadioButton rate3 = new RadioButton("rating", "3");
	private RadioButton rate4 = new RadioButton("rating", "4");
	private RadioButton rate5 = new RadioButton("rating", "5");
	private Button submitBtn = new Button("Rate!");
	private Image portrait = new Image("http://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Smiley.svg/600px-Smiley.svg.png");

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ratePanel.add(rate1);
		ratePanel.add(rate2);
		ratePanel.add(rate3);
		ratePanel.add(rate4);
		ratePanel.add(rate5);

		submitPanel.add(ratePanel);
		submitPanel.add(submitBtn);

		mainPanel.add(portrait);
		mainPanel.add(submitPanel);

		RootPanel.get("contentDiv").add(mainPanel);

		submitBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				String selected = "unselected";
				if (rate1.getValue())
					selected = "1";
				else if (rate2.getValue())
					selected = "2";
				else if (rate3.getValue())
					selected = "3";
				else if (rate4.getValue())
					selected = "4";
				else if (rate5.getValue())
					selected = "5";
				Window.alert("The rating selected: " + selected);
			}
		});
	}
}
