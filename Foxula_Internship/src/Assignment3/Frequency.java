package Assignment3;

import java.util.*;

public class Frequency {
	public static void main(String args[]) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("Frequency");
		for(Integer i: map.keySet())
		{
			System.out.println("("+i+","+map.get(i)+")");
		}

		
	}
	

}
