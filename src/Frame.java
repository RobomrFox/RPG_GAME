import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Frame extends JFrame {
    public Frame() {

        ImageIcon icon = new ImageIcon("./assets/1_Icon.png");
        this.setIconImage(icon.getImage()); //sets Icon for the program

        JPanel txtPanel = new JPanel();
        txtPanel.setBackground(new Color(6, 6, 35, 255));
        txtPanel.setBounds(0, 80, 550, 160);
        txtPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));

        //creating and managing main frame
        this.setTitle("RPG Game");
        this.setSize(600, 250);
        this.setResizable(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null); //sets the screen in the center
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(txtPanel);
//        this.getContentPane().setBackground(new Color(6, 6, 35, 255)); remove it!

//        this.pack();
    }
}
