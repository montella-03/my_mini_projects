import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,2,1,7,6};
        insertion(numbers);

        System.out.print(Arrays.toString(numbers));


    }

    public static void insertion(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }
        
    
}  
