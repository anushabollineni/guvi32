import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String s="Hello World";
	int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if((s.charAt(i) ==' ')&&(s.charAt(i+1)!=' '))
	{
		count++;
	}// your code goes here
	}
	System.out.println("number of words in  a string=" +count);
}
}
