package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;

/**
 * This class contains the server side operations that can be performed on a
 * {@link Person} object. Documentation for this can be found:
 * <ul>
 * <li><a href=
 * "http://cleancodematters.wordpress.com/2011/06/04/tutorial-gwt-request-factory-part-i/"
 * >Tutorial GWT Request Factory – Part I</a></li>
 * <li><a href=
 * "http://code.google.com/webtoolkit/doc/latest/DevGuideRequestFactory.html"
 * >Getting Started with RequestFactory</a></li>
 * </ul>
 * TODO: This class needs to be filled in.
 * 
 * @author Robert Chu
 */
public class PersonLocator extends Locator<Person, Void> {

	@Override
	public Person create(Class<? extends Person> clazz) {
		return new Person();
	}

	@Override
	public Person find(Class<? extends Person> clazz, Void id) {
		return create(clazz);
	}

	@Override
	public Class<Person> getDomainType() {
		return Person.class;
	}

	@Override
	public Void getId(Person domainObject) {
		return null;
	}

	@Override
	public Class<Void> getIdType() {
		return Void.class;
	}

	@Override
	public Object getVersion(Person domainObject) {
		return null;
	}

}
