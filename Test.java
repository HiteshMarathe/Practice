import java.util.*;
import java.lang.*;

class Test{
	
	private static void Addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for addition:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Result:" + (num1 + num2));
	}
	
	private static void substraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for substraction:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Result:" + (num1 - num2));
	}
	
	private static void multi()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for multiplication:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Result:" + (num1 * num2));
	}
	
	private static void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for division:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Result:" + (num1 / num2));
	}
	
	private static int HCF_cal(int num1, int num2)
	{
		int i = Math.min(num1, num2);
	    while (i > 0) {
	        if (num1 % i == 0 && num2 % i == 0) {
	            break;
	        }
	        i--;
	    }
	    return i;
	}
	private static void hcf()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for HCF calculation:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = HCF_cal(num1, num2);
		System.out.println("Result:" + hcf);
	}
	
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the geekrabit calculator prog");
		System.out.println("Please choose an operation:");
		System.out.println("1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n 5: HCF (Highest Common Factor)\n0: Exit"
);
		int temp = 1;
		do {
			
			System.out.println("Enter your choice");
			int n = sc.nextInt();
			switch(n)
			{
			case 1:Addition();
				break;
			case 2:substraction();
			    break;
			case 3:multi();
				break;
			case 4:div();
				break;
			case 5:hcf();
				break;
			case 0:
				System.out.println("Thank you for using the Calculator Program. Goodbye!");
				System.exit(0);
			}
			System.out.println("Do you want to continue? (1: Yes / 0: No):");
			temp = sc.nextInt();
		}
		while(temp != 0);
	}
}
