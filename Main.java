import java.util.Random;
import java.util.Scanner;

public class Main {

    static char choice;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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


    }

    public static void loner(){


    }

    public static void merc(){


    }





}
