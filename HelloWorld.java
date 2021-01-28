/* This is a simple Java program. 
FileName : "HelloWorld.java". */
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
public class HelloWorld 
{ 
	// Your program begins with a call to main(). 
	// Prints "Hello, World" to the terminal window.
	int Element;
	HelloWorld(int x)
	{
		Element=x;
	} 
	public static void main(String args[]) 
	{ 
		System.out.println("Hello, World k"); 
		// int arr[]=new int[5];
		// arr[0]=1;
		// arr[1]=2;
		HelloWorld obj=new HelloWorld(15);
		HelloWorld obj1=new HelloWorld();
		System.out.println(obj.Element);


		String str="Kunal";
		StringBuffer sb= new StringBuffer("Bhavsar");
		StringBuilder sbb=new StringBuilder("Indore");
		System.out.println(str+sb);
		sbb.append(sb);
		//str.append(sb);
		System.out.println(sbb);

	} 
} 
