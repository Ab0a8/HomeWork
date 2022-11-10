public class HomeWork4 {
    public static void main(String[] args) {
        int IntialBalance=300;
        double YearIntrest= 0.5;
        int intrest=0;
        double SalaryAfter3Years=3000;
        int year=3;
        do{
           intrest+=IntialBalance*YearIntrest;
           year++;
        }
        while(year<=3);
        SalaryAfter3Years=IntialBalance+intrest;
        System.out.println(SalaryAfter3Years);
    }
}
