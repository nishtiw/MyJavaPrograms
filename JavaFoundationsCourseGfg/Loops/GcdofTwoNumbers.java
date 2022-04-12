/* 
Process: 
1) Find the smallest of the two numbers. 
2) Iterate from 1 to min(a,b) to identify the greatest number which can divide both the numbers.
 */
 import java.util.*;
 public class GCDofTwoNumbers {
	 public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter first number: ");
		 int a = scan.nextInt();
		 System.out.print("\nEnter second number: ");
		 int b = scan.nextInt(); 
		 int min = Math.min(a,b);
		 int ans = 1;
		 for(int i=1; i<=min; i++) {
			 if(a%i == 0 && b%i == 0) {
				 ans = i;
			 }
		 }
		 System.out.print("\n GCD of the two numbers is: "+ ans);
	 }
 }
