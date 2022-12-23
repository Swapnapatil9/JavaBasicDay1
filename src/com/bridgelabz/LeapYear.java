package com.bridgelabz;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :" );
        int year = sc.nextInt();
        if(year%400==0 && (year%4==0 || year%100!=0))
            System.out.println("Enter year is Leap year");
        else
        System.out.println("Enter year is not Leap year");
    }
}
