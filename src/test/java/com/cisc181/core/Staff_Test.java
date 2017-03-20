package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}
	
	
	@Test
	public void testSalary() {
		ArrayList<Staff> StaffTest= new ArrayList<Staff>();
		
		StaffTest.add(new Staff(11000));
		StaffTest.add(new Staff(12000));
		StaffTest.add(new Staff(13000));
		StaffTest.add(new Staff(14000));
		StaffTest.add(new Staff(15000));
		double sum=0;
		for(Staff s: StaffTest){
				sum +=s.getSalary();
		}
		double average= sum/(StaffTest.size());
		int average1=((int)average);
		assertEquals(13000,average1);
		
		
	}	
	
	
	@SuppressWarnings("deprecation")
	@Test(expected= PersonException.class)
	public void testExcpetion1()throws PersonException{
		new Staff("First","Middle","Last",new Date(-100,10,10), "adress","(456)-765-2847","email","3",0, 0,new Date(),eTitle.MR);
		
	}
	@Test
	public void testException2()throws PersonException{
		new Staff("","","",new Date(), "","(456)-789-2334","","",0, 0,new Date(),eTitle.MR);
	}
	@Test(expected= PersonException.class)
	public void testExcpetion3()throws PersonException{
		new Staff("First","Middle","Last",new Date(), "adress","4567652847","email","3",0, 0,new Date(),eTitle.MR);
		
	}
	

}
