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
package com.appspot.attractiveness.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;

/**
 * This class is used to access JSON data from a facebook OpenGraph API call.
 * This particular object is used to get identifying information about the user.
 * This class has been implemented following the Javascript Overlay Types design
 * pattern outlined in the <a href=
 * "http://code.google.com/webtoolkit/doc/latest/DevGuideCodingBasicsOverlay.html"
 * >Google Web Toolkit Documentation</a>
 * 
 * @author Robert Chu
 */
public class PersonJso extends JavaScriptObject {
	protected PersonJso() {
	}
	
	/**
	 * Create and populate a {@link PersonJso} object from a JSON string.
	 * @param json the JSON string to convert
	 * @return the {@link PersonJso} object
	 */
	public static final PersonJso fromJSON(String json) {
		JSONObject obj = JSONParser.parseStrict(json).isObject();
		if(obj == null)
			return null;
		else
			return obj.getJavaScriptObject().cast();
	}

	// I only implemented the basic features that we initially scoped out.
	public final native String getGender() /*-{
		return this.gender;
	}-*/;

	public final native String getBirthday() /*-{
		return this.birthday;
	}-*/;

	public final native String getRelationshipStatus() /*-{
		return this.relationship_status;
	}-*/;

	public final native String getLocale() /*-{
		return this.locale;
	}-*/;

	public final Boolean isMale() {
		String gender = getGender();
		if (gender == null)
			return null;
		else
			return gender.equalsIgnoreCase("male");
	}

	public final Boolean isAvailable() {
		String status = getRelationshipStatus();
		if (status == null)
			return null;
		else
			return status.equalsIgnoreCase("single")
					|| status.equalsIgnoreCase("divorced");
	}
	
	public final Integer getAge() {
		String birthday = getBirthday();
		if(birthday == null)
			return null;
		else {
			return 0;
			// TODO: This should use GWT DateTime: http://code.google.com/p/gwt-examples/wiki/gwtDateTime
//			DateTime parsedBirthday = DateTimeFormat.forPattern("MM/dd/yyyy").parseDateTime(birthday); 
//			return Years.yearsBetween(parsedBirthday, new DateTime()).getYears();
		}
	}
}
