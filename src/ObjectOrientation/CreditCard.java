
package ObjectOrientation;
/*
An example of Encapsulation
-Variables should be made private(So that members outside the class can't access that directly-A form of security).
-member Functions should be made public.
*/

public class CreditCard     //following pascal case for naming classes
{
    private int number;
    private double balance;
    private double limit;
    int amount;
    static final double MAX_LIMIT=20000;
    
    public CreditCard(int number)   //Constructor
    {
        this.number=number;
    }
    //if user wants to use the credit card, amount should be checked before performing the transaction
    public boolean buyWithCreditCard()  // following camel case for naming member functions
    {
        if((balance-amount)<0)
        {
            System.out.println("Less Balance");
            return false;
        }
        balance=balance-amount;
        System.out.println("transaction successfull");
        return true;    
    }
    public void settle(double amount)
    {
        if(amount>0)
        {
            System.out.println("Error");
            return;
        }
        balance=balance+amount;
    }
    //Setter Method for MAX LIMIT
    public void SetLimit(double limit)
    {
        if(limit<=MAX_LIMIT)
        {
            this.limit=limit;
        }
        else
        {
            System.out.println("Limit Exceeds");
        }
    }
}
