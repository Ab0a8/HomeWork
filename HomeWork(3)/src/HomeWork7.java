import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Paycheck HomeWork8 e= new Paycheck HomeWork8();
        String Name;
        float Salary;
        float A;
        System.out.println("employee name:");
        Name= in.next();
        System.out.println("Salary per hour");
        Salary= in.nextFloat();
        System.out.println("number of hours:");
        A=in.nextFloat();

        e.setName(Name);
        e.setSalary(Salary);
        e.setHours(A);

        System.out.println(e.calculation());
    }
}
