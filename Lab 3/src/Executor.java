public class Executor extends Plebeian {
    public Executor(String name, int age, String country) {
        super(name, age, country);
    }

    public String chopHead(String newName) {
        return "Chopped"+ newName +"head";
    }

}
