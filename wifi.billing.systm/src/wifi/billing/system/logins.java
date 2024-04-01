package wifi.billing.system;

import javax.swing.*;
import java.awt.*;

public class logins extends JFrame{

    JTextField userText, userPassword;

    JButton loginButton, signupButton;

    logins(){
        super("Login");
        getContentPane().setBackground(Color.white);

        JLabel username = new JLabel("Username:");
        username.setBounds(300,60,100,20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("Password:");
        password.setBounds(300,100,100,20);
        add(password);

        userPassword = new JTextField();
        userPassword.setBounds(400,100,150,20);
        add(userPassword);

        loginButton = new JButton("Login");
        loginButton.setBounds(330,140,100,20);
        add(loginButton);

        ImageIcon DisplayProfile = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profile = DisplayProfile.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofile = new ImageIcon(profile);
        JLabel profileLable = new JLabel(fprofile);
        profileLable.setBounds(5,5,250,250);
        add(profileLable);

        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new logins();
    }
}
