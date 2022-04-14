import java.util.*;
public class Fibonacci {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 1, b=1, c;	
		System.out.print(a+" "+b+" ");
		//using for loop
		for(int i=1; i<=n; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}
