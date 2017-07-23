package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Сергей on 23.07.2017.
 */
public class Collections {
  public static void main (String[] args)
  {
    /*
    String[] langs = new String[4];
    langs[0]="California";
    langs[1]="NewYork";
    langs[2]="Virgin";
    langs[3]="Mexico";
    */
    String[] langs = {"California","NewYork","Virgin","Mexico"};

    /*
    List<String> favco = new ArrayList<String>();
    favco.add("Italy");
    favco.add("Espania");
    favco.add("Praga");
    favco.add("Germany");
    */
    List<String> favco =   Arrays.asList("Italy","Espania","Praga","Germany","California","NewYork","Virgin","Mexico");

    for (String l : langs)
    {
      System.out.println(l);
    }

    for (String l : favco)
    {
      System.out.println(l);
    }


  }
}
