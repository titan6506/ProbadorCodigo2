package source;

import javax.swing.*;

public class SundayMain extends JFrame {

    public static void main(String[] args) {
        JFrame sunFrame = new SundayFrame("Sunday Today");
        sunFrame.setVisible(true);
        sunFrame.setSize(830,170);
        sunFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
