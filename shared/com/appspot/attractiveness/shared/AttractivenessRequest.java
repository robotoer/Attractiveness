package com.appspot.attractiveness.shared;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;

@ServiceName(value = "com.appspot.attractiveness.server.AttractivenessService", locator = "com.appspot.attractiveness.server.AttractivenessServiceLocator")
public interface AttractivenessRequest extends RequestContext {

	Request<RatingProxy> createRating();

	Request<RatingProxy> readRating(Long id);

	Request<RatingProxy> updateRating(RatingProxy rating);

	Request<Void> deleteRating(RatingProxy rating);

	Request<List<RatingProxy>> queryRatings();

	Request<PortraitProxy> createPortrait();

	Request<PortraitProxy> readPortrait(Long id);

	Request<PortraitProxy> updatePortrait(PortraitProxy portrait);

	Request<Void> deletePortrait(PortraitProxy portrait);

	Request<List<PortraitProxy>> queryPortraits();

	Request<PersonProxy> createPerson();

	Request<PersonProxy> readPerson(Long id);

	Request<PersonProxy> updatePerson(PersonProxy person);

	Request<Void> deletePerson(PersonProxy person);

	Request<List<PersonProxy>> queryPersons();

}
