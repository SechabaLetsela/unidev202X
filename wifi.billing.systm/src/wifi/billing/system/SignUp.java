package wifi.billing.system;

import javax.swing.*;

public class SignUp extends JFrame {

    SignUp(){

        super("Signup");

        JLabel xname = new JLabel("Name:");
        xname.setBounds(30,50,125,20);
        add(xname);

        JLabel xsurname = new JLabel("Surname:");
        xsurname.setBounds(30,80,125,20);
        add(xsurname);

        JLabel createUsername = new JLabel("Create Username:");
        createUsername.setBounds(30,110,125,20);
        add(createUsername);

        JLabel createPassword = new JLabel("Create Password:");
        createPassword.setBounds(30,140,125,20);
        add(createPassword);

        


        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {

        new SignUp();

    }
}
