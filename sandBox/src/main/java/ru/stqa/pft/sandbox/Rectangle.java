package ru.stqa.pft.sandbox;

/**
 * Created by Сергей on 18.06.2017.
 */
public class Rectangle {

    public double a;
    public  double b;

    public  Rectangle (double a, double b)
    {
        this.a=a;
        this.b=b;
    }


    /*Это уже метод Вася*/
    public double area()
    {
        return this.a*this.b;
    }

}
