import java.sql.SQLOutput;
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



    public static void ecologist(){

System.out.println("THESE ARE RESEARCHERS WHO ENTER THE ZONE TO FIND REASONING OF IT’S CREATION AND A SOLUTION TO END IT. THEIR RESEARCH IS VALUABLE AND MANY MERCENARIES ARE PAYED TO HUNT THEM FOR THEIR INFORMATION. THEY ARE NOT WELL ARMED AND TYPICALLY PAY STALKERS AS A SECURITY AT THEIR RESEARCH LOCATION.\n");
System.out.println("You are in a Laboratory enclosed by a dome in a place called 'Yantar'. You were working on a project that is slowing down with progress. Do you wish to continue to work.(1) Or do you want to be reassigned a new assignemt? (2)");

        choice = scan.nextLine().charAt(0);
        //test
if(choice == 1){
    System.out.println("You had your Eureka moment. You need a tool that Professor Sahkorov suggests you should ask the people inside the bar in Duty Territory. You will have to go through Rostok which has sighted Mercenaries recently. You head out with your Protective Suit and a fully loaded Makorov PM.");

}



    if (flags[0])

    {
        System.out.println("Gunfire cracks with rounds hitting around you. You can see them in the old construction project to your right while you hide behind a train car on the oppisite side. Do you Negotiate (1) Stand your ground? (2) or Attempt to dash through to the Duty outpost around the corner of the street? (3)");

        switch (choice) {
            case '1' -> {
                if (flags[1]) {
                    System.out.println("They honor our ceasefire as they approach, you notice they dawn dark clothing and western tactical gear. They ");
                } else {
                    System.out.println();
                }
            }
                case '2' -> {

                    System.out.println("");
                }
                case '3' -> {

                    System.out.println("");
                }


                default -> {
                    System.out.println("You died");
                    System.exit(1);
                }


            }


        }else{
        System.out.println("You made it through Rostok undetected and unscaved. You make it into the Underground Bar and pass by the Duty Member gaurding the bunker. Do you ask around? (1) Or do you Barter ?(2)");
    }
    }


    public static void loner(){
System.out.println("""
        Backstory:\s
        THEY COME FROM MANY BACKGROUNDS AS BEING THE ONLY FACTION THAT TRULY HAS ONLY ALLEGIANCE TO THEMSELVES AND TO THEIR WORK.
        COLLECTING ARTIFACTS IS MAIN SOURCE OF INCOME WHILE SOME DO SECURITY. OTHERS COME TO REBUILD DESTROYED LIVES OR TO SEEK OUT “THE WISH GRANTER”.
        A RUMOR THAT AN ENTITY THAT LIES IN THE CENTER OF THE ZONE THAT WILL GRANT YOUR WISHES. THEY ARE TYPICALLY DYNAMIC WITH WEAPONRY BASED ON THEIR LUCK AND EXPERIENCE.
        
        You're in Cordon, a checkpoint at the border of the exclusion zone. Many newcomers are located here.
        You decide to take a stroll outside. There is a man advertising jobs, and a makeshift bar with people flowing in and out.
        
        1. Go to the Bar
        2. Take a job
        
        """);


        // Follow the rumor
        if (scan.nextInt() == 1) {

            System.out.println("""
                    You enter the bar and get a drink. By chance, you hear another patron talking about a way to the center
                    You decide to listen in more on this rumor.
                    You learn that there is a way to the center through garbage and the Bar.
                                        
                    You gulp down the rest of your drink and start on your way to Garbage.
                                        
                    Garbage is full of bandits and thieves. If you're lucky, you wont get bothered.
                    """);

            if (flags[0]) {
                System.out.println("You got lucky and snuck through Garbage without a problem");
            } else {
                System.out.println("""
                        You were spotted by bandits and they've decided to harass you
                        You have a few choices:
                                                
                        1. Fight
                        2. Negotiate/Run
                                                
                        """);

                switch (scan.nextInt()) {
                    case 1 -> {
                        if (flags[1])
                            System.out.println("You successfully fought them off and you escape before more show up. You make it through the rest of Garbage without a hitch");
                        else {
                            System.out.println("You regret skipping Karate class one too many times as the bandits tear you limb from limb.");
                            System.exit(1); // 1 (Ending count)
                        }
                    }
                    case 2 -> {
                        if (flags[1] && flags[2]){
                            System.out.println("All those public speaking clases you took really paid off. You negotiated so well they decided to take you along with them as a partner." +
                                    " You live a life full of wealth and murder.");
                            System.exit(1); // 2
                        }
                        else if (flags[1]) {
                            System.out.println("You negotiated well and escaped without a hitch! You made it through the rest of Garbage without a problem.");
                        }
                        else {
                            System.out.println("You should've taken more public speaking classes. You stumble on all your words and they decide to just dispose of you.");
                            System.exit(1); // 3
                        }
                    }
                }
            }
            System.out.println("""
                    
                    You arrive at the Bar, an old fallout shelter.
                    There are many mercenaries and experienced travelers around.
                    
                    You have a few choices:
                        1. Sit down and grab a drink
                        2. Talk to some of the travelers about going to the center
                    
                    """);
            switch (scan.nextInt()){
                case 1 -> System.out.println("You sit down at the bar. A traveler walks up and asks to join you. He proceeds to tell you about his travels to the center");
                case 2 -> System.out.println("You walk up to a traveler and ask about traveling to the center");

            }
            if (flags[3]){
                System.out.println("""
                        The traveler tells you that it is impossible to get to the center. There is a huge amount of radiation near the center that melts your flesh off. 
                        No traveler has ever been able to make it to the center alive. He encourages you to stop and give up
                       
                        With this news, you feel very conflicted. Do you keep on trying?
                        1. Yes
                        2. Give up
                        """);
                if (scan.nextInt() == 2){
                    System.out.println("You decide to give up on your greatest ambition. Utter failure.");
                    System.exit(1); // 4
                }

                System.out.println("""
                        You decide to ignore what the traveler says and tell him you're going to try anyways.
                        Seeing your determination, he tells you that there is a scientist in Yantar that might be able to help you.
                        """);

            } else {
                System.out.println("""
                        You ask one of the more experienced travelers about getting to the center
                        He tells you that there is a scientist in Yantar that might be able to help you.
                        
                        """);
            }

            System.out.println("""
            Thankfully, you know a back way to Yantar that is relatively safe.
            
            The trip there is relatively easy and short without any problems
            
            Once you arrive you head inside the Yantar lab to find the scientist.
            After searching for a little you find him in a server room. 
            
            You tell him your ambition and ask for his help. 
            
            He has a special suit that will allow you to enter the center without dying. However the suit comes with a hefty price.
            
            1. Do a job for the scientist as payment
            2. Negotiate the price down
            3. Threaten the scientist for the suit. 
            """);

            switch (scan.nextInt()) {

                case 1 -> {
                    System.out.println("""
                            The scientist wants you to kill some mercs that are hunting him, and in return he'll give you the suit.
                            
                            Do you accept?
                                1. Yes
                                2. No
                            """);
                    if (scan.nextInt() == 1) {
                        System.out.println();

                    } else {
                        System.out.println();
                    }

                }

                case 2 -> {


                }

                case 3 -> {


                }
            }

        }




        // Take a job
        else {
            System.out.println("temp");

        }




    }

    public static void merc(){
System.out.println("""

        PEOPLE WHO ENTER THE ZONE FOR HIGH-RISK, HIGH-PROFIT JOBS. SOME OF THEIR LARGEST YIELDS ARE TARGETED TOWARDS ECOLOGISTS.
        THEY ARE HATED AMONGST MOST IN THE ZONE WITH SUSPICION OF BEING WESTERN OUTSIDERS.
        THEY CARRY HIGH-QUALITY EQUIPMENT AND WEAPONRY MAINLY FROM NATO NATIONS.\s
        """);

    }





}
