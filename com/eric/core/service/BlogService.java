package com.eric.core.service;

import com.eric.core.entities.Blog;
import com.eric.core.entities.BlogEntry;
import com.eric.core.service.util.BlogEntryList;
import com.eric.core.service.util.BlogList;

public interface BlogService {
	public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

	public BlogList findAllBlogs();

	public BlogEntryList findAllBlogEntries(Long blogId);

	public Blog findBlog(Long id);
}
