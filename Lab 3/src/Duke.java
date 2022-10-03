public class Duke extends Nobility {
    public Duke(String name,String familyName, int age, String country) {
        super(name,familyName, age, country);
    }

    public String party() {
        return "I'm a Duke and I'm partying!";
    }

    public int takeLand(){
        return (int) (Math.random()*(1000-1+1)+1);
    }

    public int giveLand(){
        return (int) (Math.random()*(1000-1+1)+1);
    }

}
