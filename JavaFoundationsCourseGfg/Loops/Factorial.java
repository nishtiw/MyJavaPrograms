import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt(); 
		int ans = 1;
		
		//using for loop
		/*for(int i=1; i<=n; i++) {
			ans *= i;
		}*/ 
		
		//using while loop
		int i=1;
		while(i<=n) {
			ans *= i;
			i++;
		}
		
		System.out.println("Factorial of "+n+" is : "+ans);
	}
}
