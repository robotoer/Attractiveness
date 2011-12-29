package com.appspot.attractiveness.shared;

import java.util.List;

import com.appspot.attractiveness.server.Rating;
import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Rating.class)
public interface RatingRequest extends RequestContext {
	Request<Long> countRatings();
	
	Request<List<RatingProxy>> findAllRatings();
	
	Request<RatingProxy> findRating(Long id);
	
	InstanceRequest<RatingProxy, Void> persist();
	
	InstanceRequest<RatingProxy, Void> remove();
}
