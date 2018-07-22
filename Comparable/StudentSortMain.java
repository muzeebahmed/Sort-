package org.btm.comparable;

import java.util.Arrays;

public class StudentSortMain 
{
	public static void main(String[] args) 
	{
		Student s1=new Student("Sam",78.9,"ECE");
		Student s2=new Student("Ram",64.9,"CSE");
		Student s3=new Student("Raju",88.9,"MECH");
		Student s4=new Student("Siva",45.9,"CIVIL");
		Student s5=new Student("Divya",79.9,"ECE");
		
		Student[] ar={s1,s2,s3,s4,s5};
		
		//Sort the Student array by using Arrays.sort
		Arrays.sort(ar);
		//for each loop
		for(Student s:ar)
		{
			System.out.println(s);
		}
	}

}
