import java.util.Scanner;
public class ATMINTERFACE
{
    public static void main(String args[])
    {
        double initialbalance = 0;
        Scanner money = new Scanner(System.in);
        int userchoice;
        while (true)
        {
            System.out.println("\n\t\t\t ATM INTERFACE");
            System.out.println("\n 1) BALANCE REVIEW");
            System.out.println("\n 2)MONEY DEPOSITION");
            System.out.println("\n 3)MONEY WITHDRAWAL");
            System.out.println("\n 4)EXIT THE OPERATION");
            System.out.print("\nPLEASE CHOICE YOUR OPTION :");
            userchoice = money.nextInt();
            if (userchoice == 1) 
            {
                System.out.println("\n YOUR CURRENT BALANCE IS :" + initialbalance);
            }
            else if (userchoice == 2)
            {
                System.out.println("\n ENTER THE AMOUNT YOU WANT TO DEPOSIT:");
                double depositedamount = money.nextDouble();
                if (depositedamount > 0)
                {
                    initialbalance = initialbalance + depositedamount ;
                    System.out.println("\n YOUR DOPOSITED AMOUNT IS:" + depositedamount);
                    System.out.println("\n YOUR TOTAL AMOUNT IN YOUR ACCOUNT IS :" + initialbalance);
                } 
            }
            else if ( userchoice == 3)
            {
                System.out.println("\n ENTER THE AMOUNT YOU WANT TO WITHDRAW:");
                double withdrawamount = money.nextDouble();
                if (withdrawamount > 0 && withdrawamount <= initialbalance)
                {
                    initialbalance = initialbalance - withdrawamount;
                    System.out.println("\n YOUR WITHDRAWAL AMOUNT IS:" + withdrawamount);
                    System.out.println("\n YOUR TOTAL AMOUNT IN YOUR ACCOUNT IS:" + initialbalance);
                }
                else 
                {
                    System.out.println("\n INSUFFICIENT BALANCE OR INVALID WITHDRAWAL AMOUNT");
                }
            }
            else if (userchoice == 4)
            {
                System.out.println("\n THANK YOU ");
                break;
            }
            else 
            {
                System.out.println("\n ENTER THE VALID CHOICE :");
            }
        }
        money.close();
    }
}
