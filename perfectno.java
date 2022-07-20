import java.util.Scanner;

public class PerfectNumber {

    //determining whether a number is a perfect number.
    public static void main(String[] args) {
        int sum=0, number;

        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
                if (number == sum) {
                    System.out.println("perfect number");
                } else {
                    System.out.println("not perfect number");
                }

            
        }
        else {
            System.out.println("enter a positive integer");
        }

    }
    
}
