package ru.stqa.pft.sandbox;

public class HelloWorld {

	public static void main(String[] args)
	{
	//	int a=0;
	//	int b=5*5;

		Rectangle r = new Rectangle(87,89);
		Square s = new Square(156);

	//	textPrint("I use my first function");
	//	System.out.println("Simple calcFunction c = " + simpleCalc(58,156458));
		System.out.println("Площадь квадрата =" + s.area());
		System.out.println("Площадь прямоугольника =" + r.area());

	}
/* Здесь заканчивается MAIN */





/* Отказываемся от использования функций и переходим к использованию методов, см. по коду выше
	public static double area(Rectangle r)
	{
		return r.a*r.b;
	}

	public static double area(Square s)
	{
		return s.l*s.l;
	}
*/







/*Другие левые функции
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
	}*/

}



