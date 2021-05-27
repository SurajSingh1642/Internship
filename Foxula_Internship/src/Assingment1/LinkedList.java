package Assingment1;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author suraj
 */
import static java.lang.System.exit;
import java.util.Scanner;

 

class StackLinkedlist {
 
    
    private class Node {
 
        int data; 
        Node link;
    }
    
    Node top;
    
    StackLinkedlist()
    {
        this.top = null;
    }
    
    
 
    
    public void push(int x) 
    {
        
        Node temp = new Node();
 
        
        if (temp == null) {
            System.out.println("\n Overflow");
            return;
        }
 
        
        temp.data = x;
 
        
        temp.link = top;
 
        
        top = temp;
    }
 
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    

    
    public void pop() 
    {
        
        if (top == null) {
            System.out.println("\nStack Underflow");
            return;
        }
 
        
        top = (top).link;
    }
    
    
    public int Count()
    {
        Node temp = top;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.link;
        }
        return count;
    }
 
    public void display()
    {
        
        if (top == null) {
            System.out.println("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                
                System.out.printf("%d- ", temp.data);
 
                
                temp = temp.link;
            }
        }
    }
}

public class LinkedList{
    public static void main(String[] args)
    {
        
        StackLinkedlist obj1 = new StackLinkedlist();
        StackLinkedlist obj2 = new StackLinkedlist();
        Scanner sc=new Scanner(System.in);
        
        int ch;
		do {
			System.out.println("1. Push Element in stack 1 ");
			System.out.println("2. Pop Element in stack 1 ");
			System.out.println("3. Push Element in stack 2 ");
			System.out.println("4. Pop Element in stack 2 ");
			System.out.println("Enter your choice? ");
			ch=sc.nextInt();
                        //obj1.count(obj2);
			
			switch(ch){
			case 1:
				System.out.println("Enter the data you want to add to stack 1");
				obj1.push(sc.nextInt());
                                obj1.display();
                                if(obj1.Count()==obj2.Count())
                                    System.out.println("\nBoth Stacks have "+obj2.Count()+"  Items");
                                //obj1.count(obj2);
                                
				break;
			
			case 2:
				obj1.pop();
				
				obj1.display();
                                if(obj1.Count()==obj2.Count())
                                    System.out.println("\nBoth Stacks have "+obj2.Count()+"  Items");
                                //obj1.count(obj2);

                                
				break;
			
			case 3:
				System.out.println("Enter the data you want to add to stack 2");
				obj2.push(sc.nextInt());
                                obj2.display();
                                if(obj1.Count()==obj2.Count())
                                    System.out.println("\nBoth Stacks have "+obj2.Count()+"  Items");
                                //obj1.count(obj2);

				break;
				
			case 4:
				obj2.pop();
				
				obj2.display();
                                if(obj1.Count()==obj2.Count())
                                    System.out.println("\nBoth Stacks have "+obj2.Count()+"  Items");
                                //obj1.count(obj2);

                                
				break;
				
			}
			System.out.println("\nDo you want to continue.....(1.Yes/2.No)");
			ch=sc.nextInt();
		}while(ch==1);
        
        
    }
}


