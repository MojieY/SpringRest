package com.eric.core.service;

import com.eric.core.entities.BlogEntry;

public interface BlogEntryService {
	public BlogEntry findBlogEntry(Long id);

	public BlogEntry deleteBlogEntry(Long id);

	public BlogEntry updateBlogEntry(Long id, BlogEntry data);
}
