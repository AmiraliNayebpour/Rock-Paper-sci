package com.company;

import java.util.Random;
import java.util.Scanner;

public class RPS {

    Random random = new Random();
    String[] materials = {"Rock" , "Paper" , "scissors"};
    Scanner scanner = new Scanner(System.in);
    public RPS() {
        System.out.println("=======================================");
        System.out.println("RPS Game with IE!! (This game has written by Java!! :) )");
        System.out.println("Player Please Enter One of these => Rock , Paper , Scissors");
        while (true) {
            String playerSelction = scanner.nextLine();
            int ieSelection = random.nextInt(materials.length);
            String ieSel = materials[ieSelection];
            if (playerSelction.equalsIgnoreCase(materials[0]) && ieSel.equalsIgnoreCase(materials[0])) {
                System.out.println("Ah... Equals!! Try Again!!");
            } else if (playerSelction.equalsIgnoreCase(materials[0]) && ieSel.equalsIgnoreCase(materials[1])) {
                System.out.println("Ah Player you lose and IE Win!!!");
            } else if (playerSelction.equalsIgnoreCase(materials[0]) && ieSel.equalsIgnoreCase(materials[2])) {
                System.out.println("Great Job!! You Win!");
            } else if (playerSelction.equalsIgnoreCase(materials[1]) && ieSel.equalsIgnoreCase(materials[1])) {
                System.out.println("Ah... Equals!! Try Again!!");
            } else if (playerSelction.equalsIgnoreCase(materials[1]) && ieSel.equalsIgnoreCase(materials[0])) {
                System.out.println("Great Job!! You Win!");
            } else if (playerSelction.equalsIgnoreCase(materials[1]) && ieSel.equalsIgnoreCase(materials[2])) {
                System.out.println("Ah Player you lose and IE Win!!!");
            } else if (playerSelction.equalsIgnoreCase(materials[2]) && ieSel.equalsIgnoreCase(materials[2])) {
                System.out.println("Ah... Equals!! Try Again!!");
            } else if (playerSelction.equalsIgnoreCase(materials[2]) && ieSel.equalsIgnoreCase(materials[0])) {
                System.out.println("Ah Player you lose and IE Win!!!");
            } else if (playerSelction.equalsIgnoreCase(materials[2]) && ieSel.equalsIgnoreCase(materials[1])) {
                System.out.println("Great Job!! You Win!");
            } else {
                System.out.println("Play correctly please!!");
            }
         }


    }
}
