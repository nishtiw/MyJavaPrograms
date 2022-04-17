import java.util.*;
public class SumOfAnArray 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.print("\nEnter elements of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
		}
		System.out.print("\nSum: "+sum);
	}
	
}
