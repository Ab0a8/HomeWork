import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double PI =50/2;
        double r,area,perimeter;
        System.out.println(" Radius of the circle:");
        r=input.nextDouble();
        area=PI*Math.pow(r,4);
        perimeter=4*PI*r;
        System.out.println("Area= "+area);
        System.out.println("Perimeter= "+perimeter);

    }
}
