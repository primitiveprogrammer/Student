package edu.gsu.csc1302.student;

/**
 * @author Patrick Copeland
 * @version 09/22/2020
 */
public class Graduate extends Student 
{
	@SuppressWarnings("unused")
	private String degree;
	private String concentration;
	private int years;
	
	//constructor
	public Graduate(String degree, int years, double gpa, String major, String concentration) 
	{
		super(major, gpa);
		this.degree = degree;
		this.years = years;
		this.concentration = concentration;
	}
	
	public int getYears()
	{
		return years;
	}
	
	public String getConcentration()
	{
		return concentration;
	}
	
	public String toString()
	{
		return ("Major is " + getMajor() + ", Concentration is " + getConcentration() + ", Has spent " + getYears() + " years in graduate school");
	}

}