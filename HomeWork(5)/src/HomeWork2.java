public class HomeWork2 {
   private double Balance;

   public HomeWork2(){
       Balance=0;
   }
   public HomeWork2(double initial){
       Balance=initial;
   }

   public void mystery(HomeWork2 that,double amount){
       this.Balance-=amount;
       that.Balance+=amount;

   }
   public void deposit(double amount){
       Balance+=amount;
   }

   public void withdraw(double amount){
       if(amount<=Balance)
           Balance-=amount;
   }

   public void addintrest(double rate){
       Balance+=(rate/100)*Balance;
   }

   public double getbalance(){
       return Balance;
   }
}
