package com.ButWhy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dev Branch");


        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        String reverse = new StringBuffer(output).reverse().toString();
        System.out.println(reverse);
        scanner.close();
    }
}
