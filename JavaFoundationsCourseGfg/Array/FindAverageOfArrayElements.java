import java.util.*;
public class FindAverageOfArrayElements
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
		FindAverage(a);
	}
	public static void FindAverage(int a[])
	{
		double sum = 0, avg = 0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.print("\nAvg is: "+avg);
	}
}
