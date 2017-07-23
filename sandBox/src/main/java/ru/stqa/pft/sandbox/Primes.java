package ru.stqa.pft.sandbox;

/**
 * Created by Сергей on 23.07.2017.
 */
public class Primes {

  public  static boolean isPrime(int n)
  {
    for(int i=2; i<n; i++)
    {
      if(n % i==0){return false;}  //число составное
    }

    return true; //число простое
  }

  public  static boolean isPrimeWhile(int n)
  {
    int i = 2;
    while (i<n && n % i != 0)
    {
       //число составное
      i++;
    }
    return i == n;
  }




  //long
  public  static boolean isPrime(long n)
  {
    for(long i=2; i<n; i++)
    {
      if(n % i==0){return false;}  //число составное
    }

    return true; //число простое
  }

  public  static boolean isPrimeFast(int n)
  {
    int m =(int) Math.sqrt(n);
    for(int i=2; i<m; i++)
    {
      if(n % i==0){return false;}  //число составное
    }

    return true; //число простое
  }


}
