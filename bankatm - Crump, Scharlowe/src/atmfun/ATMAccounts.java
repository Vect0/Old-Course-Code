package atmfun;

public class ATMAccounts implements java.io.Serializable
{
   double balance = 100;
   
   public double getBalance(){
       return balance;
   }
   
   public void setBalance(double newBalance){
       balance = newBalance;
   }
}
