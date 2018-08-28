/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		int count=0;
		int c;
		ArrayList<Integer>a=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			c=s.nextInt();
			a.add(c);
		}
		System.out.println(Collections.min(a));
	}
}
