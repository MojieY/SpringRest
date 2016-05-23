package com.eric.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.eric.core.service.util.BlogList;
import com.eric.rest.mvc.BlogController;
import com.eric.rest.resources.BlogListResource;

public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

	public BlogListResourceAsm() {
		super(BlogController.class, BlogListResource.class);
	}

	@Override
	public BlogListResource toResource(BlogList blogList) {
		BlogListResource res = new BlogListResource();
		res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
		return res;
	}
}
