

public class Ques {

    public static void main(String[] args) {
        int[] name = { 1, 2, 4, 5 };
        int n = name.length + 1;
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < name.length; i++) {
            sum -= name[i];

        }
            System.out.println(sum);
            
        }
        
    }
