package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public Semester(Date StartDate, Date EndDate){
		this.SemesterID= UUID.randomUUID();
	}
	
	
	
	
	
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	public void setSemesterID(UUID SemesterID){
		this.SemesterID= SemesterID;
	}
	
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;		
	}
	public Date getEndDate() {
		return EndDate;
	}

	public void setENdDate(Date EndDate){
		this.EndDate = EndDate;		
	}


}
//attributes: SemesterID (UUID), StartDate (date), EndDate (date)