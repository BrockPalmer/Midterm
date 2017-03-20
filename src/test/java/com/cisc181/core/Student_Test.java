package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() {
	
		//Add three Course records, add them to an ArrayList of Course
		ArrayList<Course> CourseRecords= new ArrayList<Course>();
		CourseRecords.add(new Course("CISC181", 4, eMajor.COMPSI));
		CourseRecords.add(new Course("ECON101",3, eMajor.BUSINESS));
		CourseRecords.add(new Course("PHYS208",4,eMajor.PHYSICS));		
		//Add two Semesters, one for Fall, one for Spring.  Add them to an ArrayList of Semester
		ArrayList<Semester> SemesterRecords= new ArrayList<Semester>();
		SemesterRecords.add(new Semester(new Date(10,15,16), new Date(10, 14, 15)));
		SemesterRecords.add(new Semester(new Date(3), new Date(4)));
		//Add two Sections for each Course & Semester (total of six Sections).  Add them to an ArrayList of Section
		ArrayList<Section> SectionRecords= new ArrayList<Section>();
		SectionRecords.add(new Section());
		SectionRecords.add(new Section());
		SectionRecords.add(new Section());
		SectionRecords.add(new Section());
		SectionRecords.add(new Section());
		SectionRecords.add(new Section());
		//Create ten Student records, add them to an ArrayList of Student.
		ArrayList<Student> StudentRecords= new ArrayList<Student>();
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		StudentRecords.add(new Student());
		
		ArrayList<Enrollment> EnrollmentRecords= new ArrayList<Enrollment>();
		for (Student st:StudentRecords ){
			for(Section se: SectionRecords){
				
				EnrollmentRecords.add(new Enrollment(st.getStudentID(), se.getSectionID()));
			}
		}
		
	
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}