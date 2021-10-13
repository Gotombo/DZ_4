package com.company;

import java.util.*;

public class Users {
    private Scanner scanner;
    ArrayList<String> User = new ArrayList();
    private  String User1 = scanner.nextLine();
    private String User2 = scanner.nextLine();
    private String User3 = scanner.nextLine();
    private String User4;
    private String User5;

    public Users(  String user1, String user2, String user3, String user4, String user5) {
        User1 = user1;
        User2 = user2;
        User3 = user3;
        User4 = user4;
        User5 = user5;
    }
    Collections.sort(Line, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            }else{
                return o1.compareTo(o2);
            }
        }
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    });
}
