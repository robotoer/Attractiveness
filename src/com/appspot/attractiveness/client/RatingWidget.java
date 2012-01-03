/**
 * 
 */
package com.appspot.attractiveness.client;

import com.appspot.attractiveness.shared.AttractivenessRequestFactory;
import com.appspot.attractiveness.shared.PersonProxy;
import com.appspot.attractiveness.shared.PersonRequest;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

/**
 * @author Robert Chu
 */
public class RatingWidget extends Composite implements EntryPoint {

	private static RatingWidgetUiBinder uiBinder = GWT
			.create(RatingWidgetUiBinder.class);

	private static final String FB_OPENGRAPH_URL = "https://graph.facebook.com/";

	interface RatingWidgetUiBinder extends UiBinder<Widget, RatingWidget> {
	}

	// UI stuff
	@UiField
	protected RadioButton r1;
	@UiField
	protected RadioButton r2;
	@UiField
	protected RadioButton r3;
	@UiField
	protected RadioButton r4;
	@UiField
	protected RadioButton r5;
	@UiField
	protected Button submitBtn;
	@UiField
	protected Image portrait;
	@UiField
	protected Label fbInfo;

	// Data layer stuff
	private AttractivenessRequestFactory requestFactory;

	/**
	 * This method should do the following:
	 * <ul>
	 * <li>Gather and store the rater's Facebook information
	 * <li>Construct the UI</li>
	 * </ul>
	 */
	public RatingWidget() {
		initWidget(uiBinder.createAndBindUi(this));

		// Setup RequestFactory
		EventBus eventBus = new SimpleEventBus();
		requestFactory = GWT.create(AttractivenessRequestFactory.class);
		requestFactory.initialize(eventBus);

		// Gather & store user's facebook information
		//String userID = Window.Location.getParameter("user_id");
		String userID = Window.Location.getQueryString();
		if (userID == null || userID.isEmpty()) {
			fbInfo.setText("Not logged in");
		} else {
			fbInfo.setText("user_id = " + userID);
//			String fbQueryUrl = FB_OPENGRAPH_URL + userID;
//			fbQueryUrl = URL.encode(fbQueryUrl);
//			try {
//				new RequestBuilder(RequestBuilder.GET, fbQueryUrl).sendRequest(
//						null, new RequestCallback() {
//							@Override
//							public void onResponseReceived(Request request,
//									Response response) {
//								// TODO: Do stuff with json result
//								response.getText();
//							}
//
//							@Override
//							public void onError(Request request,
//									Throwable exception) {
//
//							}
//						});
//			} catch (RequestException ex) {
//				Window.alert(ex.getMessage());
//			}
		}

		// Get image URL to use
		// TODO: actually do this using cursors and stuff
	}

	@UiHandler("submitBtn")
	protected void onClick(ClickEvent e) {
		// Get the rating
		int rating = 0;
		if (r1.getValue())
			rating = 1;
		else if (r2.getValue())
			rating = 2;
		else if (r3.getValue())
			rating = 3;
		else if (r4.getValue())
			rating = 4;
		else if (r5.getValue())
			rating = 5;

		// Save the rating to the datastore
		PersonRequest request = requestFactory.personRequest();
		PersonProxy newPerson = request.create(PersonProxy.class);
		newPerson.setAge(21);
		newPerson.setAvailable(false);
		newPerson.setLanguage("en");
		newPerson.setMale(true);
		request.persist().using(newPerson).fire(new Receiver<Void>() {
			@Override
			public void onSuccess(Void response) {
				Window.alert("Successfully added person!");
			}

			@Override
			public void onFailure(ServerFailure error) {
				super.onFailure(error);

				Window.alert("Failed to add person!");
			}
		});
	}

	/**
	 * Entry point classes define <code>onModuleLoad()</code>.
	 */
	@Override
	public void onModuleLoad() {
		RootPanel.get("contentDiv").add(new RatingWidget());
	}

}
