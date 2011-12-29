package com.appspot.attractiveness.shared;

import java.util.List;

import com.appspot.attractiveness.server.Portrait;
import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Portrait.class)
public interface PortraitRequest extends RequestContext {
	Request<Long> countPortraits();
	
	Request<List<PortraitProxy>> findAllPortraits();
	
	Request<PortraitProxy> findPortrait(Long id);
	
	InstanceRequest<PortraitProxy, Void> persist();
	
	InstanceRequest<PortraitProxy, Void> remove();
}
