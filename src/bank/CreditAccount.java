package bank;

public class CreditAccount implements IBankAccount {

    private String id;
    private int limit;
    private int balance = 0;
    private double percent;

    public CreditAccount(String id, int limit, double percent){
        this.id = id;
        this.limit = limit;

        if(percent>1)
        {
            percent/=100;
        }
        this.percent = percent;
    }

    @Override
    public int withdraw(int amount) {
        if(balance+amount < limit){
            balance+= amount;
            return amount;
        }
         int t = balance;
         balance = limit;
         return limit - balance;
    }

    @Override
    public void deposit(int amount) {
        balance -= amount;
    }

    @Override
    public void checkBalance() {
        balance+=balance*percent;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
