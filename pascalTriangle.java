

public class Main {
    public static void main(String[] args) {
        int[][] pascal = new int[5][];
        fillArray(pascal);
        print(pascal);

    }

    private static void print(int[][] pascal) {
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void fillArray(int[][] pascal) {
        for (int i = 0; i < pascal.length; i++) {
            pascal[i]=new int[i+1];
            pascal[i][0]=1;
            pascal[i][i]=1;
            for (int j = 1; j < i; j++) {
                pascal[i][j]=pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
    }
}
