package com.eric.core.service.util;

import java.util.ArrayList;
import java.util.List;

import com.eric.core.entities.Blog;

public class BlogList {
	private List<Blog> blogs = new ArrayList<Blog>();

	public BlogList(List<Blog> resultList){
		this.blogs = resultList;
	}
	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

}
