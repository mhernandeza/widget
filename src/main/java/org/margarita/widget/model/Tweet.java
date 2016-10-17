package org.margarita.widget.model;

import java.util.Date;

public class Tweet {
	private long id;
	private Date creationDate;
	private String text;
	private String authorName;
	private String profileImage;
	private String screenName;
		
	public Tweet(long id, Date creationDate, String text, String authorName, String profileImage, String screenName) {
		this.id = id;
		this.creationDate = creationDate;
		this.text = text;
		this.authorName = authorName;
		this.profileImage = profileImage;
		this.screenName = screenName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
}
