package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField name = new JTextField(10);
    private JTextField familyName = new JTextField(10);
    private JTextField age = new JTextField(10);
    private JButton submit = new JButton("Submit");

    private JRadioButton easy = new JRadioButton("Easy");
    private JRadioButton medium = new JRadioButton("Medium");
    private JRadioButton hard = new JRadioButton("Hard");

    private JButton yes = new JButton("Yes");
    private JButton no = new JButton("No");


    public View() {
        super("Settings");
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 200);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 4));

        ButtonGroup group = new ButtonGroup();
        group.add(easy);
        group.add(medium);
        group.add(hard);

        container.add(easy);
        container.add(medium);
        container.add(hard);

        medium.setSelected(true);

        panel.add(name);
        panel.add(familyName);
        panel.add(age);
        panel.add(submit);


        this.add(panel);
    }

    public String getName() {
        return name.getText();
    }

    public String getFamilyName() {
        return familyName.getText();
    }

    public int getAge() {
        return Integer.parseInt(age.getText());
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setFamilyName(String familyName) {
        this.familyName.setText(familyName);
    }

    public void setAge(int age) {
        this.age.setText(Integer.toString(age));
    }

    public void addSubmitListener(ActionListener listenerForSubmitButton) {
        submit.addActionListener(listenerForSubmitButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }



}
