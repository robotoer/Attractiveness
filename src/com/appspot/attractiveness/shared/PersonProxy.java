package com.appspot.attractiveness.shared;

import com.appspot.attractiveness.server.Person;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * Proxy object for a {@link Person}. This is a lightweight interface used to
 * transport data between the client & server.
 * 
 * @author Robert Chu
 */
@ProxyForName(value = "com.appspot.attractiveness.server.Person", locator = "com.appspot.attractiveness.server.PersonLocator")
public interface PersonProxy extends ValueProxy {

	Long getKey();

	String getLanguage();

	void setLanguage(String language);

	int getAge();

	void setAge(int age);

	boolean isMale();

	void setMale(boolean isMale);

	boolean isAvailable();

	void setAvailable(boolean isAvailable);

}
