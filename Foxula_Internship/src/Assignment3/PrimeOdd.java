package Assignment3;

import java.util.*;



public class PrimeOdd {
	
	static int prime(int n) {
		
		int i,m=0,flag=0;      
		 m=n/2;      
		  if(n==0||n==1)
		  {  
		   flag=1;      
		  }
		  else{  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		      flag=1;      
		     break;      
		    }      
		   }      
		 } 
		  return flag;
		}    
		
		
		
		
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(prime(n)==0 && n%2!=0)
	{
		throw new OddPrimeException("Invalid Number");
	}
	else {
		System.out.println("Valid Number");
	}
	}
}
