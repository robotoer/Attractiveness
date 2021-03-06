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

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

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
	private Long key;

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
	public Long getKey() {
		return key;
	}

	/**
	 * @param key
	 *            try avoiding setting the key manually. This should be
	 *            autogenerated.
	 */
	public void setKey(Long key) {
		this.key = key;
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

	// ... Request Implementation ...

	public static final PersistenceManager persistenceManager() {
		return PMF.get().getPersistenceManager();
	}

	public static long countPortraits() {
		return 0;
	}

	public static List<Portrait> findAllPortraits() {
		PersistenceManager pm = persistenceManager();
		try {
			return new ArrayList<Portrait>(pm.detachCopyAll(pm
					.getManagedObjects(Portrait.class)));
		} finally {
			pm.close();
		}
	}

	public static Portrait findPortrait(Long id) {
		PersistenceManager pm = persistenceManager();
		try {
			Portrait found = pm.getObjectById(Portrait.class, id);
			return pm.detachCopy(found);
		} finally {
			pm.close();
		}
	}

	/**
	 * Makes this instance of {@link Portrait} persistent.
	 */
	public void persist() {
		PersistenceManager pm = persistenceManager();
		try {
			pm.makePersistent(this);
		} finally {
			pm.close();
		}
	}

	/**
	 * Makes this instance of {@link Portrait} non-persistent.
	 */
	public void remove() {
		PersistenceManager pm = persistenceManager();
		try {
			pm.deletePersistent(this);
		} finally {
			pm.close();
		}
	}

}
