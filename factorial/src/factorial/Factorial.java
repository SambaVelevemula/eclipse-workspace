package factorial;

import java.util.Scanner;

public class Factorial {
	int i, fact=1;
	public String factorial(int n) {
		for(i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return "Factorial of "+n+" : "+fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Factorial");
		System.out.println("----------");
		System.out.println();
		System.out.print("Enter Number to find Factorial : ");
		int num=sc.nextInt();
		System.out.println(new Factorial().factorial(num));
		sc.close();

	}

}
