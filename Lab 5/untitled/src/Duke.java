public class Duke extends Nobility {
    public Duke(String name,String familyName, int age, String country) {
        super(name,familyName, age, country);
    }

    public void party() {
        System.out.println(getName() + " is throwing a party");
    }

    public int takeLand(){
        return (int) (Math.random()*(1000-1+1)+1);
    }

    public int giveLand(){
        return (int) (Math.random()*(1000-1+1)+1);
    }

}
