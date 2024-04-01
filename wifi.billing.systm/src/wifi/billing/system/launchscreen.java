package wifi.billing.system;

import javax.swing.*;
import java.awt.*;

public class  launchscreen extends JFrame{

    launchscreen(){

        ImageIcon icon00 = new ImageIcon(ClassLoader.getSystemResource("icon/wifi/#01.jpg"));
        Image img00 = icon00.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon icon01 = new ImageIcon(img00);
        JLabel imgLabel = new JLabel(icon01);
        add(imgLabel);

        setSize( 600,400);
        setLocation(500,200);
        setVisible(true);

    /* Something he did here that I don't understand*/
        try{
            Thread.sleep(3000);
            setVisible(false);

            new logins();

        }catch(Exception e){
            e.printStackTrace();
            }

    }

    public static void main(String[] args) {
        new launchscreen();
    }
}
