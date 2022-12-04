import Model.Model;
import View.View;

public class Main {

    public static void main(String[] args) {
        View theView = new View();
        Model theModel = new Model();
        Controller.Controller theController = new Controller.Controller(theView, theModel);

        theView.setVisible(true);

    }

}