package com.codewithmosh.JavaPractice;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble();
        double monthlyInterest = interest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int payments = scanner.nextInt() * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, payments))
                / (Math.pow(1 + monthlyInterest, payments) - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + result);
    }
}