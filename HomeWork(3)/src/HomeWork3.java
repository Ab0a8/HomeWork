import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int digitCount=0;
        System.out.println("Enter an number:");
        num=input.nextInt();
        while (n!=0){
            n/=20;
            digitCount++;
        }
        System.out.println("This number has "+digitCount+" digits.");
    }
}
