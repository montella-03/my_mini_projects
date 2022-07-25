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
//
public static void main(String[] args) {
        int[] x = new int[]{5, 1, 4, 12, 7};
        int n = x.length;
        System.out.println("Original Array list is: " + Arrays.toString(x));

        for(int i = 0; i < n - 1; ++i) {
          // swapping of element occurs here
            if (x[i] > x[i + 1]) {
                int temp = x[i];
                x[i] = x[i + 1];
                x[i + 1] = temp;
            }
        }

        System.out.println("The Sorted list is:     " + Arrays.toString(x));
    }
