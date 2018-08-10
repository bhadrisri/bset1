/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		System.out.println("n is positive");
		else if(n<0)
		System.out.println("n is negative");
		else
		System.out.println("n is zero");
	}
}
