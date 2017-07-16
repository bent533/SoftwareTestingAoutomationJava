package ru.stqa.pft.sandbox;

/**
 * Created by Сергей on 16.07.2017.
 */
public class Equality {

  public static void main (String[] args)
  {
    String s1 = "firefox";
    String s2 = new String(s1);

    System.out.println(s1==s2);  // ссылочное сравнение, когда сравниваются ссылки на объекты
    System.out.println(s1.equals(s2)); // это логическое сравнение, по смыслу
  }


}
