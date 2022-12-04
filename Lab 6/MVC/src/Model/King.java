package Model;

public class King extends Nobility {
    public King(String name,String familyName, int age, String country) {
        super(name, familyName, age, country);
        this.country = country;
        this.age = age;
    }


    public String declareWar(String enemy) {
        return "I declare war on " + enemy + "!";
    }

    public String declarePeace(String enemy) {
        return "I declare peace with " + enemy + "!";
    }

    public Duke declareDuke(String name,String familyName, int age, String country){
        System.out.println("Model.Duke " + name + " has been declared!");
        return new Duke(name,familyName, age, country);
    }
    public Jester declareJester(String name, int age, String country){
        System.out.println("Model.Jester " + name + " has been declared!");
        return new Jester(name, age, country);
    }

    public Executor declareExecutor(String name, int age, String country){
        System.out.println("Model.Executor " + name + " has been declared!");
        return new Executor(name, age, country);
    }

    public Judge declareJudge(String name,String familyName , int age, String country){
        System.out.println("Model.Judge " + name + " has been declared!");
        return new Judge(name,familyName ,age, country);
    }

    public Knight declareKnight(String name, int age, String country){
        System.out.println("Model.Knight " + name + " has been declared!");
        return new Knight(name, age, country);
    }

    public Merchant declareMerchant(String name, int age, String country){
        System.out.println("Model.Merchant " + name + " has been declared!");
        return new Merchant(name, age, country);
    }

    public Queen declareQueen(String name, String familyName , int age, String country){
        System.out.println("Model.Queen " + name + " has been declared!");
        return new Queen(name,familyName , age, country);
    }
}
