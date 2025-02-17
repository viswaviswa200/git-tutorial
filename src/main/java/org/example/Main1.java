package org.example;

import java.util.Scanner;

public class Main1 {
    public static boolean isPrime(int n){
        if(n<=2) return true;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        if(isPrime(in.nextInt())) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
    }

}
