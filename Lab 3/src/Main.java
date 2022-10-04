public class Main {
    public static void main(String[] args) {
        Cardinal cardinal = new Cardinal("John","Balls breaker", 45, "Italy");
        cardinal.setFamilyName("Balls");
        cardinal.setFamilyWealth(1000000);
        System.out.println(cardinal.getName() + " " + cardinal.getFamilyName() + " is a cardinal from " + cardinal.getCountry() + " and has " + cardinal.getFamilyWealth() + " in gold.");

        System.out.println(cardinal.askGodForHelp());

        Duke duke = new Duke("Michael","Charleston", 45, "Italy");

        duke.party();

        King king = cardinal.declareKing(duke.getName(), duke.getFamilyName(), duke.getAge(), duke.getCountry());


        Peasant peasant1 = new Peasant("John", 78, "Italy",true);
        Peasant peasant2 = new Peasant("Michael", 23, "Italy",false);
        Peasant peasant3 = new Peasant("Jack", 14, "Italy",false);
        Peasant peasant4 = new Peasant("Bob", 55, "Italy", false);

        Jester jester = king.declareJester(peasant1.getName(), peasant1.getAge(), peasant1.getCountry());
        System.out.println(jester.getName() + " is a jester from " + jester.getCountry() + " and is " + jester.getAge() + " years old.");
        System.out.println(jester.tellJoke());

        Executor executor = king.declareExecutor(peasant2.getName(), peasant2.getAge(), peasant2.getCountry());
        System.out.println(executor.getName() + " is an executor from " + executor.getCountry() + " and is " + executor.getAge() + " years old.");
        executor.chopHead(jester.getName());

        Knight knight = king.declareKnight(peasant3.getName(), peasant3.getAge(), peasant3.getCountry());
        knight.train();


        Duke duke2 = new Duke("Vova","Switchblade", 25, "Italy");
        Duke duke3 = new Duke("Anton","Bobic", 57, "Italy");
        Duke duke4 = new Duke("Veronika","Strudel", 25, "Italy");





    }

}