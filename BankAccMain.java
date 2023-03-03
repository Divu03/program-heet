import java.util.Scanner;

class BankAccount
{
String name;
static int Acc_no = 1;
String Acc_type;
double Balance;

void createAcc()
{
Scanner sc = new Scanner(System.in);
System.out.println("\nAccount number : "+ Acc_no);
System.out.print("Enter depositor's name : ");
name = sc.next();
System.out.print("Enter account type : ");
Acc_type = sc.next();
System.out.print("Enter balance : ");
Balance = sc.nextDouble();
Acc_no++;
}

void Deposit()
{
Scanner sc = new Scanner(System.in);
double amt;
System.out.print("Enter the amount you want to deposit : ");
amt = sc.nextDouble();
Balance += amt;
System.out.println("Amount deposited successfully!");
}

void Withdraw()
{
Scanner sc = new Scanner(System.in);
double amt;
System.out.print("Enter the amount you want to withdraw : ");
amt = sc.nextDouble();
if(amt <= Balance)
{
Balance -= amt;
System.out.println("Amount withdrawed successfully!");
}
else
System.out.println("Insufficient Balance");
}

void BalanceInquiry()
{
System.out.println("Balance is : " + Balance);
}

}

class BankAccMain 
{
public static void main(String args[])
{
int n, ch, acc;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the no. of accounts : ");
n = sc.nextInt();
BankAccount obj[] = new BankAccount[n];
System.out.println("\nCreating Accounts: ");
for(int i=0; i<obj.length; i++)
{
obj[i] = new BankAccount();
obj[i].createAcc();
}

do
{
System.out.println("\nBank Account Services");
System.out.println("1.Deposit Amount \n2.Withdraw Amount \n3.Balance Inquiry \n4.Exit");
System.out.print("\nEnter your choice : ");
ch = sc.nextInt();
switch(ch)
{
case 1:
System.out.print("\nEnter account number: ");
acc = sc.nextInt();
if(acc > n || acc == 0)
{
System.out.println("Invalid Account number!");
break;
}

for(int i=0; i<n; i++)
{
    if((i+1) == acc)
    {
    obj[i].Deposit();
    break;
    }
}
break;

case 2:
System.out.print("\nEnter account number: ");
acc = sc.nextInt();
if(acc > n || acc == 0)
{
System.out.println("Invalid Account number!");
break;
}

for(int i=0; i<n; i++)
{
    if((i+1) == acc)
    {
    obj[i].Withdraw();
    break;
    }
}
break;

case 3:
System.out.print("\nEnter account number: ");
acc = sc.nextInt();
if(acc > n || acc == 0)
{
System.out.println("Invalid Account number!");
break;
}

for(int i=0; i<n; i++)
{
    if((i+1) == acc)
    {
    obj[i].BalanceInquiry();
    break;
    }
}
break;

case 4:
break;

default:
System.out.println("Invalid choice!");
break;

}
}
while(ch != 4);
}
}