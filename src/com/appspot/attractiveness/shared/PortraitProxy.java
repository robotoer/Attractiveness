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
package com.appspot.attractiveness.shared;

import com.appspot.attractiveness.server.Portrait;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * Proxy object for a {@link Portrait}. This is a lightweight interface used to
 * transport data between the client & server.
 * 
 * @author Robert Chu
 */
@ProxyForName(value = "com.appspot.attractiveness.server.Portrait", locator = "com.appspot.attractiveness.server.PortraitLocator")
public interface PortraitProxy extends ValueProxy {

	Long getKey();

	String getImageURL();

	void setImageURL(String imageURL);

	PersonProxy getPerson();

	void setPerson(PersonProxy person);

}
