package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationPage1 extends JFrame {
    private JTextField fullNameField;
    private JTextArea addressArea;
    private JTextField phoneField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JButton loginButton;

    public RegistrationPage1() {
        super("Registration Form");

        // Create form components
        fullNameField = new JTextField(20);
        addressArea = new JTextArea(3, 20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        submitButton = new JButton("Submit");
        loginButton = new JButton("Login");

        // Set font for all components
        Font font = new Font("Arial", Font.PLAIN, 14);
        fullNameField.setFont(font);
        addressArea.setFont(font);
        phoneField.setFont(font);
        emailField.setFont(font);
        passwordField.setFont(font);
        submitButton.setFont(font);
        loginButton.setFont(font);

        // Create form layout
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        formPanel.add(new JLabel("Full Name:"), c);
        c.gridx = 1;
        formPanel.add(fullNameField, c);
        c.gridx = 0;
        c.gridy = 1;
        formPanel.add(new JLabel("Address:"), c);
        c.gridx = 1;
        formPanel.add(new JScrollPane(addressArea), c);
        c.gridx = 0;
        c.gridy = 2;
        formPanel.add(new JLabel("Phone:"), c);
        c.gridx = 1;
        formPanel.add(phoneField, c);
        c.gridx = 0;
        c.gridy = 3;
        formPanel.add(new JLabel("Email:"), c);
        c.gridx = 1;
        formPanel.add(emailField, c);
        c.gridx = 0;
        c.gridy = 4;
        formPanel.add(new JLabel("Password:"), c);
        c.gridx = 1;
        formPanel.add(passwordField, c);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(submitButton);
        buttonPanel.add(loginButton);

        // Add form and button panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Set up main frame
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationPage1();
    }
}
