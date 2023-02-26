package View;

import java.awt.*;
import javax.swing.*;

public class UserProfile extends JFrame {
    private JLabel fullNameLabel, addressLabel, phoneNumberLabel, emailLabel, passwordLabel;
    private JTextField fullNameField, addressField, phoneNumberField, emailField, passwordField;

    public UserProfile() {
        setTitle("User Profile");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        fullNameLabel = new JLabel("Full Name:");
        add(fullNameLabel);

        fullNameField = new JTextField();
        add(fullNameField);

        addressLabel = new JLabel("Address:");
        add(addressLabel);

        addressField = new JTextField();
        add(addressField);

        phoneNumberLabel = new JLabel("Phone Number:");
        add(phoneNumberLabel);

        phoneNumberField = new JTextField();
        add(phoneNumberField);

        emailLabel = new JLabel("Email:");
        add(emailLabel);

        emailField = new JTextField();
        add(emailField);

        passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        passwordField = new JTextField();
        add(passwordField);

        JButton back = new JButton("Back");
        back.addActionListener((event) -> {

            Window window = SwingUtilities.getWindowAncestor(back);
            window.dispose();
        });
        add(back);
    }

    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile();
        userProfile.setVisible(true);
    }
}

