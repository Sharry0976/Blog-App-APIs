package com.codershub.blog.payloads.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiResponseCategoryModel {

	private boolean success;//Denotes whether api call is successful
	
	private int code;//shows Http codes 
	
	private String message;//custom message

	private CategoryModel categoryModel;
}
