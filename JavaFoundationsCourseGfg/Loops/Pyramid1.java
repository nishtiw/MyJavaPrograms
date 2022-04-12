public class Pyramid1 {
	public static void main(String args[]) {
		
		int n=5;
		//using for loop
		/*for(int i=1; i<=n; i++) {
			int j;
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//using while loop
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
