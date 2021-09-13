package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf( "Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%nYour choice: " );
        char choice = sc.next().charAt(0);

        if(choice == 'c' || choice == 'C'){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int val = sc.nextInt();
            val = (val - 32) * 5 /9;
            System.out.printf("The temperature in Celsius is %d%n", val);
        }

        else if(choice == 'f' || choice == 'F'){
            System.out.print("Please enter the temperature in Celsius: ");
            int val = sc.nextInt();
            val = (val * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %d%n", val);

        }

        else{
            System.out.println("Invalid input.");
        }

    }
}
