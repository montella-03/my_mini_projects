public class Ques {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1, 0, 1 };
        //int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[j++] = nums[i];

            }
        }

            while (j < nums.length) {
                nums[j++] = 1;

            }

        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
