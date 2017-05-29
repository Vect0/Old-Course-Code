package atmfun;

import java.io.*;
public class Write 
{
	public void Write(ATMAccounts[] ATMAccount)
        {
		try
		{
                    try (FileOutputStream fos = new FileOutputStream("file.ser")) 
                    {
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(ATMAccount);
                        oos.flush();
                        fos.close();
                    }
        	
                    }
        	catch (IOException e)
		{
        		System.err.println(e);
        	}
	}
}
