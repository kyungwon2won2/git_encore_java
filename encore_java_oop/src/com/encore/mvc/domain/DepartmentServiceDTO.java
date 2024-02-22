package com.encore.mvc.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor

//DT0
public class DepartmentServiceDTO {
	private String dept_id;
	private String dept_name;
	private String loc_id;
}
