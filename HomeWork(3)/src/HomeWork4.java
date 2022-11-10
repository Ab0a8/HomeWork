import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=in.nextFloat();
        b= in.nextFloat();
        c= in.nextFloat();

        if(a==c & c==b)
            System.out.println("same");
        else if (a!=a & a!=b & c!=c)
            System.out.println("different");
        else
            System.out.println("Neither");

    }
}
