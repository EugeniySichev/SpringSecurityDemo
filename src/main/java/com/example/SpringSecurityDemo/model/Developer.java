package com.example.SpringSecurityDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    public Developer(long l, String string, String string2) {
		
	}
	private Long id;
    private String firstName;
    private String lastName;
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
}