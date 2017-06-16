package ru.stqa.pft.sandbox;

public class HelloWorld {

	public static void main(String[] args)
	{
		int a=0;
		int b=5*5;


		textPrint("I use my first function");
		System.out.println("Simple calcFunction c = " + simpleCalc(58,156458));

	}


	public static void textPrint(String stringa)
	{
		System.out.println(stringa);
		System.out.println("Hello, wAnna!");
	}

	public static double simpleCalc(double a, double b)
	{
		double c;
		c	= b+a+189;
		return  c;
	}

}



