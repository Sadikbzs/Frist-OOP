import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class guipracctice {
    private ArrayList<String> s=new ArrayList();
    public guipracctice(){
        JFrame frame=new JFrame("Student List Manager");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button1=new JButton("Add Student");
        button1.setBackground(Color.RED);
        button1.setForeground(Color.GREEN);
        button1.setSize(new Dimension(100,30));
        JButton button2=new JButton("Remove Student");
        button2.setBackground(Color.RED);
        button2.setForeground(Color.GREEN);
        button2.setSize(new Dimension(100,30));

        JButton button3=new JButton("Update Student");
        button3.setBackground(Color.RED);
        button3.setForeground(Color.GREEN);
        button3.setSize(new Dimension(100,30));
        JButton button4=new JButton("Exit");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setVisible(true);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name=JOptionPane.showInputDialog("Student Name:");
                if(name==null||name==""){
                    JOptionPane.showMessageDialog(null,"Please enter Student Name");

                }else {
                    s.add(name);

                }

            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name=JOptionPane.showInputDialog("Remove Student:");

            }
        })

    }

}