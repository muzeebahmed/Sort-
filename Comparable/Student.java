package org.btm.comparable;

public class Student implements Comparable<Student>
{
	String name;
	double perc;
	String branch;
	
	//Constructor
	Student(String name, double perc,String branch)
	{
		this.name=name;
		this.perc=perc;
		this.branch=branch;
	}
	
	//Override toString method
	@Override
	public String toString()
	{
		return this.name+" "+this.perc+" "+this.branch;
	}
	
	//compareTo method
	@Override
	public int compareTo(Student s) 
	{
		Double wi=this.perc;
		int res=wi.compareTo(s.perc);
		return res;	
	}
}
