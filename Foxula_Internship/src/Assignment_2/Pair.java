package Assignment_2;
import java.util.*;

public class Pair {
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
		System.out.println("Enter the Sum");
		int sum=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((int)list.get(i) +(int) list.get(j)==sum)
				{
					System.out.println("("+list.get(i)+","+list.get(j)+")");
				}
					
			}
		}
	}

}

