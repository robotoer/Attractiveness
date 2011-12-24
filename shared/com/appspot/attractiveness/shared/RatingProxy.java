package com.appspot.attractiveness.shared;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyForName(value = "com.appspot.attractiveness.server.Rating", locator = "com.appspot.attractiveness.server.RatingLocator")
public interface RatingProxy extends ValueProxy {

	int getLabelerFacebookID();

	void setLabelerFacebookID(int labelerFacebookID);

	int getRating();

	void setRating(int rating);

	PortraitProxy getPortrait();

	void setPortrait(PortraitProxy portrait);

}
