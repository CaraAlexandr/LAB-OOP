public class Executor extends Plebeian {
    public Executor(String name, int age, String country) {
        super(name, age, country);
    }

    public void chopHead(String newName) {
        System.out.println(getName() + " chopped " + newName + "'s head off!");
    }

}
