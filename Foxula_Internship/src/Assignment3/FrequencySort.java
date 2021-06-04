package Assignment3;

import java.util.*;
import java.util.Map.Entry;

public class FrequencySort {
	
	public static void main(String []args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("Array elements are:");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}

		System.out.print("elements frequency are");
		
		System.out.println(map);
		

		
		
		List<Integer> valueslist = new ArrayList<Integer>(map.values());
		Collections.sort(valueslist);

		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println("Sorted elements "+ list);
		
	}
}
