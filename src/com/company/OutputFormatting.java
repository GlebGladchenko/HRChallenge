package com.company;

import java.util.Scanner;

public class OutputFormatting {

    public void res() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            if ((x/100) < 1 && (x/100) != 0) {
                System.out.printf("%-15s%03d%n", s1, x);
            } else if (x/100 == 0) {
                System.out.printf("%-15s%03d%n", s1, x);
            } else {
                System.out.printf("%-15s%03d%n", s1, x);
            }
        }
        System.out.println("================================");
    }

}
