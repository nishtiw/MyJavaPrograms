import java.util.*;
public class LCMofTwoNumbers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		System.out.print("\nEnter second number: ");
		int b = scan.nextInt();
		int max = Math.max(a,b);
		int highestMultiple = a*b;
		int ans = max;
		for(int i=max; i<=highestMultiple; i++) {
			if(i%a == 0 && i%b ==0) {
				ans = i;
				break;
			}
		}
		System.out.print("\nLCM of the two numbers is: "+ans);
	}
}
