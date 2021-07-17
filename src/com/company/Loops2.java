package com.company;

import java.util.Scanner;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int quad = 1;
            int prevRes = a;
            String result = "";

            for (int j=0; j<n; j++) {
                int temp = quad*b + prevRes;
                prevRes = temp;
                quad = quad * 2;
                result = new String(result + Integer.toString(temp) + " ");
            }

            System.out.println(result);
        }
        in.close();
    }
}
