package com.appspot.attractiveness.shared;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface AttractivenessRequestFactory extends RequestFactory {
	PersonRequest personRequest();
	
	PortraitRequest portraitRequest();
	
	RatingRequest ratingRequest();
}
