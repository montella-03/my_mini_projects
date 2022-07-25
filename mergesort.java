import java.util.Arrays;
import java.util.Random;

public class Ques {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("array before");
        System.out.print(Arrays.toString(numbers));

        System.out.println();
        sort(numbers);
        System.out.println("after sort");

        System.out.print(Arrays.toString(numbers));

    }

    //private static void print(int[] numbers) {
        //for (int i = 0; i < numbers.length; i++) {
       //     System.out.print(numbers[i]+",");
     //   }
   // }

    public static void sort(int[] nums) {
        int length = nums.length;
        if (nums.length < 2) {
            return;
        }
        int midindex = length / 2;
        int[] leftHalf = new int[midindex];
        int[] rightHalf = new int[length - midindex];

        for (int i = 0; i < midindex; i++) {
            leftHalf[i] = nums[i];
        }
        for (int i = midindex; i < length; i++) {
            rightHalf[i-midindex] = nums[i];

        }
        sort(leftHalf);
        sort(rightHalf);
        merge(nums, leftHalf, rightHalf);

    }

    private static void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                nums[k] = leftHalf[i];
                i++;
            } else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
        
    }
}
