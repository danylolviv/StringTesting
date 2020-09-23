package com.ButWhy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("String length output");

        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        if (output.length() == 0) {
            System.out.println("Bruh type some!");
        } else {
            System.out.println(output.length());

        }
        scanner.close();
    }
}
