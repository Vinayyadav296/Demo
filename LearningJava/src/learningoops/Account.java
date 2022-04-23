package learningoops;

public class Account {
int acc_no;
String name;
float amount;
void insert(int a,String b,float amt)
{
acc_no=a;
name=b;
amount=amt;
}
void deposit(float cash)
{
amount=amount+cash;
System.out.println("Amount deposited"+" "+amount );
}
void withdraw(float cash)
{
if(amount<cash)
{
System.out.println("Insufficient Balance");	
}
else
{
 amount=amount-cash;
	System.out.println("Amount Withdrawn"+" "+amount);
}
}
void checkBalance()
{
 System.out.println("Balance is"+" "+amount);
}
void display()
{
System.out.println(acc_no+" "+name+" "+amount);
}
class TestAccount{
public static void main(String[] args) {
Account a=new Account();	
a.insert(5435521,"vinay",59000);
a.deposit(53250);
a.withdraw(2000000);
a.checkBalance();
a.display();
	}

}
}
