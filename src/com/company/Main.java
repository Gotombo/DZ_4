package com.company;

import java.util.*;

public class Main {

    public static ArrayList<String> main(String[] args) {

      ArrayList<String> List = new ArrayList();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите 5 имен");

      String User1 = scanner.nextLine();
      String User2 = scanner.nextLine();
      String User3 = scanner.nextLine();
      String User4 = scanner.nextLine();
      String User5 = scanner.nextLine();
      List.add(User1);
      List.add(User2);
      List.add(User3);
      List.add(User4);
      List.add(User5);
      System.out.println(List);
      System.out.println("Введите названия месяца");
      String Year1 = scanner.nextLine();
      String Year2 = scanner.nextLine();
      String Year3 = scanner.nextLine();
      String Year4 = scanner.nextLine();
      String Year5 = scanner.nextLine();
      ArrayList<String> ListB = new ArrayList();
      System.out.println("___________________");
      ListB.add(Year1);
      ListB.add(Year2);
      ListB.add(Year3);
      ListB.add(Year4);
      ListB.add(Year5);
      ArrayList<String> Line = new ArrayList();
      System.out.println("___________________________");
      Line.addAll(List);
      Line.addAll(ListB);
      System.out.println(Line);


      System.out.println(Line);

      Iterator iterator = List.iterator();
      while (iterator.hasNext()) {
        System.out.println(iterator.next());

      }
      Comparator c = new Comparator() < String > () {
        {
          public int compare (String s1, String s2){
          return Integer.compare(s1.length(), s2.length());
        }
        } ;
        Collections.sort(Line, c);
        return Line;
      }


    }
}
