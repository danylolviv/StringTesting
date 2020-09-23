package com.ButWhy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Splitting string into char");

        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();


        for (int i=0; i< output.length(); i++) {
            char c = output.charAt(i);
            System.out.println("@"+ c);
        }

        scanner.close();
    }
}
