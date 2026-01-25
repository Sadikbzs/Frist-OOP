import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class problem1 {
    public static void main(String[] args) {

        for (int i = 0; i < ; i++) {
            
        }

        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Create labels and text fields
        JLabel lblN1 = new JLabel("N1:");
        JLabel lblN2 = new JLabel("N2:");
        JLabel lblResult = new JLabel("Result:");

        JTextField txtN1 = new JTextField();
        JTextField txtN2 = new JTextField();
        JTextField txtResult = new JTextField();
        txtResult.setEditable(false); // result field should not be editable

        // Create buttons
        JButton btnAdd = new JButton("Add");
        JButton btnSubtract = new JButton("Subtract");

        // Add button functionality (event handling)
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(txtN1.getText());
                    int n2 = Integer.parseInt(txtN2.getText());
                    int result = n1 + n2;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers!");
                }
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(txtN1.getText());
                    int n2 = Integer.parseInt(txtN2.getText());
                    int result = n1 - n2;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers!");
                }
            }
        });

        // Add components to frame
        frame.add(lblN1);
        frame.add(txtN1);
        frame.add(lblN2);
        frame.add(txtN2);
        frame.add(lblResult);
        frame.add(txtResult);
        frame.add(btnAdd);
        frame.add(btnSubtract);

        // Make frame visible
        frame.setVisible(true);
    }
}
