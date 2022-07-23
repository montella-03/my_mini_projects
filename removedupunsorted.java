import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1, 0, 1 };
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j++] = nums[i];

            }
        }

            nums[j++]=nums[nums.length-1];

            

        
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i]+" ");//01
        }
    }
}
