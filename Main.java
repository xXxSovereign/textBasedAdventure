import java.util.Random;
import java.util.Scanner;

public class Main {

    static char choice;
     static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        System.out.println("You wake up in a dilapidated building, with an eerie silence... ");
        System.out.println("""
                Who are you?\s
                1. I am an ecologist
                2. I am a loner
                3. I am a mercenary""");

        choice = scan.nextLine().charAt(0);

    }


    public static void randomize(){
        Random r = new Random();



    }



    public static void ecologist(){

System.out.println("THESE ARE RESEARCHERS WHO ENTER THE ZONE TO FIND REASONING OF IT’S CREATION AND A SOLUTION TO END IT. THEIR RESEARCH IS VALUABLE AND MANY MERCENARIES ARE PAYED TO HUNT THEM FOR THEIR INFORMATION. THEY ARE NOT WELL ARMED AND TYPICALLY PAY STALKERS AS A SECURITY AT THEIR RESEARCH LOCATION.\n");
System.out.println("You are in a Labrotary enclosed by a dome in a place called 'Yantar'. You were working on a project that is slowing down with progress. Do you wish to continue to work. Or do you want to be reassigned a new assignemt? 1 To keep working. 2 to get reassigned.");

        choice = scan.nextLine().charAt(0);

        if(choice == '1'){
            System.out.println(" After another day of little to no progress. You understand that you need a tool to analyze the artifact you are studying. Professor Sakhorov suggests that you go to the Bar for information. 1. To go to the bar. 2. To go on a rumor amongst the scientists");

            if(choice == '1'){
                System.out.println("You head for the bar with your Protective Suit/Gear with your fully loaded Makorov. In order to go the Bar, you must go through Rostok A Split section of the former town that the bar is apart of. Mercenaries are known to be seen their ambushing their targets.");
                boolean flag1 =
                System.out.println("")
            }

        } else if (choice == '2') {
            System.out.println("Professor Sakhorov needs someone to locate a non-responding ecologists in the 'Dark Valley'. The tasks is urgent as his last message was a cry for help on his PDA. You are go out in your Protective suit, Backpack, and your issued PM Makorov into the zone.");
        }


    }

    public static void loner(){
System.out.println("THEY COME FROM MANY BACKGROUNDS AS BEING THE ONLY FACTION THAT TRULY HAS ONLY ALLIEGENCE TO THEMSELVES AND TO THEIR WORK. COLLECTING ARTIFACTS IS MAIN SOURCE OF INCOME WHILE SOME DO SECURITY. OTHERS COME TO REBUILD DESTROYED LIVES OR TO SEEK OUT “THE WISH GRANTER”. A RUMOR THAT AN ENTITY THAT LIES IN THE CENTER OF THE ZONE THAT WILL GRANT YOUR WISHES. THEY ARE TYPICALLY DYNAMIC WITH WEAPONRY BASED ON THEIR LUCK AND EXPERIENCE.\n" +
        "\n");

    }

    public static void merc(){
System.out.println("\n" +
        "PEOPLE WHO ENTER THE ZONE FOR HIGH-RISK, HIGH-PROFIT JOBS. SOME OF THEIR LARGEST YEILDS ARE TARGETED TORWARDS ECOLOGISTS. THEY ARE HATED AMONGST MOST IN THE ZONE WITH SUSPISCION OF BEING WESTERN OUTSIDERS. THEY CARRY HIGH-QUALITY EQUIPMENT AND WEAPONRY MAINLY FROM NATO NATIONS. \n");

    }





}
