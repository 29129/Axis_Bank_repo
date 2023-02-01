package bankApp;
import java.util.Scanner;
public class BankMain 
{

public static void main(String[] args)
{

	BankOperation bo=new BankOperation();
     Scanner sc1 = new Scanner(System.in);
    while(true)
    {
    	System.out.println("1\t Create account");
    	System.out.println("2\t Display Account Info");
    	System.out.println("3\t Get Balance");
    	System.out.println("4\t Deposite");
    	System.out.println("5\t Withdrawn");
    	System.out.println("6\t MiniStatement");
    	System.out.println("7\t Exit");
    	
    	System.out.println("Please enter your choice:");
    	
    	int choice=sc1.nextInt();
        
    	switch (choice)
    	{
    		case 1: System.out.println("Create Account");
    				bo.CreateAccount();
    				break;
    				
    		case 2: System.out.println("Display Account Info");
    				bo.ShowAccountInfo();
                	break;
                	
    		case 3: System.out.println("Get Account Balance");
    				bo.GetBalance();
    				break;
    				
    				
    		case 4: System.out.println("Amount to be Deposite");
    				bo.Deposite();
    				break;
    				
    		case 5: System.out.println("Enter the amount to be withdraw");
       				bo.Withdraw();
    				break;
    				
    		case 7: System.out.println("Exit");
       				System.exit(0);
    		
    				break;
        default: System.out.println("Invalid choice");
    		}	
    	}
	}

}


	
