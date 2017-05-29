package atmfun;

import java.io.*;
public class Read
{
    public ATMAccounts[] Read() throws ClassNotFoundException    
    {
        
        ATMAccounts[] account = {new ATMAccounts(), new ATMAccounts(), new ATMAccounts()};
	try
            {
		File f = new File("file.ser");
                if (f.canExecute()){
                f.exists();
                } else {                            
                f.createNewFile();
                }
        
//                    try (FileInputStream fis = new FileInputStream(f)) 
            try (FileInputStream fis = new FileInputStream(f))
            {
                ObjectInputStream ois = new ObjectInputStream(fis);    
                account = (ATMAccounts[])ois.readObject();

            }
            catch (IOException e){}      
        }
        catch (IOException e){}
        
        return account;
    }
}

    

