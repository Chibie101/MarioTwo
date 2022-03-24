package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type an integer: ");
        int n = scan.nextInt();
        while (n < 1 || n > 8) {
            System.out.println("Type an integer: ");
            n = scan.nextInt();
        }
        int i;
        int j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n - 1 - i; j++)
                System.out.printf(" ");
            for (j = 0; j < i + 1; j++)
                System.out.printf("#");


            System.out.printf("  ");

            for (j = 0; j < i + 1; j++)
                System.out.printf("#");
            for (j = 0; j < n - 1 - i; j++)
                System.out.printf(" ");

            System.out.printf("\n");
        }
    }
}