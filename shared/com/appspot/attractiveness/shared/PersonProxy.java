package com.appspot.attractiveness.shared;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyForName(value = "com.appspot.attractiveness.server.Person", locator = "com.appspot.attractiveness.server.PersonLocator")
public interface PersonProxy extends ValueProxy {

	String getLanguage();

	void setLanguage(String language);

	int getAge();

	void setAge(int age);

	boolean isMale();

	void setMale(boolean isMale);

	boolean isAvailable();

	void setAvailable(boolean isAvailable);

}
