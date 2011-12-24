package com.appspot.attractiveness.shared;

import com.appspot.attractiveness.server.Rating;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * Proxy object for a {@link Rating}. This is a lightweight interface used to
 * transport data between the client & server.
 * @author Robert Chu
 */
@ProxyForName(value = "com.appspot.attractiveness.server.Rating", locator = "com.appspot.attractiveness.server.RatingLocator")
public interface RatingProxy extends ValueProxy {

	int getLabelerFacebookID();

	void setLabelerFacebookID(int labelerFacebookID);

	int getRating();

	void setRating(int rating);

	PortraitProxy getPortrait();

	void setPortrait(PortraitProxy portrait);

}
