package org.example.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input CelsiusDegrees: ");
        int celsius = input.nextInt();
        System.out.println("Input FahrenheitsDegrees: ");
        int fahrenheit = input.nextInt();
        double degree = 273.15;
        double a = 9.0 / 5;
        int b = 32;
        System.out.println("Kelvin = " + (celsius + degree));
        System.out.println("Fahrenheit = " + ((fahrenheit * a) + b));
    }
}
