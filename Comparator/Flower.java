package org.btm.comparator;

public class Flower 
{
	String color,type;
	int price;
	
	//parameterized Constructor
	Flower(String color,String type,int price)
	{
		this.color=color;
		this.type=type;
		this.price=price;
	}
	
	//Override toString
	@Override
	public String toString()
	{
		return this.type+" "+this.color+" "+this.price;
	}
}
