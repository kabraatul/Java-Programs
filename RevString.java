import java.util.*;
class RevString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] s = new String[2];
		System.out.println("Enter "+s.length+" Strings");
		int x,j,i;
		for(i=0; i<s.length; i++)
			s[i]= in.nextLine();
		System.out.println("Reverse of Strings is ");
		for(i=0; i<s.length; i++)
		{
			for(j=s[i].length()-1; j>=0; j--)     // here you forget -1 from length , because last character of string is at length-1
			{
				System.out.print(s[i].charAt(j));
			}
			System.out.println();
		}
	}
}
