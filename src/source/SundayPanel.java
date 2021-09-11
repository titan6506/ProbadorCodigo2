package source;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class SundayPanel extends JPanel implements MouseListener, MouseMotionListener {
    private Rectangle rect;
    private JPanel p = new JPanel();
    private Graphics graphics;
    Point start; // puntos en orden de tipo (x, y), donde arranca la posicion del mouse
    Point end;//donde finaliza posicion del mouse
    String[] values = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public SundayPanel()
    {
        setSize(1000,170);
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
       Font font = new Font("Times New Roman", Font.PLAIN, 72);
       g.setFont(font);
       for(int i = 0; i < 6; i++ ){
           int step = 130 * i + 10;
           if((start != null) && ((int)(end.getX() / 130) == i)) { // cast... transformacion a entero
               g.setColor(Color.orange);
           }else{
               g.setColor(Color.gray);
           }
           g.fill3DRect(step, 10, 130, 100, true);
           g.setColor(Color.black);
           g.drawString(values[i], 50 * step, 80);
       }
    }

    @Override
    public void mouseClicked(MouseEvent e){
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mouseDragged(MouseEvent e){
    }
    @Override
    public void mouseMoved(MouseEvent e){
        requestFocusInWindow();
        start = e.getPoint();
        end = e.getPoint();
        e.getComponent().repaint();
    }

 //   @Override
 //   public void focusGanied(FocusEvent e){
 //       System.out.println(e.getComponent().getName());
        //e.getComponent().repaint();
 //   }
 //   @Override
 //   public void focusLost(FocusEvent e){
        //e.getComponent().repaint();
  //  }
}
