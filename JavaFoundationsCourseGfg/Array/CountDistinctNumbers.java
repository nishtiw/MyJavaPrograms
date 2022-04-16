import java.util.*;
public class CountDistinctNumbers {
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.print("\nEnter elements of array: ");
		for(int i=0; i<n; i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("\n"+CountDistinctNum(a, n));
	}
	public static int CountDistinctNum(int a[], int n)
	{
		int count = 0;
		boolean isDistinct = true;
		for(int i=0; i<n; i++)
		{
			for(int j=i-1; j>=0; j--)
			{
				if(a[i] == a[j])
				{
					isDistinct = false;
					break;
				}
			}
			if(isDistinct == true)
				count++;
			isDistinct = true;
		}
		return count;
	}
}
