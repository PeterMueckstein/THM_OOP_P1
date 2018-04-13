import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PriintTest {
    public static void main(String[]args){
        JFrame f = new JFrame("GUI Test");
        JPanel p = new JPanel();
        JLabel j = new JLabel("Hi");
        p.setBackground(Color.black);
        f.add(p);
        f.add(j);

        f.setSize(800,600);
        f.setVisible(true);
    }
}
