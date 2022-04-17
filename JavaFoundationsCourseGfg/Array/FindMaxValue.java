import java.util.*;
public class FindMaxValue
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
		System.out.print("\nMax value is: " + maximum(a));
	}
	public static int maximum(int a[])
	{
		int max = a[0], i=1;
		//for(i=1; i<a.length; i++);
		while(i<a.length)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			i++;
		}
		return max;
	}
}
