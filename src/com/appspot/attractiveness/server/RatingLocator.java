package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;

/**
 * This class contains the server side operations that can be performed on a
 * {@link Rating} object. Documentation for this can be found:
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
public class RatingLocator extends Locator<Rating, Void> {

	@Override
	public Rating create(Class<? extends Rating> clazz) {
		return new Rating();
	}

	@Override
	public Rating find(Class<? extends Rating> clazz, Void id) {
		return create(clazz);
	}

	@Override
	public Class<Rating> getDomainType() {
		return Rating.class;
	}

	@Override
	public Void getId(Rating domainObject) {
		return null;
	}

	@Override
	public Class<Void> getIdType() {
		return Void.class;
	}

	@Override
	public Object getVersion(Rating domainObject) {
		return null;
	}

}
