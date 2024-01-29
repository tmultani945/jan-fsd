package com.careerit.day2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter the Time period: ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;
        double totalamount  = p+si;

        System.out.println("Principal was "+p);
        System.out.println("Simple Interest is "+ si);
        System.out.println("Total Amount becomes "+ totalamount);
    }
}
