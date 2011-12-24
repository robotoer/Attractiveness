package com.appspot.attractiveness.server;

import com.google.web.bindery.requestfactory.shared.Locator;


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
