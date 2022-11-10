import javax.swing.*;

public class HomeWork7_View {
    public static void main(String[] args) {
        HomeWork7_Drawe Draw=new HomeWork7_Drawe();
        JFrame frame=new JFrame("Drawing");
        frame.setSize(500,500);
        frame.add(Draw);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
