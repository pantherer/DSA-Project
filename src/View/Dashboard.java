//Amul Bashyal
//        Assume you've been recruited to create an application that aids in the batch processing of database
//        operations. You must design a graphical user interface (GUI) application that allows you to add different
//        jobs defined in the form of SQL procedures or functions and execute them in sequence. This task scheduling
//        allows for the addition and execution of dependent tasks, parent tasks must be completed before child tasks.
//        While developing this a workflow or task scheduling application, you can build application taking account of
//        particular scenario of your choice for example implementation of batch processing or job scheduling required
//        for financial and invoice calculation for sample consumers. Application must allow users to create their own
//        profile.
//        •	Application allow user to add tasks or jobs
//        •	Application should allow user to define control flow of the jobs or create pipeline of the jobs
//        •	Application should allow users to remove tasks
//        •	Application should allow uses to resume tasks at position after sudden failure
//        •	Parent tasks needed to be executed before executing child tasks.

package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    // Constructor
    public Dashboard() {
        super("Task Scheduler Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add a menu bar to the dashboard
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Logout");
        JMenuItem exitMenuItem = new JMenuItem("you sure about exit?");
        exitMenuItem.addActionListener((event) -> System.exit(0));
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        JButton profileButton = new JButton("Profile");
        menuBar.add(profileButton, BorderLayout.EAST);
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserProfile profile = new UserProfile();
                profile.setVisible(true);
            }
        });

        JButton taskButton = new JButton("AddTask");
        menuBar.add(taskButton, BorderLayout.CENTER);
        taskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTask task = new AddTask();
                task.setVisible(true);
            }
        });



        // Add a main panel to the dashboard
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Add a task list panel to the main panel
        JPanel taskListPanel = new JPanel(new BorderLayout());
        taskListPanel.setBorder(BorderFactory.createTitledBorder("Task List"));
        JList<String> taskList = new JList<>(new String[] {"Task 1", "Task 2", "Task 3"});
        JScrollPane taskListScrollPane = new JScrollPane(taskList);
        taskListPanel.add(taskListScrollPane, BorderLayout.CENTER);
        mainPanel.add(taskListPanel, BorderLayout.CENTER);

        // Add a control panel to the main panel
        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.setBorder(BorderFactory.createTitledBorder("Control"));
        JButton executeButton = new JButton("Execute");
        JButton pauseButton = new JButton("Pause");
        JButton resumeButton = new JButton("Resume");
        controlPanel.add(executeButton, BorderLayout.WEST);
        controlPanel.add(pauseButton, BorderLayout.CENTER);
        controlPanel.add(resumeButton, BorderLayout.EAST);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        // Add the main panel to the dashboard
        add(mainPanel);
    }

    // Main method
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
}

