package Controller;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    private Model.Model theModel;
    private SettingsView theSettingsView;
    private GameView theGameView;

    public Controller(SettingsView theSettingsView, Model.Model theModel) {
        this.theSettingsView = theSettingsView;
        this.theModel = theModel;
        this.theSettingsView.addSubmitListener(new SubmitListener());
    }

    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = "";
            String familyName = "";
            String difficulty = "";
            int age = 0;
            try {
                name = theSettingsView.getName();
                familyName = theSettingsView.getFamilyName();
                age = theSettingsView.getAge();
                difficulty = theSettingsView.setDifficulty();
            } catch (NumberFormatException ex) {
                theSettingsView.displayErrorMessage("Please enter valid data");
            }
            theModel.setKingName(name);
            theModel.setKingFamilyName(familyName);
            theModel.setKingAge(age);
            theModel.setDifficulty(difficulty);

        }
    }
    class DifficultyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String difficulty = theSettingsView.setDifficulty();
            theModel.setDifficulty(difficulty);
        }
    }
}

