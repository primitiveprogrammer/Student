/**
 * 
 */
package edu.gsu.csc1302.student;

/**
 * @author Patrick Copeland
 * @version 09/22/2020
 */
public class Undergraduate extends Student
{
	private Boolean honors;
	
	//constructor one
	public Undergraduate(String major, double gpa, int creditHours, Boolean honors)
	{
		super(major, gpa, creditHours);
		this.honors = honors;
	}
	
	//constructor two
	public Undergraduate(String major, double gpa)
	{
		super(major, gpa);
	}
	
	public Boolean isHonors()
	{
		return honors;
	}
	
	public String toString()
	{
		return (super.toString() + ", Honors is " + isHonors());
	}

}
