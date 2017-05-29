
package atmfun;

import atmfun.ATMAccounts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.NumberFormat;


public class Account {
    
    double startingBalance = 100;
    int firstdate = 0;
    int seconddate = 0;
    int datediff = 0;
    Calendar cal1 = new GregorianCalendar();
    Calendar cal2 = new GregorianCalendar();
    boolean dateflag = false;
    double rate = 0;
    double ratetime = 0;
    ATMAccounts[] ATMAccount = new ATMAccounts[3];
    int i = 0;
    Read serread = new Read();
    Write serwrite = new Write();
    
    
    public void greeter() throws ClassNotFoundException, IOException{};
          
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        Account b = new greet();
        b.greeter();
    }
    
   
    public void menu() throws IOException
    {
        int input = 0;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter 1 for deposit, 2 for withdraw, 3 for check balance, 4 exit");
        System.out.print("Enter choice: ");
        try
        {
            input = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("You made a mistake, try again");
        }
        
        if (input == 1)
        {
            deposit();
        }
        if(input == 2)
        {
            withdraw();
        }
        if(input == 3)
        {
            checkBalance();
        }
        if (input == 4);
        {
            System.out.println("Return to account menu.");    
        }
        
        }while (input != 4);
    }
    
    public void deposit() throws IOException
    {    
      getDate1();     
      System.out.print("Deposit Amount: ");
      Scanner AC = new Scanner(System.in);
      double dep = AC.nextDouble();
      ATMAccount[i].balance = ATMAccount[i].balance + dep;
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      System.out.println("New Balance: " + nf.format(ATMAccount[i].balance + ratetime));
      
    }
    
    public void withdraw()
    {
      System.out.print("Withdraw: ");
      Scanner WD = new Scanner(System.in);
      double with = WD.nextDouble();
      ATMAccount[i].balance = ATMAccount[i].balance - with;
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      System.out.print("New Balance: " + nf.format(ATMAccount[i].balance));
      System.out.println("");
      
    }
    
    public void checkBalance() throws IOException
    {
     getDate2();
       if(i==0){
         System.out.println("Account 1");
           getInterestSaving();
         
     } else if (i==1){
         System.out.println("Account 2");
         getInterestChecking();
     } else if (i==2){
         System.out.println("Account 3");   //.27
         getInterestChecking();
     }
//       getInterest();
     NumberFormat nf = NumberFormat.getCurrencyInstance();
//     System.out.println(ratetime);
     System.out.print("Amount: " + nf.format(ATMAccount[i].balance + ratetime));
     System.out.println("");
     
     
    }
    
//    public void getInterest()
//    {
//        int datediff = seconddate - firstdate;
//        rate = .25/365;
//        double ratetime = Math.pow(1+rate,datediff);
//        ATMAccount[i].balance = ATMAccount[i].balance * ratetime;
////        if(seconddate>firstdate)
////        {
//        firstdate = seconddate;
////        } else
////        {
////            System.out.println("No date backtracing allowed");
////            System.exit(1);
////        }
//        System.out.println(ratetime);
//    }
    
    public void getInterestChecking() //checking has a Y% interest rate
    {
        int datediff = seconddate - firstdate;
        rate = .08/365;
        double ratetime = Math.pow(1+rate,datediff);
//        System.out.println(ratetime);
        System.out.println(ATMAccount[i].balance = ATMAccount[i].balance * ratetime);
//        if(seconddate>firstdate)
//        {
        firstdate = seconddate;
//        } else
//        {
//            System.out.println("No date backtracing allowed");
//            System.exit(1);
//        }
//        System.out.println(ratetime);
    }
//    
    public void getInterestSaving() //savings has a X% interest rate
    {
        int datediff = seconddate - firstdate;
        rate = .99/365;
        double ratetime = Math.pow(1+rate,datediff);
        ATMAccount[i].balance = ATMAccount[i].balance * ratetime;
//        if(seconddate>firstdate)
//        {
        firstdate = seconddate;
//        } else
//        {
//            System.out.println("No date backtracing allowed");
//            System.exit(1);
//        }
//        System.out.println(ratetime);
    }
    
    public void getDate1() throws IOException 
    {
        
        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
      //Date date= new Date();
        Date date = formatter.parse(inputText, pos);
        
        cal1.setTime(date);

        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
    }

    public void getDate2() throws IOException
    {
        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date date = formatter.parse(inputText, pos);
        
        cal2.setTime(date);
        seconddate = cal2.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
        
//        if(firstdate>seconddate)
//        {
//            System.out.println("Wrong.");
//            getDate2();
//        }
    }

//    private void Read() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    private void Write() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}

