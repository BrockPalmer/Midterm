package com.cisc181.core;

public class PersonException extends Exception {
	private Person p;
	
	public PersonException(Person p){
		super();
		this.p= p;
	}
}



