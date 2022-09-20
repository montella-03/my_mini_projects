import javax.swing.*;
import java.security.SecureRandom;

public class Main {
    private static final SecureRandom secureRandom = new SecureRandom();
    private enum Status {WON,CONTINUE,LOST};
    private static final int two = 2;
    private static final int three= 3;
    private static final int seven = 7;
    private static final int eleven = 11;
    private static final int twelve = 12;

    public static void main(String[] args) {
        int myPoints = 0;
        Status gameStatus;
        int diceSum = rollDice();

        switch (diceSum){
            case 7:
            case 11:
                gameStatus=Status.WON;
                break;
            case 2:
            case 3:
            case 12:
                gameStatus=Status.LOST;
                break;
            default:
                diceSum=myPoints;
                gameStatus=Status.CONTINUE;
                break;

        }
        while (gameStatus==Status.CONTINUE){
            diceSum=rollDice();
            if(diceSum==myPoints)
                gameStatus=Status.WON;
            else
                if(diceSum==7)
                    gameStatus=Status.LOST;
        }
        if(gameStatus==Status.WON)
            System.out.println("you have won money");
        else if(gameStatus==Status.LOST){
            System.out.println("you lost buddy");
        }



    }
    public static int rollDice(){
        int dice1 = 1 + secureRandom.nextInt(6);
        int dice2 = 1 + secureRandom.nextInt(6);

        int sum = dice1 + dice2;
        System.out.printf("points are %d + %d = %d\n",dice1,dice2,sum);
        return sum;
    }

}
