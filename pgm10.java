/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner g = new Scanner (System.in);

		int f = g.nextInt();

		int count =0,r;

		 while (f > 0)

		 {

		   r = f%10;

		   count +=1;

		   f = f/10;

		 }

		System.out.println(count); 	 


	}
}
