import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    //christopher oigo.
    public static void main(String[] args) {
        String[] RPS = { "Rock", "Paper", "Scissors" };
        String ComputerChoice = RPS[new Random().nextInt(RPS.length)];
        
        Scanner console = new Scanner(System.in);
        String playerMove = console.nextLine();

        while (true) {
            System.out.println("enter Rock/Paper/Scissors");
            if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                break;
            }
            System.out.println("play out of bound");
        }
        if(playerMove.equals(ComputerChoice))
            System.out.println("its a tie buddy");
        else if (playerMove.equals("Rock")) {
            if(ComputerChoice.equals("Paper"))
                System.out.println("you lose buddy");
            else if (ComputerChoice.equals("Rock")) {
                if (playerMove.equals("Paper"))
                    System.out.println("you won buddy");
            }
            else if (playerMove.equals("Paper")) {
                if (ComputerChoice.equals("Scissors"))
                    System.out.println("you loose buddy");
                else if (ComputerChoice.equals("Paper")) {
                    if (playerMove.equals("Scissors"))
                        System.out.println("you won buddy");
                }
            }
            else if (playerMove.equals("Rock")) {
                if(ComputerChoice.equals("Scissors"))
                    System.out.println("you won buddy");
                else if (ComputerChoice.equals("Rock")) {
                    if(playerMove.equals("Scissors"))
                        System.out.println("you lose buddy");
                }

            }
        }
    }
}