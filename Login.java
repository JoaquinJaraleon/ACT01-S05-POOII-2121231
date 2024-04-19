/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Joaquin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {
        setTitle("PeruBank - Inicio de Sesión");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(80, 20, 150, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        JLabel usernameLabel = new JLabel("Nombre de Usuario:");
        usernameLabel.setBounds(20, 50, 150, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(20, 80, 250, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 110, 150, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(20, 140, 250, 25);
        add(passwordField);

        JCheckBox rememberCheckBox = new JCheckBox("Recordar Contraseña");
        rememberCheckBox.setBounds(20, 170, 200, 25);
        add(rememberCheckBox);

        JButton loginButton = new JButton("Login");
        int buttonWidth = 100;
        int buttonX = (getWidth() - buttonWidth) / 2;
        loginButton.setBounds(buttonX, 200, buttonWidth, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cliente autenticado");
            }
        });
        add(loginButton);

        JLabel signUpLabel = new JLabel("<html><u>¿No tienes una cuenta? Regístrate</u></html>");
        signUpLabel.setBounds(60, 230, 200, 25);
        signUpLabel.setForeground(Color.BLUE);
        signUpLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signUpLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CreateAccount createAccountWindow = new CreateAccount();
                createAccountWindow.setVisible(true);
                dispose();
            }
        });
        add(signUpLabel);
    }

    public static void main(String[] args) {
        Login loginWindow = new Login();
        loginWindow.setVisible(true);
    }
}


