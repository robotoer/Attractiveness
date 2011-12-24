package com.appspot.attractiveness.server;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * A Rating represents one labeling for a {@link Portrait} (an image of a
 * person).
 * 
 * Following the JDO model, this can be thought of as a table in the datastore
 * where each row is one record of a rating. This object is a JDO entity
 * allowing it to be stored in the Google App Engine Datastore.
 * 
 * @author Robert Chu
 */
@PersistenceCapable
public class Rating {
	// ... Fields ...

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private int labelerFacebookID;

	@Persistent
	private int rating;

	@Persistent
	private Portrait portrait;

	// ... Constructors ...

	/**
	 * Constructs a {@link Rating} object.
	 * 
	 * @param labelerFacebookID
	 *            unique Facebook account ID number of the user labeling the
	 *            current portrait. This should be easy to get from the <a
	 *            href="http://developers.facebook.com/docs/reference/api/"
	 *            >Facebook API</a>.
	 * @param rating
	 *            the rating that the user gave this portrait. This should be a
	 *            number ranging from 1 to 5.
	 * @param portraitID
	 *            the identifying key for the {@link Portrait} that this
	 *            {@link Rating} is about. This should be easy to obtain by
	 *            using the {@link Portrait}.getKey() method.
	 */
	public Rating(int labelerFacebookID, int rating, Portrait portrait) {
		this.labelerFacebookID = labelerFacebookID;
		this.rating = rating;
		this.portrait = portrait;
	}

	// ... Accessors ...

	/**
	 * @return the key of this {@link Rating} in the Datastore
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * @return the labelerFacebookID
	 */
	public int getLabelerFacebookID() {
		return labelerFacebookID;
	}

	/**
	 * @param labelerFacebookID
	 *            the labelerFacebookID to set
	 */
	public void setLabelerFacebookID(int labelerFacebookID) {
		this.labelerFacebookID = labelerFacebookID;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the portraitID
	 */
	public Portrait getPortrait() {
		return portrait;
	}

	/**
	 * @param portraitID
	 *            the portraitID to set
	 */
	public void setPortrait(Portrait portrait) {
		this.portrait = portrait;
	}
}
