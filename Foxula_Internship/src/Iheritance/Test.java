package Iheritance;
import java.util.Scanner;
public class Test {
	  
	  //to take input and avoiding repetition  
		void input(int xy[][]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter four coordinates (x,y)");
			for(int i=0;i<4;i++)
				for(int j=0;j<2;j++)
					xy[i][j]=sc.nextInt();
		}
		public static void main(String[] args) {
			int xy[][]=new int[4][2];
			Scanner sc=new Scanner(System.in);
			
			System.out.println("SQUARE");
			new Test().input(xy);
			Square sq=new Square(xy);
			System.out.println("Area Of The Square is " + sq.area());
			
			System.out.println("\nRECTANGLE");
			new Test().input(xy);
			Rectangle rec=new Rectangle(xy);
			System.out.println("Area Of The Rectangle is " + rec.area());
			
			System.out.println("\nPARALLELOGRAM");
			new Test().input(xy);
			System.out.println("ENTER HEIGHT: ");
			Parallelogram p=new Parallelogram(xy,sc.nextInt());
			System.out.println("Area Of The Parallelogram is " + p.area());
			
			System.out.println("\nTRAPEZOID");
			new Test().input(xy);
			System.out.println("ENTER HEIGHT: ");
			Trapezoid t=new Trapezoid(xy,sc.nextInt());
			System.out.println("Area Of The Trapezoid is " + t.area());

		}
	}
