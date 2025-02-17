package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void countFrequency(String name){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<name.length();i++){
            map.put(name.charAt(i),map.getOrDefault(name.charAt(i),0)+1);
        }
//        map.forEach((k,v)->System.out.println(k+" : "+v));
        for(int i=0;i<name.length();i++) System.out.println(name.charAt(i)+" : "+map.get(name.charAt(i)));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        countFrequency(in.nextLine());
    }
}