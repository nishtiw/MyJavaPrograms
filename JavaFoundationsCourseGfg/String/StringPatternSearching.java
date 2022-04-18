public class StringPatternSearching 
{
	public static void main(String args[])
	{
		String txt1 = "geeks for geeks";
		String pattern1 = "geeks";
		int position = txt1.indexOf(pattern1);
		while(position>=0)
		{
			System.out.print(position+" ");
			position = txt1.indexOf(pattern1, position+1);
		}
	}
}
