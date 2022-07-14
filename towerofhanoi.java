import java.util.Scanner;

public class TowerofHanoi {
    public static void moveDisks(int n, char toTower, char auxTower, char fromTower) {
        if (n == 1)
            System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of disks to be moved");//test code.
        int n = scanner.nextInt();
        System.out.println("moves are:");
        moveDisks(n, 'A', 'B', 'C');
    }

    
}
