import java.util.*;
public class AllDivisorsOfaNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		int a = scan.nextInt(); 
		
		//using for loop
		/*for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				System.out.print(i+" ");
			}
		}*/
		
		//using while loop 
		int i=1; 
		while(i<=a) {
			if(a%i == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
