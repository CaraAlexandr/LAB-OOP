public class Plebeian extends Person {
    private String status;

    public Plebeian(String name, int age, String country) {
        super(name, age, country);
    }

    public void setStatus(boolean inputStatus) {
        if (inputStatus) {
            this.status = "Free";
        } else {
            this.status = "Slave";
        }
    }

    public String getStatus() {
        return status;
    }
}

