public abstract class Config {
    public static final String VERSION = "0.0.1";
    public static final int MAX_PEASANT_HAPPINESS = 100;
    public static final int MAX_DUKE_HAPPINESS = 100;
    public static final int MAX_WEALTH = 100;
    public static final int MIN_PEASANT_HAPPINESS = 0;
    public static final int MIN_DUKE_HAPPINESS = 0;
    public static final int MIN_WEALTH = 0;

    public static int peasantHappiness = 85;
    public static int dukeHappiness = 85;
    public static int wealth = 15;


    public static int profile = 1; // profile: 1, 2, 3, 4, 5


    public static void changeProfile() {
        Config.profile = profile;
        switch (profile) {
            case 1:
                System.out.println("Profile 1");
                System.out.println("Easy mode");
                peasantHappiness = 85;
                dukeHappiness = 85;
                wealth = 85;
                break;
            case 2:
                System.out.println("Profile 2");
                System.out.println("Wealthy mode");
                peasantHappiness = 15;
                dukeHappiness = 15;
                wealth = 85;
                break;
            case 3:
                System.out.println("Profile 3");
                System.out.println("Basic mode");
                peasantHappiness = 50;
                dukeHappiness = 50;
                wealth = 50;
                break;
            case 4:
                System.out.println("Profile 4");
                System.out.println("Hard mode");
                peasantHappiness = 10;
                dukeHappiness = 10;
                wealth = 10;
                break;
            default:
                System.out.println("Profile 1");
                break;
        }
    }
    public static void story_1(int input){
        System.out.println("A war is about to start between the kingdom of Java and the kingdom of C#.");
        System.out.println("The war will start in 3 days.");
        System.out.println("You have to prepare for the war.");
        System.out.println("Do you want to prepare for the war?");
        System.out.println("Your peasant happiness, duke happiness and wealth will be affected.");
        if (input==1){
            peasantHappiness = peasantHappiness + 20;
            dukeHappiness = dukeHappiness + 20;
            wealth = wealth - 10;
        }
        else if (input==2){
            dukeHappiness = dukeHappiness - 20;
        }
    }
    public static void story_2(int input){
        System.out.println("The war has started.");
        System.out.println("Do you want to fight for the kingdom?");
        System.out.println("Your peasant happiness, duke happiness and wealth will be affected.");
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
    }
    public static void story_3(int input) {
        System.out.println("The war has ended.");
        System.out.println("The kingdom of Java has won the war.");
        System.out.println("Do you want to celebrate the victory?");
        System.out.println("Your peasant happiness, duke happiness and wealth will be affected.");
        if (input == 1) {
            peasantHappiness = peasantHappiness + 20;
            dukeHappiness = dukeHappiness + 20;
            wealth = wealth - 10;
        } else if (input == 2) {
            peasantHappiness = peasantHappiness - 20;
            dukeHappiness = dukeHappiness - 20;
            wealth = wealth + 10;
        }
    }
    public static void story_4(int input){
            System.out.println("A convent of nuns has started mewing. It spreads to the village.");
            System.out.println("Should we interfere?");

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

        }
    public static void story_5 (int input){
        System.out.println("You got the news of a princess held in the Dark Rock Castle on the top of the mountain.");
        System.out.println("Do you want to go and rescue her?");
        System.out.println("Your peasant happiness, duke happiness and wealth will be affected.");

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

        }
    }
