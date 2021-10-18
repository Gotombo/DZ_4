package com.company;

import java.util.*;

public class Main {

  public static void main(String[] args) {

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
    Line.add(List.get(0));
    Line.add(ListB.get(4));
    Line.add(List.get(1));
    Line.add(ListB.get(3));
    Line.add(List.get(2));
    Line.add(ListB.get(2));
    Line.add(List.get(3));
    Line.add(ListB.get(1));
    Line.add(List.get(4));
    Line.add(ListB.get(0));

    System.out.println(Line);


    System.out.println(Line);
    Line.sort(Comparator.comparing(String::length));
    System.out.println(Line);

    Iterator iterator = List.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());


    }



}
  }

