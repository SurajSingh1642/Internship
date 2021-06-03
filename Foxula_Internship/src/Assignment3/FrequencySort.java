package Assignment3;

import java.util.*;

public class FrequencySort {
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
		System.out.println("Printing numbers with respetive Frequency");
		for(Integer i: map.keySet())
		{
			System.out.println("("+i+","+map.get(i)+")");
		}
		
		ArrayList<Integer> map2 = new ArrayList<Integer>(map.values());
		
		Collections.sort(map2);
		
		System.out.println("Printing is Increasing order of frequency");
		for(Integer i:map2)
		{
			for(Integer j:map.keySet())
			{
				if(map.get(j)==i)
				{
					System.out.println("("+j+","+map.get(j)+")");
				}
			}
		}

		
	}
	

}
