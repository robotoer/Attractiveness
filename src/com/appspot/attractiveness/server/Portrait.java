package com.appspot.attractiveness.server;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * A Portrait represents one image of a {@link Person}.
 * 
 * This Portrait may be referenced by multiple instances of {@link Rating} and
 * should contain one reference to a {@link Person} object. This object is a JDO
 * entity allowing it to be stored in the Google App Engine Datastore.
 * 
 * @author Robert Chu
 */
@PersistenceCapable
public class Portrait {
	// ... Fields ...

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String imageURL;

	@Persistent
	private Person person;

	// ... Constructors ...

	/**
	 * Constructs an empty {@link Portrait} object.
	 */
	public Portrait() {
	}

	/**
	 * Constructs a {@link Portrait} object.
	 * 
	 * @param imageURL
	 *            a URL leading to the actual image represented by this object.
	 *            Make sure that these image links work for people without
	 *            facebook accounts.
	 * @param personID
	 *            the identifying key for the {@link Person} object that this
	 *            {@link Portrait} is of.
	 */
	public Portrait(String imageURL, Person person) {
		this.imageURL = imageURL;
		this.person = person;
	}

	// ... Accessors ...

	/**
	 * @return the key of this {@link Portrait} in the Datastore
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL
	 *            the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * @return the personID
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param personID
	 *            the personID to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
}
