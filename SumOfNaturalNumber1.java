package com.assin;
import java.util.Scanner;

public class SumOfNaturalNumber1{
    public static void main(String []args) {
        int num,i,sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("sum from");
        i=sc.nextInt();
        System.out.println("sum to");
        num=sc.nextInt();
        while(i<=num){
            sum=sum+i;
            i++;


        }
        System.out.println("the Sum of natural numbers=" +
                sum);

    }
}
