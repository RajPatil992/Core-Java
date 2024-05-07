package com.basic.java;

//Syntax for Class
//Acces Modifier class [Class Name]
public class SyntaxForMethodAndClassInJava 
{
	//Syntax for method 
	//Accessmodifier return type [Name of the Method]
	//{
	//}
	public static void add()//Static Method can direcly called Without creating object
	{
		System.out.println("Hello");
	}
	public void add1()//Non Static Method to call this we should compulsory have to call object
	{
		System.out.println("HIIIIIII");
	}
	
    public static void main(String []args)
    {
    	SyntaxForMethodAndClassInJava add2=new SyntaxForMethodAndClassInJava();
    	add2.add1();
    	SyntaxForMethodAndClassInJava.add();
    	
	}
	
}
