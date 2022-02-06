package com.assin;
import java.util.Scanner;

public class MinOf2Num {
    public static void main(String[] args) {
        // TODO Auto-generated method stub.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=s.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=s.nextInt();
        if(num1<num2)
            System.out.println("num1 is less then num2 : " + num1);
        else
            System.out.println("num2 is less than num1: " + num2);


    }
}
