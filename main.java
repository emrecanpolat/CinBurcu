package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int year,kalan;

       Scanner input = new Scanner(System.in);

        System.out.println("Doğdunuz yılı giriniz:");
        year = input.nextInt();

        kalan = year%12;

        switch (kalan){
            case 0:
                System.out.println("Çin Burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Burcunuz: Koyun");
                break;
        }






    }
}
