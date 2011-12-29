package com.appspot.attractiveness.shared;

import java.util.List;

import com.appspot.attractiveness.server.Person;
import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Person.class)
public interface PersonRequest extends RequestContext {
	Request<Long> countPeople();
	
	Request<List<PersonProxy>> findAllPeople();
	
	Request<PersonProxy> findPerson(Long id);
	
	InstanceRequest<PersonProxy, Void> persist();
	
	InstanceRequest<PersonProxy, Void> remove();
}
