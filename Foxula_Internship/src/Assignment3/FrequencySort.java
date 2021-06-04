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
		
		Map<Integer,Integer> hashmap=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			
			if(hashmap.containsKey(arr[i])) {
				hashmap.put(arr[i], hashmap.get(arr[i])+1);
			}
			else {
				hashmap.put(arr[i], 1);
			}
		}

		System.out.println("elements frequency are");
		
		for(Integer i: hashmap.keySet())
		{
			System.out.println("("+i+","+hashmap.get(i)+")");
		}
		

		
		
		List<Map.Entry<Integer, Integer> > list =
			       new LinkedList<Map.Entry<Integer, Integer> >(hashmap.entrySet());

		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		
		
		HashMap<Integer, Integer> hashmap2 = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            hashmap2.put(aa.getKey(), aa.getValue());
        }
        System.out.println("Sorted elements frequency are");
        for(Integer i: hashmap2.keySet())
		{
			System.out.println("("+i+","+hashmap2.get(i)+")");
		}



		
		
		
	}
}
