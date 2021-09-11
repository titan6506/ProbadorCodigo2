package source;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class SundayFrame extends JFrame {

    private SundayPanel sunPanel;

    public SundayFrame(String title)
    {
        super(title);
        setResizable(false); // no cambiar de tamaño ventana
        sunPanel = new SundayPanel();
        //sunPanel.addMouseListener(sunPanel);
        sunPanel.addMouseMotionListener(sunPanel);
        //sunPanel.addFocusListener(sunPanel);
        add(sunPanel, BorderLayout.CENTER);
    }

}
