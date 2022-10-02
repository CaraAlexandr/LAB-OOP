public class King {
private String name;
    private int age;
    private String country;

    public King(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Duke declareDuke(String name, int age, String country){
        System.out.println("Duke " + name + " has been declared!");
        return new Duke(name, age, country);
    }

    public Peasant declarePeasant(String name, int age, String country){
        System.out.println("Peasant " + name + " has been declared!");
        return new Peasant(name, age, country);
    }

    public Jester declareJester(String name, int age, String country){
        System.out.println("Jester " + name + " has been declared!");
        return new Jester(name, age, country);
    }

    public Executor declareExecutor(String name, int age, String country){
        System.out.println("Executor " + name + " has been declared!");
        return new Executor(name, age, country);
    }

    public Judge declareJudge(String name, int age, String country){
        System.out.println("Judge " + name + " has been declared!");
        return new Judge(name, age, country);
    }

    public Knight declareKnight(String name, int age, String country){
        System.out.println("Knight " + name + " has been declared!");
        return new Knight(name, age, country);
    }

    public Merchant declareMerchant(String name, int age, String country){
        System.out.println("Merchant " + name + " has been declared!");
        return new Merchant(name, age, country);
    }

    public Queen declareQueen(String name, int age, String country){
        System.out.println("Queen " + name + " has been declared!");
        return new Queen(name, age, country);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
