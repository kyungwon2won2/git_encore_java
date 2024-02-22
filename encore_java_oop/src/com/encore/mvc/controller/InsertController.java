package com.encore.mvc.controller;

import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.model.service.EncoreServiceImpl;

// Controller는 Service를 갖는다.
public class InsertController {

	private EncoreServiceImpl service;
	public InsertController() {
		service = new EncoreServiceImpl();
	}
	
	public int excute(PostRequestDto params) {
		System.out.println(">>> InsertController execute <<<");
		System.out.println(">>> params : " + params);
		
		// 의존관계 형성 후 메서드 호출해서 결과 반환
		int flag = service.insertService(params);
		return flag;
	}
	
	public int excute(Map<String, String> params) {
		System.out.println(">>> InsertController execute <<<");
		System.out.println(">>> params : " + params);
		
		// 의존관계 형성 후 메서드 호출, 반환
		int flag = service.insertService(params);
		return flag;
	}
	
}
