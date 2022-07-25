import java.util.Arrays;

public class Ques {

    public static void main(String[] args) {
        int[] array = { 2, 4, 1, 6, 7 };
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    //swap.
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
