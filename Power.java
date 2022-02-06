package com.assin;
import java.util.Scanner;
// POWER OF A NUMBER ,,,... AS USER GIVEN...
public class Power{

    public static void main(String[] args) {
	// write your code here
        int base,exponent,expo;
        Scanner sc = new Scanner(System.in);
        base=sc.nextInt();
        System.out.println("Enter a base");
        exponent=sc.nextInt();
        System.out.println("Enter a exponent");
        expo=exponent;
        int result = 1;

        while(exponent != 0) {
            result=result*base;
            --exponent;
        }

        System.out.println(base+" to the reult"+exponent+"is" +" " +result);
    }
}
