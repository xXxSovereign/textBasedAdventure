import java.util.*;

public class Main {

    static char choice;
    static Scanner scan = new Scanner(System.in);
    static boolean[] flags = new boolean[10]; // flags for luck rolls when playing

    public static void main(String[] args) {

        //test 124

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
        Random r = new Random();
        for (int i = 0; i < flags.length; i++) {
            if (r.nextInt(2) == 1) {
                flags[i] = true;
            }

        }
    }



    public static void ecologist(){

System.out.println("THESE ARE RESEARCHERS WHO ENTER THE ZONE TO FIND REASONING OF IT’S CREATION AND A SOLUTION TO END IT. THEIR RESEARCH IS VALUABLE AND MANY MERCENARIES ARE PAYED TO HUNT THEM FOR THEIR INFORMATION. THEY ARE NOT WELL ARMED AND TYPICALLY PAY STALKERS AS A SECURITY AT THEIR RESEARCH LOCATION.\n");
System.out.println("You are in a Laboratory enclosed by a dome in a place called 'Yantar'. You were working on a project that is slowing down with progress. Do you wish to continue to work. Or do you want to be reassigned a new assignemt? Y/N");

        choice = scan.nextLine().charAt(0);
        //test



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
