//package View;
//
//import java.awt.*;
//import javax.swing.*;
//
//public class MainDashboard extends JFrame {
//    private JPanel taskPanel, profilePanel;
//    private JButton addTaskButton;
//    private JLabel usernameLabel, avatarLabel;
//
//    public MainDashboard() {
//        setTitle("Dashboard");
//        setSize(800, 600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        // Create the task panel
//        taskPanel = new JPanel();
//        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
//
//        JLabel taskTitleLabel = new JLabel("Tasks");
//        taskTitleLabel.setFont(new Font("Arial", Font.BOLD, 18));
//        taskPanel.add(taskTitleLabel);
//
//        // Create the add task button
//        addTaskButton = new JButton("Add Task");
//        addTaskButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        taskPanel.add(addTaskButton);
//
//        // Create the profile panel
//        profilePanel = new JPanel();
//        profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.X_AXIS));
//
//        // Create the user profile
//        usernameLabel = new JLabel("John Doe");
//        avatarLabel = new JLabel(new ImageIcon("avatar.png"));
//
//        profilePanel.add(Box.createHorizontalGlue());
//        profilePanel.add(usernameLabel);
//        profilePanel.add(avatarLabel);
//
//        // Add the task panel and profile panel to the dashboard
//        add(taskPanel, BorderLayout.CENTER);
//        add(profilePanel, BorderLayout.SOUTH);
//    }
//
//    public static void main(String[] args) {
//        MainDashboard mainDashboard = new MainDashboard();
//        mainDashboard.setVisible(true);
//    }
//}
