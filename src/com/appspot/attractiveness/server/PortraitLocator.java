/**
 * Copyright (C) 2011 Robert Chu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
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
