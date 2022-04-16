import java.util.*;
public class FirstDigitofaNumber1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		FindFirstDigit(n);
	}
	public static void FindFirstDigit(int n) {
		//using while loop
		while(n>=10) {
			n = n/10;
		}
		System.out.println(n);
	}
}
