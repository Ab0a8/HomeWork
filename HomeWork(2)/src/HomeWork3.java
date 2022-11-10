import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float length,width,area,perimeter;
        System.out.println("length of the rectangular:");
        length= input.nextFloat();
        System.out.println(" width:");
        width= input.nextFloat();
        area=length*width;
        perimeter=4*(length+width);
        System.out.println("Area= "+area);
        System.out.println("Perimeter= "+perimeter);
    }
}
