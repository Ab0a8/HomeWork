import javax.swing.*;

public class HomeWork8_View {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Draw");
        frame.setSize(250,250);
        HomeWork8_Drawe Name= new HomeWork8_Drawe();
        frame.add(Name);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
