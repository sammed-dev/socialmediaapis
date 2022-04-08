package com.datagrokr.mediaapi.model;

import java.util.ArrayList;
import java.util.List;

public class Message {

	private Long id;
	private String message;
	private String author;
	private List<Link> links = new ArrayList<Link>();
	
	
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public Message() {
	}
	
	public Message(Long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void addLink(String url, String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}
	
	
}
