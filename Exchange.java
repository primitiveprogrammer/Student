/**
 * 
 */
package edu.gsu.csc1302.student;

/**
 * @author Patrick Copeland
 * @version 09/22/2020
 */
public class Exchange extends Undergraduate
{
	
	private String country;
	private String year;
	
	public Exchange(double gpa, String major, String country, String year) 
	{
		super(major, gpa);
		this.country = country;
		this.year = year;
	}
	
	public String getYear()
	{
		return this.year;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String toString()
	{
		return ("Major is " + getMajor() + ", GPA is " + getGpa() + ", Student is from " + getCountry());
	}

}
