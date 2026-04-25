public class BankAccount
{
    private String accountNumber;
    private int balance;

    BankAccount(String accountNumber, int balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(int amount)
    {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
    void withdraw(int amount)
    {
        if(amount > balance){
            System.out.println("Insufficient balance");
        } else{
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount("12345", 1000);
        b1.deposit(500);
        b1.withdraw(200);
        b1.withdraw(2000);
    }
}