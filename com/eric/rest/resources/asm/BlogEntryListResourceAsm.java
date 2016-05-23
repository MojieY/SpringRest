package com.eric.rest.resources.asm;

import java.util.List;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.eric.core.service.util.BlogEntryList;
import com.eric.rest.mvc.BlogController;
import com.eric.rest.resources.BlogEntryListResource;
import com.eric.rest.resources.BlogEntryResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {
	public BlogEntryListResourceAsm() {
		super(BlogController.class, BlogEntryListResource.class);
	}

	@Override
	public BlogEntryListResource toResource(BlogEntryList list) {
		List<BlogEntryResource> resources = new BlogEntryResourceAsm().toResources(list.getEntries());
		BlogEntryListResource listResource = new BlogEntryListResource();
		listResource.setEntries(resources);
		listResource.add(linkTo(methodOn(BlogController.class).findAllBlogEntries(list.getBlogId())).withSelfRel());
		return listResource;
	}
}