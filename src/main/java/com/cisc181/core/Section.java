package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID SectionID;
	private int RoomID;
	private UUID CourseID;
	private UUID SemesterID;
	
	
	
	
	
	
	public UUID getSectionID(){
		return SectionID;
		
	}
	public void setSectionID(UUID SectionID){
		this.SectionID= SectionID;
	}
	public int getRoomID(){
		return RoomID;
	}
	public void setRoomID(int RoomID){
		this.RoomID= RoomID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
}
