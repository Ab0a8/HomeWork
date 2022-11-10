import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int n1,temp,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1= input.nextInt();
        n2= input.nextInt();
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("number after Swapping: \n"+n1+"\n"+n2);
    }
}
