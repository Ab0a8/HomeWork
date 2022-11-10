import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number:");
        n= input.nextInt();
        System.out.println("The Square= "+n*n);
        System.out.println("The cube= "+n*n*n);
        System.out.println("To the power of 2= "+ Math.pow(n,2));
    }
}
