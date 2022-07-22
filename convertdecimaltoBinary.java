public class Ques {

    public static void main(String[] args) {
        binary(7);//111
    }

    public static void binary(int n) {
        int[] arr = new int[20];
        int count = 0;

        while (n > 0) {
            arr[count++] = n % 2;

            n = n / 2;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
    }
}
