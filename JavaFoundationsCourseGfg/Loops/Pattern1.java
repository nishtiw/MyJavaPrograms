//Print the following pattern
//*****
//*****
//*****
//*****
//*****

public class Pattern1 {
	public static void main(String args[]) {
		//using for loop
		/*for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//using while loop
		int i=0;
		while(i<5) {
			int j=0; 
			while(j<5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
