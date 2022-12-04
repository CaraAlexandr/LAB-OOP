package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    private Model.Model theModel;
    private View.View theView;

    public Controller(View.View theView, Model.Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addSubmitListener(new SubmitListener());
    }

    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = "";
            String familyName = "";
            int age = 0;
            try {
                name = theView.getName();
                familyName = theView.getFamilyName();
                age = theView.getAge();
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("Please enter valid data");
            }
            theModel.setKingName(name);
            theModel.setKingFamilyName(familyName);
            theModel.setKingAge(age);

        }
    }
}

