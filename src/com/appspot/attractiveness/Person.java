package com.appspot.attractiveness;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * A Person represents a human being (duh).
 * 
 * This object should contain all interesting and relevant information that may
 * be related to attractiveness with the exception of pictures of them. Images
 * of Persons should be stored using the {@link Portrait} object.
 * 
 * @author Robert Chu
 */
@PersistenceCapable
public class Person {
	// ... Fields ...

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	// ... Constructors ...

	/**
	 * May also want to store:
	 * - Ethnicity
	 * - Age
	 * - Gender
	 * - etc.
	 */
	public Person() {
	}

	// ... Accessors ...

	/**
	 * @return the key
	 */
	public Key getKey() {
		return key;
	}
}
