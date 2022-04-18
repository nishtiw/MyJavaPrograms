import java.util.*;
public class DigitsAfterDecimalPoint
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		System.out.println("Numbers after decimal point are: "+FindDigit(number));
		
	}
	public static String FindDigit(String number)
	{
		int position = number.indexOf('.');
		if(position<0)
		{
			return "";
		}
		else
		{
			return number.substring(position+1); //this is same as number.substring(position+1, number.length); number.length is same as end_index, function will return string till end_index-1
		}
	}
}
