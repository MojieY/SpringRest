package com.eric.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eric.core.entities.Blog;
import com.eric.core.entities.BlogEntry;
import com.eric.core.repositories.BlogEntryRepo;
import com.eric.core.repositories.BlogRepo;
import com.eric.core.service.BlogService;
import com.eric.core.service.exceptions.BlogNotFoundException;
import com.eric.core.service.util.BlogEntryList;
import com.eric.core.service.util.BlogList;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepo blogRepo;

	@Autowired
    private BlogEntryRepo entryRepo;

    @Override
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        BlogEntry entry = entryRepo.createBlogEntry(data);
        entry.setBlog(blog);
        return entry;
    }

    @Override
    public BlogList findAllBlogs() {
        return new BlogList(blogRepo.findAllBlogs());
    }

    @Override
    public BlogEntryList findAllBlogEntries(Long blogId) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        return new BlogEntryList(blogId, entryRepo.findByBlogId(blogId));
    }

    @Override
    public Blog findBlog(Long id) {
        return blogRepo.findBlog(id);
    }

}
