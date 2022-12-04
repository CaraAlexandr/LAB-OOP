import Model.Model;
import View.GameView;
import View.SettingsView;

public class Main {

    public static void main(String[] args) {
        SettingsView theSettingsView = new SettingsView();
        GameView theGameView = new GameView();
        Model theModel = new Model();
        Controller.Controller theController = new Controller.Controller(theSettingsView, theModel);

        theSettingsView.setVisible(true);
        theGameView.setVisible(true);

    }

}