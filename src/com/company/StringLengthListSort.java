package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthListSort implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        StringLengthListSort ss = new StringLengthListSort();
        list.add("ram");
        list.add("rahim");
        list.add("ramshyam");
        Collections.sort(list, ss);
        System.out.println(list);
    }
}
