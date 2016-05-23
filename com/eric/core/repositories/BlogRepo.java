package com.eric.core.repositories;

import java.util.List;

import com.eric.core.entities.Blog;

public interface BlogRepo {
	
	public Blog createBlog(Blog data);
	
	public List<Blog> findAllBlogs();
	
	public Blog findBlog(Long id);
	
	public Blog findBlogByTitle(String title);
	
	public List<Blog> findBlogsByAccount(Long accountId);

}
