package com.assin;
import java.util.Scanner;

public class FactorialOfNumber
{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("enter a number:");
        int i=1,fact=1;
        while(i<=num){
            fact=fact+i;
            i++;
        }
        System.out.println("factorial of number:"+fact);
        System.out.println();
    }
}
