package bank;

public class DebitAccount implements IBankAccount
{
    String id;
    double percent;
    int balance = 0;
    public DebitAccount(String id, double percent)
    {
        this.id = id;
        if(percent>1)
        {
            percent/=100;
        }
        this.percent=percent;
    }

    @Override
    public int withdraw(int amount) {
        if(amount>0)
        {
            if(amount <= balance)
            {
                balance -= amount;
                return amount;
            }
            else
            {
                int t = balance;
                balance=0;
                return t;
            }
        }
        return 0;
    }

    @Override
    public void deposit(int amount) {
        if(amount>0)
        {
            balance+=amount;
        }
    }

    @Override
    public void checkBalance() {
        balance += balance*percent;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
