package org.btm.comparator;

import java.util.TreeSet;

public class MainComparator 
{

	public static void main(String[] args) 
	{
		Flower f1=new Flower("Red","rose",20);
		Flower f2=new Flower("pink","tulip",40);
		Flower f3=new Flower("white","lily",15);
		Flower f4=new Flower("pink","pennoy",150);
		
		FlowerTreeComparator fc=new FlowerTreeComparator();
		TreeSet<Flower> ts=new TreeSet<Flower>(fc);
		ts.add(f1);
		ts.add(f2);
		ts.add(f3);
		ts.add(f4);
		for(Flower f:ts)
		{
			System.out.println(f);
		}
	}

}
