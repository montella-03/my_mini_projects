public class BankAccount {
    private static double interestRate = 0.02;
    private int id;
    private double balance;
    private static int counter = 1;

    public BankAccount() {
        this.id = counter++;
        System.out.println(String.format("ID %d\n", this.id));
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return interestRate * years * this.balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }
}
