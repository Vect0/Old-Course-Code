/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmfun;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dallas
 */
public class greet extends Account 
{

    /**
     *
     * @throws ClassNotFoundException
     * @throws IOException
     */
    @Override
    public void greeter() throws ClassNotFoundException, IOException 
    {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        
        //acc.ATMAccount[0] = new ATMAccounts();
        //acc.ATMAccount[1] = new ATMAccounts();
        //acc.ATMAccount[2] = new ATMAccounts();
//       acc.serread.Read(acc.ATMAccount);
        
        acc.ATMAccount = acc.serread.Read();
        do
            {
            
            System.out.println("Which account? 1(savings), 2(checking) or 3(checking)?");        
            System.out.println("Enter 4 to exit.");
            System.out.print("Enter choice: ");
            acc.i = sc.nextInt();
            if (acc.i == 4)
            {
                System.out.println("Have a nice day!");
                acc.serwrite.Write(acc.ATMAccount);
                System.exit(0);
            } else 
            {
                acc.i--;
                acc.menu();
            }         
            } while(acc.i != 4); 
    }
    }
    
    

