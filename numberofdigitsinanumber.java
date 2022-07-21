import java.util.Scanner;

public class Ques {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be counted");

        int number = in.nextInt();
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
