package Assignments;

public class BankAccount 
{
private int acc_no;
private int acc_balance;

public void settermethod(int acc_no,int acc_balance)
{
	this.acc_no=acc_no;
	this.acc_balance=acc_balance;

}

public void gettermethod()
{
	System.out.println("Account Number : "+acc_no);
	System.out.println("Account Balance : "+acc_balance);
	
}	
public void deposit()
{
	int deposit_amnt=3000;
	int total_balance=deposit_amnt+acc_balance;
	System.out.println("Deposit amount : "+deposit_amnt);
	System.out.println("Total balance : "+ total_balance);
}

}

