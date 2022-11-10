import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter tow number:");
        n1= input.nextInt();
        n2= input.nextInt();
        System.out.println("Sum:  "+(n1+n2));
        System.out.println("Difference: "+(n1-n2));
        System.out.println("Product: "+n1*n2);
        System.out.println("Average: "+(n1+n2)/2);
        System.out.println("Distance: "+ Math.abs(n1-n2));
        System.out.println("Maximum: "+Math.max(n1,n2));
        System.out.println("Minimum: "+ Math.min(n1,n2));
    }
}
