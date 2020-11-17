/**
 * 
 */
package edu.gsu.csc1302.student;

/**
 * @author Patrick Copeland
 * @version 09/22/2020
 */

public class Student 
{
	private String major;
	private double gpa;
	private int creditHours;
	
	//constructor one
	public Student(String major, double gpa, int creditHours)
	{
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;
	}
	
	//constructor two
	public Student(String major, double gpa)
	{
		this.major = major;
		this.gpa = gpa;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	//method returns year of study based on credit hours
	public String getYear()
	{
		String year = null;
		if(creditHours < 32)
		{
			year = "Freshman";
		}
		
		if(creditHours >= 32 && creditHours < 64)
		{
			year = "Sophomore";
		}
		
		if(creditHours >= 64 && creditHours < 96)
		{
			year = "Junior";
		}
		
		else
		{
			year = "Senior";
		}
		
		return year;
	}
	
	public String toString()
	{
		return ("Major is " + getMajor() + ", GPA is " + getGpa() + ", Year is " + getYear());
	}

}
