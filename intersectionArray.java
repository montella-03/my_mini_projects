// o(mn).
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


// 2 approach o(m+n).


public class Ques {

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 9, 5 };
        int[] arr2 = { 1, 3, 4, 7, 9 };

        int i =0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else
                i++;

        }
        
            
        
    }
}
