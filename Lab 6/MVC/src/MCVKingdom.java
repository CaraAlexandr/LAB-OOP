import Model.*;
import Controller.*;
import View.*;

public class MCVKingdom {
    public static void main(String[] args) {
        KingdomView theView = new KingdomView();
        Model.Model theModel = new Model();
        Controller theController = new Controller(theView, theModel);
    }
}
