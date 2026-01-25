import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentListGUI {
    private ArrayList<String> students = new ArrayList<>();

    public StudentListGUI() {
        JFrame frame = new JFrame("Student List Manager");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Student Name:");
        JTextField nameField = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton showButton = new JButton("Show All");
        JButton clearButton = new JButton("Clear");
        JTextArea displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);

        frame.add(label);
        frame.add(nameField);
        frame.add(addButton);
        frame.add(showButton);
        frame.add(clearButton);
        frame.add(new JScrollPane(displayArea));

        // Add Button
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                students.add(name);
                nameField.setText("");
                JOptionPane.showMessageDialog(frame, "Student added successfully!");
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter a name.");
            }
        });

        // Show Button
        showButton.addActionListener(e -> {
            displayArea.setText("");
            for (String s : students) {
                displayArea.append(s + "\n");
            }
        });

        // Clear Button
        clearButton.addActionListener(e -> {
            students.clear();
            displayArea.setText("");
            JOptionPane.showMessageDialog(frame, "List cleared!");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentListGUI();
    }
}
