import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter three numbers");
        a=in.nextFloat();
        b= in.nextFloat();
        c= in.nextFloat();

        if(a<b & b<c)
            System.out.println("Increasing");
        else if (a>b & b>c)
            System.out.println("Decreasing");
        else
            System.out.println("Neither");
    }
}
