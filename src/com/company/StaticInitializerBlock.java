package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StaticInitializerBlock {
    private static Scanner sc = new Scanner(System.in);
    private static boolean flag = true;
    private static int B = sc.nextInt();
    private static int H = sc.nextInt();



    static {
        try {
            if (B<=0 || H<=0) {
                flag = false;
                throw new java.lang.Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }//end of main

}
