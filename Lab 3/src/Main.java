public class Main {
    public static void main(String[] args) {
        Cardinal cardinal = new Cardinal("John","Balls breaker", 45, "Italy");
        cardinal.setFamilyName("Balls");
        cardinal.setFamilyWealth(1000000);
        System.out.println(cardinal.getName() + " " + cardinal.getFamilyName() + " is a cardinal from " + cardinal.getCountry() + " and has " + cardinal.getFamilyWealth() + " in gold.");
    }
}