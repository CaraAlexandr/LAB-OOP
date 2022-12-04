import Model.King;
import Model.Queen;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Main {

    private static int input;

    public static String bars(int num) {
        String result = "";
        for (int i = 0; i < num; i+=10) {
            result += "|";
        }
        return result;
    }

    public static String readString(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextLine();
    }

    public static int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }




    public static void main(String[] args) {

        System.out.println("Welcome to the Kingdom of Java!");
        System.out.println("You are the king of this kingdom.");
        System.out.println("What is your name?");
        String kingName = readString("Model.King Name: ");
        System.out.println("What is your family name?");
        String kingFamilyName = readString("Model.King Family Name: ");
        System.out.println("What is your age?");
        int kingAge = Integer.parseInt(readString("Model.King Age: "));
        King king = new King(kingName, kingFamilyName, kingAge,"Java");
        System.out.println("Hello" + " " + kingName + " " + kingFamilyName + " " + "the" + " " + kingAge + " " + "year old king of Java!"+ "\n");


        Config.changeProfile();

        int peasantHappiness = Config.peasantHappiness ;
        int dukeHappiness = Config.dukeHappiness ;
        int wealth = Config.wealth ;



        System.out.println("Model.Peasant happiness: " + bars(peasantHappiness));
        System.out.println("Model.Duke happiness:    " + bars(dukeHappiness));
        System.out.println("Wealth:            " + bars(wealth));



        while (true){
            System.out.println();
            System.out.println("===============================================");
            System.out.println();
            System.out.println("1 : yes");
            System.out.println("2 : no");
            System.out.println("3 : show happiness meters");
            System.out.println();
            int input = randInt(1, 2);

            switch ( input ) {

                case 1:
                    System.out.println("You chose YES");
                    break;
                case 2:
                    System.out.println("You chose NO");
                    break;
                default:
                    System.out.println("You chose something else");
                    break;
            }
            System.out.println();

            System.out.println("Model.Peasant happiness: " + bars(peasantHappiness));
            System.out.println("Model.Duke happiness:    " + bars(dukeHappiness));
            System.out.println("Wealth:            " + bars(wealth));
            System.out.println();
            System.out.println("===============================================");
            System.out.println();

            int inputStory = randInt(1, 5);

            switch (inputStory) {
                case 1:
                    Config.story_1(input);
                    if (input==1){
                        peasantHappiness = peasantHappiness + 20;
                        dukeHappiness = dukeHappiness + 20;
                        wealth = wealth - 10;
                    }
                    else if (input==2){
                        dukeHappiness = dukeHappiness - 20;
                    }
                    break;
                case 2:
                    Config.story_2(input);
                    if (input==1){
                        peasantHappiness = peasantHappiness - 20;
                        dukeHappiness = dukeHappiness + 20;
                        wealth = wealth - 10;
                    }
                    else if (input==2){
                        peasantHappiness = peasantHappiness - 100;
                        dukeHappiness = dukeHappiness - 100;
                        wealth = wealth - 100;
                    }

                    break;
                case 3:
                    Config.story_3(input);
                    if (input == 1) {
                        peasantHappiness = peasantHappiness + 20;
                        dukeHappiness = dukeHappiness + 20;
                        wealth = wealth - 10;
                    } else if (input == 2) {
                        peasantHappiness = peasantHappiness - 20;
                        dukeHappiness = dukeHappiness - 20;
                        wealth = wealth + 10;
                    }
                    break;
                case 4:
                    Config.story_4(input);
                    if (input==1){
                        peasantHappiness = peasantHappiness + 20;
                        wealth = wealth + 20;
                        System.out.println("They were hiding a treasure from another kingdom. You found it.");
                    }
                    else if (input==2){
                        peasantHappiness = peasantHappiness -5;
                        dukeHappiness = dukeHappiness -5;
                        wealth = wealth -5;
                        System.out.println("They got into the vault, stole some treasure and killed a bunch of guards");
                    }

                    break;
                case 5:
                    Config.story_5(input);
                    switch (input){
                        case 1:
                            Queen queen = new Queen("Fiona", "Traumberg", 25, "Unknown");
                            peasantHappiness = peasantHappiness + 20;
                            dukeHappiness += 20;
                            wealth += 10;

                        case 2:
                            peasantHappiness = peasantHappiness - 20;
                            dukeHappiness -= 20;
                            wealth -= 10;

                        default:
                            Queen queen1 = new Queen("Fiona", "Traumberg", 25, "Unknown");
                            peasantHappiness = peasantHappiness + 20;
                            dukeHappiness = dukeHappiness + 20;
                            wealth = wealth + 10;
                    }
                    break;
                default:
                    System.out.println("You chose something else");
                    break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (peasantHappiness <= 0 || dukeHappiness <= 0 || wealth <= 0) {
                System.out.println("Game Over");
                break;
            }
        }
    }
}