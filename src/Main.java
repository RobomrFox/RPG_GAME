import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ImageIcon icon = new ImageIcon("./assets/1_Icon.png");
        frame.setIconImage(icon.getImage()); //sets Icon for the program

        //creating and managing main frame
        frame.setTitle("RPG Game");
        frame.setSize(600, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); //sets the screen in the center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.getContentPane().setBackground(new Color(0, 0, 0));

        frame.setVisible(true);
    }
}