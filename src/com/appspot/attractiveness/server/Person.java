package com.appspot.attractiveness.server;

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

	@Persistent
	private String language;

	@Persistent
	private int age;

	@Persistent
	private boolean isMale;

	@Persistent
	private boolean isAvailable;

	// ... Constructors ...

	/**
	 * Constructs an empty {@link Person} object.
	 */
	public Person() {
	}

	/**
	 * Constructs a {@link Person} object.
	 * 
	 * @param language
	 *            the <a href=
	 *            "http://www.loc.gov/standards/iso639-2/php/code_list.php">ISO
	 *            639-1 language code</a> representing the language of the
	 *            {@link Person}.
	 * @param age
	 *            the age of the {@link Person}.
	 * @param isMale
	 *            whether or not the {@link Person} is male.
	 * @param isAvailable
	 *            whether or not the {@link Person} is available to date.
	 */
	public Person(String language, int age, boolean isMale, boolean isAvailable) {
		this.language = language;
		this.age = age;
		this.isMale = isMale;
		this.isAvailable = isAvailable;
	}

	// ... Accessors ...

	/**
	 * @return the key
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * @return the <a href=
	 *         "http://www.loc.gov/standards/iso639-2/php/code_list.php">ISO
	 *         639-1 language code</a> representing the language of the
	 *         {@link Person}.
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the <a href=
	 *            "http://www.loc.gov/standards/iso639-2/php/code_list.php">ISO
	 *            639-1 language code</a> representing the language of the
	 *            {@link Person}.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the age of the {@link Person}.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age of the {@link Person}.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return true if {@link Person} is male
	 */
	public boolean isMale() {
		return isMale;
	}

	/**
	 * @param isMale
	 *            the gender of the {@link Person} (true if male).
	 */
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	/**
	 * @return the dating availability of the {@link Person}.
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/**
	 * @param isAvailable
	 *            whether or not the {@link Person} is available to date.
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
