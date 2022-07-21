
public class Ques {

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 9, 5 };
        int[] arr2 = { 1, 3, 4, 7, 9 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                }
                
            }
            
        }
    }
}
