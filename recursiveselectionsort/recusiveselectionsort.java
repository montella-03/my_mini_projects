import java.util.Arrays;

public class Recursivesort {
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);

    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexmin = low;
            double min = list[low];
            for (int i = low + 1; i < high; i++) {
                if (list[i] < min) {
                    list[i] = min;
                    indexmin = i;
                }
            }
            list[indexmin] = list[low];
            list[low] = min;

            sort(list, low + 1, high);

        }

    }

    public static void main(String[] args) {//test code
        double[] list = { 3, 5, 7, 2, 7, 8 };
        sort(list);
        System.out.print(Arrays.toString(list));
    }
}
