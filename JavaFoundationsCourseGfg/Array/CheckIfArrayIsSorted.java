import java.util.*;
public class CheckIfArrayIsSorted {
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = scan.nextInt();
		System.out.print("\nEnter array elements: ");
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = scan.nextInt();
		}
		boolean ans = isSorted(a, n);
		if(ans == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean isSorted(int a[], int n)
	{
		for(int i=1; i<n; i++)
		{
			if(a[i] < a[i-1])
				return false;
		}
		return true;
	}
}
