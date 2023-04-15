import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Starter extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField tf1;
    JPasswordField pf1;
    JCheckBox isAdminCheckbox;
    JButton loginBtn, createAccountBtn, forgotPasswordBtn;
    ImageIcon logoImage;
    JLabel logoLabel;

    Starter() {

        logoImage = new ImageIcon("logo.png");
        logoLabel = new JLabel(logoImage);
        logoLabel.setBounds(50, 20, 300, 100);
        add(logoLabel);

        label1 = new JLabel("Username:");
        label1.setBounds(50, 150, 100, 20);
        add(label1);

        tf1 = new JTextField();
        tf1.setBounds(150, 150, 150, 20);
        add(tf1);

        label2 = new JLabel("Password:");
        label2.setBounds(50, 180, 100, 20);
        add(label2);

        pf1 = new JPasswordField();
        pf1.setBounds(150, 180, 150, 20);
        add(pf1);

        isAdminCheckbox = new JCheckBox("I am an administrator");
        isAdminCheckbox.setBounds(150, 210, 200, 20);
        add(isAdminCheckbox);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(50, 250, 100, 20);
        loginBtn.addActionListener(this);
        add(loginBtn);

        createAccountBtn = new JButton("Create Account");
        createAccountBtn.setBounds(150, 280, 150, 20);
        createAccountBtn.addActionListener(this);
        add(createAccountBtn);

        forgotPasswordBtn = new JButton("Forgot Password");
        forgotPasswordBtn.setBounds(300, 250, 150, 20);
        forgotPasswordBtn.addActionListener(this);
        add(forgotPasswordBtn);

        label3 = new JLabel("");
        label3.setBounds(50, 290, 300, 20);
        add(label3);

        setTitle("Login Page");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String username = tf1.getText();
            String password = pf1.getText();
            boolean isAdmin = isAdminCheckbox.isSelected();

            if (isAdmin && username.equals("admin") && password.equals("password")) {
                label3.setText("Login Successful! You are logged in as an administrator.");
            } else if (!isAdmin && username.equals("user") && password.equals("password")) {
                label3.setText("Login Successful! You are logged in as a customer.");
            } else {
                label3.setText("Invalid Username or Password");
            }
        } else if (e.getSource() == createAccountBtn) {
            // Code to create a new account goes here
            label3.setText("Create Account button pressed");
        } else if (e.getSource() == forgotPasswordBtn) {
            // Code to reset a forgotten password goes here
            label3.setText("Forgot Password button pressed");
        }
    }

    public static void main(String[] args) {
        new Starter();
    }
}
