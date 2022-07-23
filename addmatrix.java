public class Ques {
    public static void name(int[][] nums, int[][] nums1, int row, int col) {
        int[][] nums2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums2[i][j] = nums[i][j] + nums1[i][j];

            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nums2[i][j]+",");

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int[][] one = { { 1, 3, 5 }, { 3, 5, 6 }, { 6, 7, 8 } };
        int[][] two = { { 11, 30, 50 }, { 13, 15, 16 }, { 26, 27, 28 } };

        name(one, two, 3, 3);
        
        

    }
}
