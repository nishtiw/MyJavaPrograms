import java.util.*;
public class PrimeNumber1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt(); 
		if(n == 1)
		{
		    System.out.print("Neither prime Nor composite");
		}
		//using for loop
		/*for(int i=2; i<n; i++) {
			if(n%i == 0) {
				System.out.print("Not prime");
				return;
			}
		}
		System.out.print("Prime");
		*/
		
		//using while loop
		int i = 2;
		while(i<n) {
			if(n%i == 0) {
				System.out.print("Not prime");
				return; 
			}
			i++;
		}
		System.out.print("Prime");
	}
}
