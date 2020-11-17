package edu.gsu.csc1302.student;

/**
 * @author Patrick Copeland
 * @version 09/22/2020
 */
public class StudentClient 
{

	public static void main(String[] args) 
	{
		Undergraduate Alex = new Undergraduate("CSC", 3.72, 54, true);
		Graduate Mary = new Graduate("Masters", 2, 3.80, "CSC", "Data Science");
		Exchange Yingshu = new Exchange(3.66, "CSC", "Tiawan", "Fall 2020");

		System.out.println("Alex");
		System.out.println(Alex);
		System.out.println();
		System.out.println("Mary");
		System.out.println(Mary);
		System.out.println();
		System.out.println("Yingshu");
		System.out.println(Yingshu);
	}

}
