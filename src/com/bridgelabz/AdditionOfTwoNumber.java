package com.bridgelabz;

import java.util.Scanner;

public class AdditionOfTwoNumber {

    public static void main(String[] args) {

        System.out.println("Welcome to my first project ");
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int sum = a+b;
        System.out.println("SUM = "+sum);

        int subtraction = a-b;
        System.out.println("SUBTRACTION = "+subtraction);

        int mul = a*b;
        System.out.println("mul = "+mul);

        int div = a/b;
        System.out.println("division = "+div);
    }
}
