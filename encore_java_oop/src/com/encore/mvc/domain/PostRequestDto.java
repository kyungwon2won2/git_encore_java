package com.encore.mvc.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PostRequestDto {
	private String title;
	private String content;
	private String writer;
}
