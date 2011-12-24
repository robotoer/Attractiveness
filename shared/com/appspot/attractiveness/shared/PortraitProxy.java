package com.appspot.attractiveness.shared;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyForName(value = "com.appspot.attractiveness.server.Portrait", locator = "com.appspot.attractiveness.server.PortraitLocator")
public interface PortraitProxy extends ValueProxy {

	String getImageURL();

	void setImageURL(String imageURL);

	PersonProxy getPerson();

	void setPerson(PersonProxy person);

}
