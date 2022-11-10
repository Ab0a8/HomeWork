import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class HomeWork8_Drawe extends JComponent {
    public void paint(Graphics g){
        Rectangle R=new Rectangle(100,150,200,100);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.red);
        g2.fill(R);

        g2.setColor(Color.Orang);
        g2.drawString("Hello",150,200);
    }
}
