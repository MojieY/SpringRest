package com.eric.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import com.eric.core.entities.BlogEntry;

public class BlogEntryResource extends ResourceSupport {
	private String title;

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BlogEntry toBlogEntry() {
		BlogEntry entry = new BlogEntry();
		entry.setTitle(title);
		entry.setContent(content);
		return entry;
	}
}