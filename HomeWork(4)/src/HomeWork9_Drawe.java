import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class HomeWork9_Drawe extends JComponent {
    public void paint(Graphics g){
        Rectangle R=new Rectangle(100,110,100,250);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.Red);
        g2.fill(R);

        Ellipse2D.Double circle1= new Ellipse2D.Double(115,100,50,50);
        g2.setColor(Color.yellow);
        g2.fill(circle1);

        Ellipse2D.Double circle2= new Ellipse2D.Double(120,195,50,50);
        g2.setColor(Color.orange);
        g2.fill(circle2);

        Ellipse2D.Double circle3= new Ellipse2D.Double(110,245,50,50);
        g2.setColor(Color.green);
        g2.fill(circle3);

    }
}
