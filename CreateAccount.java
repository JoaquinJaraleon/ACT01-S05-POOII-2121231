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

public class CreateAccount extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;

    public CreateAccount() {
        setTitle("PeruBank - Crear Cuenta");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("Crear Cuenta");
        titleLabel.setBounds(50, 10, 250, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24.0f));
        add(titleLabel);

        JLabel usernameLabel = new JLabel("Nombre:");
        usernameLabel.setBounds(20, 60, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(110, 60, 200, 25);
        add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 100, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(110, 100, 200, 25);
        add(emailField);
        
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 140, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(110, 140, 200, 25);
        add(passwordField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBounds(0, 220, 350, 40);

        JButton createButton = new JButton("Crear Cuenta");
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validateUsername() && validateEmail() && validatePassword()) {
                    JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, revisa los campos y asegúrate de cumplir con los requisitos.");
                }
            }
        });
        buttonPanel.add(createButton);
        add(buttonPanel);
    }

    private boolean validateUsername() {
        String username = usernameField.getText();
        return username.matches("[a-zA-Z0-9]{1,20}");
    }

    private boolean validateEmail() {
        String email = emailField.getText();
        return email.contains("@");
    }

    private boolean validatePassword() {
        String password = String.valueOf(passwordField.getPassword());
        return password.length() >= 8 && 
               password.length() <= 15 && 
               password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
    }

    public static void main(String[] args) {
        CreateAccount createAccountWindow = new CreateAccount();
        createAccountWindow.setVisible(true);
    }
}



