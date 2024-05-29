package com.postpackage1;

public class Post {
int id;
int userID;
String title;
String body;

public Post() {
	super();
	this.id = id;
	this.title = title;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}

}
