package com.eric.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.eric.core.entities.Blog;
import com.eric.rest.mvc.AccountController;
import com.eric.rest.mvc.BlogController;
import com.eric.rest.resources.BlogResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {

	public BlogResourceAsm() {
		super(BlogController.class, BlogResource.class);
	}

	@Override
	public BlogResource toResource(Blog blog) {
		BlogResource resource = new BlogResource();
		resource.setTitle(blog.getTitle());
		resource.add(linkTo(BlogController.class).slash(blog.getId()).withSelfRel());
		resource.add(linkTo(BlogController.class).slash(blog.getId()).slash("blog-entries").withRel("entries"));
		if (blog.getOwner() != null)
			resource.add(linkTo(AccountController.class).slash(blog.getOwner().getId()).withRel("owner"));
		return resource;
	}

}
