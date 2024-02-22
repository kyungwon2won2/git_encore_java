package com.encore.mvc.controller;

import java.util.List;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.domain.PostResponseDto;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class SelectController {

	private EncoreServiceImpl service;
	
	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
	public List<PostResponseDto> execute() {
		System.out.println(">>> SelectController execute <<<");
		
		return service.selectService();

	}

	
}


