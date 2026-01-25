import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public  class GUI2 {
        public static void main(String[] args) {
            // Create the frame
            JFrame frame = new JFrame("Login Page");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 500); // Mobile-like size
            frame.setLocationRelativeTo(null); // Center on screen

            // Main panel
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBorder(BorderFactory.createEmptyBorder(40, 20, 40, 20));

            // Title label

            JLabel titleLabel = new JLabel("Welcome Back");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            panel.add(titleLabel);
            panel.add(Box.createRigidArea(new Dimension(0, 30)));

            // Username field
            JLabel userLabel = new JLabel("Username:");
            userLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            JTextField userText = new JTextField("Enter your Name");
            userText.setAlignmentX(Component.LEFT_ALIGNMENT);
            userText.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));





            panel.add(userLabel);
            panel.add(userText);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));

            // Password field
            JLabel passLabel = new JLabel("Password:");
            JPasswordField passText = new JPasswordField(15);
            passLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            passText.setAlignmentX(Component.LEFT_ALIGNMENT);
            passText.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));





            panel.add(passLabel);
            panel.add(passText);
            panel.add(Box.createRigidArea(new Dimension(0, 30)));

            // Login button
            JButton loginButton = new JButton("Login");
            //loginButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
            loginButton.setPreferredSize(new Dimension(100, 40));

            // Add action listener
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String username = userText.getText();
                    String password = new String(passText.getPassword()); // Get password safely

                    if(username.equals("admin") && password.equals("1234")) {
                        JOptionPane.showMessageDialog(frame, "Hello Admin!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid Username or Password",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            panel.add(loginButton);

            // Add to frame
            frame.add(panel);
            frame.setVisible(true);
        }
    }





