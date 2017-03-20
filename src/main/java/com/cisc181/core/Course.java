package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	public Course(String CourseName, int GradePoints, eMajor eMajor){
		this.CourseID= UUID.randomUUID();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public  eMajor getMajor( )
    {
        return this.eMajor;
    }
    public void setMajor (eMajor eMajor)
    {
        this.eMajor = eMajor;    
    }
	
	public UUID getCourseID(){
		return CourseID;
	}
	public void setCourseID(UUID CourseID){
		this.CourseID= CourseID;
	}
	public String getCourseName(){
		return CourseName;
	}
	public void setCourseName(String CourseName){
		this.CourseName= CourseName;
	}
	public int getGradePoints(){
		return GradePoints;
	}
	public void setGradePoints(int GradePoints){
		this.GradePoints= GradePoints;
	}
}
//attributes:CourseID (UUID), CourseName (String).  GradePoints(int)



/*
public static void main(String[] args) {
// TODO Auto-generated method stub

}
*/