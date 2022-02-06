package com.assin;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.print("enter a year : ");
        int year=s.nextInt();
        if(year%4==0)
            System.out.println("given year is Leap Year ");
        else
            System.out.println("given year is not a Leap Year ");


    }

}
