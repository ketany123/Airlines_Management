

package airlinesmanagement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton submit, reset, close;
    JTextField tfusername;
    JPasswordField tfpassword;

    public Login() {
        // Frame settings
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(600, 300);
        setLayout(new BorderLayout());

        // Panel for form elements
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        formPanel.setBackground(Color.WHITE);
        add(formPanel, BorderLayout.CENTER);

        // Title
        JLabel heading = new JLabel("AIRLINE MANAGEMENT SYSTEM");
        heading.setBounds(50, 20, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 16));
        heading.setForeground(Color.BLUE);
        formPanel.add(heading);

        // Username Label
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20, 70, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        formPanel.add(lblusername);

        // Username TextField
        tfusername = new JTextField();
        tfusername.setBounds(130, 70, 200, 25);
        tfusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        formPanel.add(tfusername);

        // Password Label
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20, 110, 100, 20);
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        formPanel.add(lblpassword);

        // Password TextField
        tfpassword = new JPasswordField();
        tfpassword.setBounds(130, 110, 200, 25);
        tfpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        formPanel.add(tfpassword);

        // Reset Button
        reset = new JButton("Reset");
        reset.setBounds(40, 160, 100, 30);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.setFont(new Font("Tahoma", Font.BOLD, 14));
        reset.addActionListener(this);
        formPanel.add(reset);
        

        // Submit Button
        submit = new JButton("Submit");
        submit.setBounds(150, 160, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma", Font.BOLD, 14));
        submit.addActionListener(this);
        formPanel.add(submit);

        // Close Button
        close = new JButton("Close");
        close.setBounds(260, 160, 100, 30);
        close.setBackground(Color.BLACK);
        close.setForeground(Color.WHITE);
        close.setFont(new Font("Tahoma", Font.BOLD, 14));
        close.addActionListener(this);
        formPanel.add(close);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = tfusername.getText();
            String password = String.valueOf(tfpassword.getPassword());

            try {
                Conn c = new Conn();
                String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    new Home();
                    setVisible(false);
                    System.out.print("connection created");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            tfusername.setText("");
            tfpassword.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
