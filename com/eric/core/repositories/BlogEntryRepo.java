package com.eric.core.repositories;

import java.util.List;

import com.eric.core.entities.BlogEntry;

public interface BlogEntryRepo {
	
	public BlogEntry findBlogEntry(Long id);
	
	public BlogEntry deleteBlogEntry(Long id);
	
	public BlogEntry updateBlogEntry(Long id, BlogEntry data);
	
	public BlogEntry createBlogEntry(BlogEntry data);
	
	public List<BlogEntry> findByBlogId(Long blogId);

}
