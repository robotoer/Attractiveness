package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;


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
