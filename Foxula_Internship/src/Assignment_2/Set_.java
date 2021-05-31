package Assignment_2;
import java.util.*;

public class Set_ {
	
public static void main(String args[])
{
	
	Set<Integer> set1 = new HashSet<Integer>();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n=sc.nextInt();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the Element");
		int j=sc.nextInt();
		set1.add(j);
	
	}
	System.out.println("Enter the Element to find");
	n=sc.nextInt();
	if(set1.contains(n))
	{
		System.out.println("Element is present");
	}
			
	
}
}
