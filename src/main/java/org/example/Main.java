/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Arrays;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String[] price = new String[3];
        String[] quantity = new String[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("Enter the price of item %d: ", (i + 1));
            price[i] = inp.nextLine();
            System.out.printf("Enter the quantity of item %d: ", (i + 1));
            quantity[i] = inp.nextLine();
        }

        int[] string2num = new int[price.length];
        int[] string2num1 = new int[quantity.length];

        for (int i = 0; i < 3; i++)
        {
            string2num[i] = Integer.parseInt(price[i]);
            string2num1[i] = Integer.parseInt(quantity[i]);
        }

        float subtotal = 0;

        for (int i = 0; i < 3; i++)
        {
            subtotal += (string2num[i] * string2num1[i]);
        }

        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        System.out.print("Subtotal: $" + String.format("%.2f", subtotal) + "\n" + "Tax: $" + String.format("%.2f", tax) + "\n" + "Total: $" + String.format("%.2f", total));

    }
}
