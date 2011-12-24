package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;

/**
 * This class contains the server side operations that can be performed on a
 * {@link Portrait} object. Documentation for this can be found:
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
public class PortraitLocator extends Locator<Portrait, Void> {

	@Override
	public Portrait create(Class<? extends Portrait> clazz) {
		return new Portrait();
	}

	@Override
	public Portrait find(Class<? extends Portrait> clazz, Void id) {
		return create(clazz);
	}

	@Override
	public Class<Portrait> getDomainType() {
		return Portrait.class;
	}

	@Override
	public Void getId(Portrait domainObject) {
		return null;
	}

	@Override
	public Class<Void> getIdType() {
		return Void.class;
	}

	@Override
	public Object getVersion(Portrait domainObject) {
		return null;
	}

}
