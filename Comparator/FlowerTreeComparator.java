package org.btm.comparator;
import java.util.Comparator;
public class FlowerTreeComparator implements Comparator<Flower>
{
	//here were are sorting type so that it can sort alphabetic order(a-z)
	@Override
	public int compare(Flower f1,Flower f2)
	{
		return f1.type.compareToIgnoreCase(f2.type);
	}
}
