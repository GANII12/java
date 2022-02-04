package com.company;
import java.net.SocketOption;
import java.util.*;
public class factors {
    public static void main(String[] args) {
        System.out.println("Provide a number to find out their factor ");
        Scanner sc = new Scanner(System.in);
        int factorNumber = sc.nextInt();
        for (int i = 2; i <= factorNumber; i++) {
            if ( factorNumber % i == 0)
                System.out.print(i + "\t");

        }

        System.out.println();
    }
}
