package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddTask extends JFrame {
    private JTextField nameField;
    private JTextArea descArea;
    private JTextField dateField;
    private JButton submitButton;
    private JButton backButton;

    public AddTask() {
        super("Add Task");

        // Create form components
        nameField = new JTextField(20);
        descArea = new JTextArea(5, 20);
        dateField = new JTextField(20);
        submitButton = new JButton("Submit");
        backButton = new JButton("Back");

        // Create form layout
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        formPanel.add(new JLabel("Task Name:"), c);
        c.gridx = 1;
        formPanel.add(nameField, c);
        c.gridx = 0;
        c.gridy = 1;
        formPanel.add(new JLabel("Description:"), c);
        c.gridx = 1;
        formPanel.add(new JScrollPane(descArea), c);
        c.gridx = 0;
        c.gridy = 2;
        formPanel.add(new JLabel("Due Date:"), c);
        c.gridx = 1;
        formPanel.add(dateField, c);

        // Create submit button action listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String desc = descArea.getText();
                String date = dateField.getText();
                // Add code to handle submitting the task
            }
        });

        // Create back button action listener
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(backButton);

        // Add form and button panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
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
        new AddTask();
    }
}
