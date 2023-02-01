package bankApp;

import java.util.Scanner;

public class BankOperation implements RBI {

	
Account ac =new Account();
Scanner sc =new Scanner(System.in);

@Override
public void CreateAccount()
{
	System.out.println("Enter the account id");
	ac.setId(sc.next());
		
	System.out.println("Enter the first name");
	ac.setFname(sc.next());
	
	System.out.println("Enter the last name");
	ac.setLname(sc.next());
	
	System.out.println("Enter mobile no");
	ac.setMobile(sc.next());
	
	System.out.println("Enter Adhar no");
	ac.setAdhar(sc.next());
	
	System.out.println("Minimum Balance");
	ac.setMinimumBalance(sc.next());
	
}

public void ShowAccountInfo()
{
	
	System.out.println("\t ID          :" +ac.getId());
	System.out.println("\t First Name  :" +ac.getFname());
	System.out.println("\t Last Name   :" +ac.getLname());
	System.out.println("\t Mobile No   :" +ac.getMobile());
	System.out.println("\t Adhar No    :" +ac.getAdhar());
	
	
}

@Override
public void GetBalance() {
	
	
	System.out.println("\t Account Balance :" +ac.getMinimumBalance());
	
}

@Override
public void MiniStatement() {
	// TODO Auto-generated method stub
	
}

public void Withdraw() {
	
	
	int temp1=sc.nextInt();
	int TotalBalance = Integer.parseInt(ac.getMinimumBalance())-temp1;
	ac.setMinimumBalance(Integer.toString(TotalBalance));
	System.out.println("Total Balance is : "+ac.getMinimumBalance());

	
	
}


@Override
public void Deposite()
{

	System.out.println("Enetr how much amount you want to deposite");
	
	int temp = sc.nextInt();
	int TotalBalance = Integer.parseInt(ac.getMinimumBalance()) + temp; // converting string to integer 
	ac.setMinimumBalance(Integer.toString(TotalBalance));  // converting integer to string 
	System.out.println("Total Balance is : " +ac.getMinimumBalance());
	
	
}






}
	