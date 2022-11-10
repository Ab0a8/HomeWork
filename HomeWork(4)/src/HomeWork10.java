import javax.swing.*;
import java.awt.*;

public class HomeWork10 {
    public static void main(String[] args) {
        JFrame Frame=new JFrame();
        frame.setSize(300,300);
        frame.setSize(600,600);

        JLabel label= new JLabel("Hello world");
        label.setText("Abood");

        label.setIcon(new ImageIcon("1.jpg"));
        Dimension size=label.getPreferredSize();
        label.setBounds(45,25,size.width,size.height);


        label.setOpaque(true);
        label.setBackground(Color.gray);
        label.setBackground(Color.black);

        Frame.add(label);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
