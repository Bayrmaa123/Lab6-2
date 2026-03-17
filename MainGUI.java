import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI {

    public static void main(String[] args) {
        new LoginFrame();
    }
}

// LOGIN SCREEN
class LoginFrame extends JFrame {
    JTextField username;
    JPasswordField password;

    LoginFrame() {
        setTitle("Login Screen");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        JButton loginBtn = new JButton("Login");
        add(loginBtn);

        JButton cancelBtn = new JButton("Cancel");
        add(cancelBtn);

        // Button event
        loginBtn.addActionListener(e -> {
            System.out.println("Login button daragdlaa");
            new HomeFrame();
            dispose();
        });

        cancelBtn.addActionListener(e -> {
            System.out.println("Cancel button daragdlaa");
        });

        setVisible(true);
    }
}

// HOME SCREEN
class HomeFrame extends JFrame {

    HomeFrame() {
        setTitle("Home Screen");
        setSize(300, 200);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Welcome!");
        add(label);

        JButton profileBtn = new JButton("Profile");
        JButton logoutBtn = new JButton("Logout");

        add(profileBtn);
        add(logoutBtn);

        profileBtn.addActionListener(e -> {
            System.out.println("Profile button daragdlaa");
        });

        logoutBtn.addActionListener(e -> {
            System.out.println("Logout button daragdlaa");
        });

        setVisible(true);
    }
}