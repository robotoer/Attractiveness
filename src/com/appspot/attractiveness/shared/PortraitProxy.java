package com.appspot.attractiveness.shared;

import com.appspot.attractiveness.server.Portrait;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * Proxy object for a {@link Portrait}. This is a lightweight interface used to
 * transport data between the client & server.
 * 
 * @author Robert Chu
 */
@ProxyForName(value = "com.appspot.attractiveness.server.Portrait", locator = "com.appspot.attractiveness.server.PortraitLocator")
public interface PortraitProxy extends ValueProxy {

	Long getKey();

	String getImageURL();

	void setImageURL(String imageURL);

	PersonProxy getPerson();

	void setPerson(PersonProxy person);

}
