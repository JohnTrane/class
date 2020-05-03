package bank;

public interface IBankAccount
{
    int withdraw(int amount);
    void deposit(int amount);
    void checkBalance();
    int getBalance();
}
