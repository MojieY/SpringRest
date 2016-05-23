package com.eric.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eric.core.entities.BlogEntry;
import com.eric.core.repositories.BlogEntryRepo;
import com.eric.core.service.BlogEntryService;

@Service
@Transactional
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryRepo entryRepo;

	@Override
	public BlogEntry findBlogEntry(Long id) {
		return entryRepo.findBlogEntry(id);
	}

	@Override
	public BlogEntry deleteBlogEntry(Long id) {
		return entryRepo.deleteBlogEntry(id);
	}

	@Override
	public BlogEntry updateBlogEntry(Long id, BlogEntry data) {
		return entryRepo.updateBlogEntry(id, data);
	}

}
