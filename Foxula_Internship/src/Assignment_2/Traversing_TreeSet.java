package Assignment_2;
import java.util.*;

public class Traversing_TreeSet {
	
public static void main(String args[])
{
	
	HashSet<Integer> set = new HashSet<Integer>();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n=sc.nextInt();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the Element");
		int j=sc.nextInt();
		set.add(j);
	
	}
	
	for (Integer i : set) 
        System.out.println(i);
			
	
}
}
