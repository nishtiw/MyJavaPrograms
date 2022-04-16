import java.util.*;
public class PrimeFactorization {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		FindPrimeFactors(n);
	}
	public static boolean isPrime(int n) 
	{
		for(int i=2; i<n; i++)
		{
			if(n%i == 0) 
			{
				return false;
			}
		}
		return true;
	}
	public static void FindPrimeFactors(int n) 
	{
		for(int i=2; i<=n; i++)
		{
			if(isPrime(i))
			{
				int x = i;
				while(n%x == 0)
				{
					System.out.print(i + " ");
					x = x*i;
				}
			}
		}
	}
}
