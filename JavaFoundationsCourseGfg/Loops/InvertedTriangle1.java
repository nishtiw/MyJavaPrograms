//    *
//   **
//  ***
// ****
//*****
public class InvertedTriangle1 {
	public static void main(String args[]) {
		//using for loop
		/*for(int i=1; i<=5; i++) {
			int j;
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=j; k<=5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//using while loop
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5-i) {
				System.out.print(" ");
				j++;
			}
			while(j<=5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
