public class Cardinal {
    private String name;
    private int age;
    private String country;

    public Cardinal(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String giveBlessing() {
        return "May God bless you!";
    }

    public King declareKing(String newName, int newAge, String newCountry) {

        System.out.println("I declare " + newName + " as the new king of " + newCountry + "!");
        King king = new King(newName, newAge, newCountry);
        return king ;
    }


    public String askGodForHelp() {
        if(Math.random() > 0.5) {
            return "God said, Yes!";
        } else {
            return "God, said, No!";
        }
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
