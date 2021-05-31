package Assignment_2;
import java.util.*;

public class Array_List {
	
public static void main(String args[])
{
	
	ArrayList list = new ArrayList();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n=sc.nextInt();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the Element");
		int j=sc.nextInt();
		list.add(j);
	
	}
	System.out.println("Enter the Element to find");
	n=sc.nextInt();
	if(list.contains(n))
	{
		System.out.println("Element is present");
	}
			
	
}
}
