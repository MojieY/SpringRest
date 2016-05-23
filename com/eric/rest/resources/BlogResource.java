package com.eric.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import com.eric.core.entities.Blog;

public class BlogResource extends ResourceSupport {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Blog toBlog(){
		Blog blog = new Blog();
		blog.setTitle(title);
		return blog;
	}
}
