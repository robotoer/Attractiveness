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

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

/**
 * Singleton class to manage the {@link PersistenceManagerFactory}. Use this
 * class's static PMF.get().getPersistenceManager() method to access a
 * {@link PersistenceManager}. This code came from the <a href=
 * "http://code.google.com/appengine/docs/java/datastore/jdo/overview.html#Getting_a_PersistenceManager_Instance"
 * >Google App Engine documentation</a>.
 * 
 * @author Robert Chu
 */
public final class PMF {
	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	/**
	 * Since this is a singleton, prevent instantiation.
	 */
	private PMF() {
	}

	/**
	 * @return an instance of {@link PersistenceManagerFactory} to use for
	 *         accessing the Datastore. To access a {@link PersistenceManager}
	 *         call PMF.get().getPersistenceManager().
	 */
	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}
}
