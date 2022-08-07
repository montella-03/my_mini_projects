import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, BankAccount> BankAccounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String[] data = in.nextLine().split(" ");
            if (data[0].equals("End")) {
                break;
            }
            switch (data[0]) {
                case "create":
                    createBankAccount();
                    break;
                case "deposit":
                    depositMoney(Integer.parseInt(data[1]), Double.parseDouble(data[2]));
                    break;
                case "setInterest":
                    BankAccount.setInterestRate(Double.parseDouble(data[1]));
                    break;
                case "getInterest":
                    getInterestRate(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
        }

    }

    private static void getInterestRate(int years, int id) {
        if (BankAccounts.containsKey(id)) {

            System.out.println(String.format("Interest for %d years for account %d is %.2f", years, id,
                    BankAccounts.get(id).getInterestRate(years)));
        } else {
            System.out.println("account does not exist");
        }
    }

    private static void depositMoney(int id, double amount) {
        if (BankAccounts.containsKey(id)) {
            BankAccounts.get(id).deposit(amount);
            System.out.println(String.format("deposited %.2f to account %d\n", amount, id));
        } else {
            System.out.println("Account doesn't exist buddy");
        }
    }

    private static void createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        BankAccounts.put(bankAccount.getId(), bankAccount);
    }
}