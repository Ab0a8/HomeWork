import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter an number:");
        n=input.nextInt();
        if(n==0)
            System.out.println(0);
        else if (n>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

    }
}
