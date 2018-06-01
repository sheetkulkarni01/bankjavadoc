package bankjavadoc;

import java.util.*;

/**
 * User can select desired banking operation to create,deposit,withdraw,transfer his account balance
 * @author Sheetal
 */
public class Bankjavadoc 
{    
    /**
     * Main method which uses switch case to ask user to select the desired operation
     * @param args 
     */
    public static void main(String[] args) 
    {
        int c;
        double bal[];
        double accno[];
        String address[];
        String name[];
        
        name=new String[10000];
        bal=new double[10000];
        accno=new double[10000];
        address=new String[10000];
        
        bank z=new bank();

        Scanner s=new Scanner(System.in);
        
        int i;
        for(;;)
         {        
         
         System.out.println("1.Create new account 2.Open existing account 3.Total money in the bank 4.Richest person in the bank 5.exit");
         System.out.println("Enter your choice: ");
         c=s.nextInt();
        
        switch(c)
        {
            case 1: z.create();  
                     break;
                     
            case 2: z.exac(); 
                    break;
                    
            case 3: z.totalbal();                
                    break;
                    
            case 4: z.richest();
                        
                     break; 
            case 5:return;
        
    }
         }
    }
}
    

