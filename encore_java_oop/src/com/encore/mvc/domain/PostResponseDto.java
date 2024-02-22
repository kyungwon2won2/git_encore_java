package com.encore.mvc.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PostResponseDto {
	private int idx;
	private String title;
	private String content;
	private String writer;
	
	public PostResponseDto() {
		super();
	}

	public PostResponseDto(int idx, String title, String content, String writer) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
}
