package com.cisc181.core;

import java.util.UUID;

public class Enrollment{
	private UUID SectionID;
	private UUID EnrollmentID;
	private UUID StudentID;
	private double Grade;
	
	
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID EnrollmentID) {
		this.EnrollmentID = EnrollmentID;
	}
	
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID StudentID) {
		this.StudentID = StudentID;
	}
	
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
	
	
	
	private Enrollment(){
		
	}
	public Enrollment(UUID StudentID, UUID SectionID){
		this();
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	

}


/*
 Enrollment has the following attributes: SectionID(UUID), StudentID (UUID), EnrollmentID(UUID) and Grade (double).  
Enrollment should have its no-arg constructor private.
Enrollment should have a two-arg constructor, with StudentID and SectionID as input parameters.  EnrollmentID should be set in the constructor.
SetGrade(double grade) should be defined as a procedure.
*/
