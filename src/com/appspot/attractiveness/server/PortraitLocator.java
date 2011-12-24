package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;


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
