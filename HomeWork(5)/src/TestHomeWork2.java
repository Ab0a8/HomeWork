public class TestHomeWork2 {
    public static void main(String[] args) {
        HomeWork2 account=new HomeWork2(1000);
        account.deposit(700);
        account.withdraw(2000);
        account.addintrest(100);
        account.mystery(account,300);
        System.out.println(account.getBalance());
    }
}
