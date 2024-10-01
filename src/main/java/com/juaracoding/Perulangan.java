package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {

        // for
        for (int i = 0; i < 5; i++) { // 5 < 5 (false)
            System.out.println(i);
        }

        System.out.println("Next statement");

        // 1 3 5 7 9
        for (int i = 0; i < 10; i++) { // 10 < 10 (false)
            if(i % 2 == 1){ // 2 % 2 = 0 == 1 (false)
                System.out.print(i+" ");
            }
        }

        for (int i = 1; i < 10; i+=2) { // i = 3 + 2
            System.out.print(i+" ");
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(i+" ");
            i++;
        }

        // decrement
        for (int i = 9; i > 0; i--) { // 0 > 0 (false)
            System.out.print(i+" ");
            i--;
        }

        System.out.println();
        // nested for
        // *****
        // *****
        // *****
        // *****
        // *****
        int sisi = 5;
        for (int i = 0; i < sisi; i++) { // i = 0
            for (int j = 0; j < sisi; j++) { // 10 < 10
                System.out.print("*");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        for (int i = 1; i <= sisi; i++) { // 1 - 5
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ***
        // **
        // *
        for (int i = sisi; i > 0; i--) { // 5 - 1
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // while
        int x = 0;
        System.out.println("X");
        while (x < 0){
            System.out.print(x);
            x++;
        }
        System.out.println();
        System.out.println("Next statement");

        // do while
        int y = 0;
        System.out.println("Y");
        do {
            System.out.print(y);
            y++;
        } while (y < 0);
        System.out.println();

        // break / continue
        while (x < 6){
            System.out.println("Looping ke-"+x);
            x++;
            if(x == 3) break;
        }

//        while (x < 6){
//            if(x == 3){
//                x++;
//                continue;
//            }
//            System.out.println("Looping ke-"+x);
//            x++;
//        }

        // input angka berapapun, tapi ketika input angka 0 keluar looping
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input angka = ");
            int angka = scanner.nextInt();
            System.out.println(angka);
            if(angka == 0) break;
        }

    }

}
