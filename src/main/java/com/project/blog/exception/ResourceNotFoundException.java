package com.project.blog.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ResourceNotFoundException extends RuntimeException{
	String resourceName;
	String fieldName;
	long fieldValue;
	
	
	public ResourceNotFoundException(String resourceName,String fieldName,long fieldValue) {
		super(String.format("%s not found for %s : %s",resourceName,fieldName,fieldValue ));
		this.resourceName=resourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}
}
