import jdk.jshell.Snippet;

import java.util.*;

public class Main {

    static Random r = new Random();
    static char choice;
    static Scanner scan = new Scanner(System.in);
    static boolean[] flags = new boolean[10]; // flags for luck rolls when playing

    public static void main(String[] args) {

        randomize();

        System.out.println("""
                You wake up in a dilapidated building, with an eerie silence...
                Who are you?\s
                1. I am an ecologist
                2. I am a loner
                3. I am a mercenary""");



        choice = scan.nextLine().charAt(0);
        switch (choice) {
            case '1' -> ecologist();
            case '2' -> loner();
            case '3' -> merc();
            default -> {
                System.out.println("Wrong input, shutting down.");
                System.exit(1);
            }
        }

    }


    public static void randomize() {
        for (int i = 0; i < flags.length; i++) {
            if (r.nextInt(2) == 1) {
                flags[i] = true;
            }

        }
    }



    public static void ecologist() {

        System.out.println("THESE ARE RESEARCHERS WHO ENTER THE ZONE TO FIND REASONING OF IT’S CREATION AND A SOLUTION TO END IT. THEIR RESEARCH IS VALUABLE AND MANY MERCENARIES ARE PAYED TO HUNT THEM FOR THEIR INFORMATION. THEY ARE NOT WELL ARMED AND TYPICALLY PAY STALKERS AS A SECURITY AT THEIR RESEARCH LOCATION.\n");
        System.out.println("You are in a Laboratory enclosed by a dome in a place called 'Yantar'. You were working on a project that is slowing down with progress. Do you wish to continue to work.(1) Or do you want to be reassigned a new assignemt? (2)");

        choice = scan.nextLine().charAt(0);
        //test
        if (choice == 1) {
            System.out.println("You had your Eureka moment. You need a tool that Professor Sahkorov suggests you should ask the people inside the bar in Duty Territory. You will have to go through Rostok which has sighted Mercenaries recently. You head out with your Protective Suit and a fully loaded Makorov PM.")

        } if (flags[0]) {
            System.out.println("Gunfire cracks with rounds hitting around you. You can see them in the old construction project to your right while you hide behind a train car on the oppisite side. Do you Negotiate (1) Stand your ground? (2) or Attempt to dash through to the Duty outpost around the corner of the street? (3)");

            switch (choice) {
                case '1' -> {
                    if (flags[1]) {
                        System.out.println("They honor our ceasefire as they approach, you notice they dawn dark clothing and western tactical gear; Mercenaries. They demand your reasearch documents or your life and you hand them a file you kept with you for the trip.");
                    } else {
                        System.out.println();

                    }
                    case '2' -> {
                        if (flags[2]) {
                            System.out.println("You let them come in close onto you as you hide inside the train car. You peak out and squeze off a few rounds and one out of the three men fall.");
                        } else {
                            System.out.println("You died");
                            case '3' -> {
                                if (flags[3]) {
                                    System.out.println();
                                } else {
                                    System.out.println("You Booked it around the street corner dodging gunfire to the Duty Outpost.");


                                    default -> {
                                        System.out.println("You died");
                                        System.exit(1);
                                    }
                                }
                            }
                        }





    }


        }else {System.out.println("You made it through Rostok undetected and unscaved. You make it into the Underground Bar and pass by the Duty Member gaurding the bunker. Do you ask around? (1) Or do you Barter ?(2)");


    }

    public static void loner(){
System.out.println("""
        Backstory:\s
        THEY COME FROM MANY BACKGROUNDS AS BEING THE ONLY FACTION THAT TRULY HAS ONLY ALLEGIANCE TO THEMSELVES AND TO THEIR WORK.
        COLLECTING ARTIFACTS IS MAIN SOURCE OF INCOME WHILE SOME DO SECURITY. OTHERS COME TO REBUILD DESTROYED LIVES OR TO SEEK OUT “THE WISH GRANTER”.
        A RUMOR THAT AN ENTITY THAT LIES IN THE CENTER OF THE ZONE THAT WILL GRANT YOUR WISHES. THEY ARE TYPICALLY DYNAMIC WITH WEAPONRY BASED ON THEIR LUCK AND EXPERIENCE.
        
        You're in Cordon, a checkpoint at the border of the exclusion zone. Many newcomers are located here.
        
        """);




    }

    public static void merc(){
System.out.println("\n" +
        "PEOPLE WHO ENTER THE ZONE FOR HIGH-RISK, HIGH-PROFIT JOBS. SOME OF THEIR LARGEST YEILDS ARE TARGETED TORWARDS ECOLOGISTS. THEY ARE HATED AMONGST MOST IN THE ZONE WITH SUSPISCION OF BEING WESTERN OUTSIDERS. THEY CARRY HIGH-QUALITY EQUIPMENT AND WEAPONRY MAINLY FROM NATO NATIONS. \n");

    }





}
