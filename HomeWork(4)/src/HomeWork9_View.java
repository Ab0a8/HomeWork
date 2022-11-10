import javax.swing.*;

public class HomeWork9_View {
    public static void main(String[] args) {
        JFrame frame=new JFrame("light");
        frame.setSize(500,500);
        HomeWork9_Drawe Draw= new HomeWork9_Drawe();
        frame.add(Draw);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
