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
