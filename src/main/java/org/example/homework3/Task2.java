package org.example.homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int a= input.nextInt();
        System.out.print("Input 2nd integer: ");
        int b= input.nextInt();
        System.out.println("Max integer: "+((a > b) ? a : b));
        System.out.println("Min integer: "+((a < b) ? a : b));

    }
}
