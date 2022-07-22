

public class Ques {

    public static void main(String[] args) {
        int[] name = { 1, 2,2,2,2,2, 4, 5 };
        int sum = 5;

        int low = 0;
        int high = name.length - 1;

        while(low<high) {
            if (name[low] + name[high] > sum) {
                high--;
            }
            else if (name[low] + name[high] < sum) {
                low++;
            }
            else if (name[low] + name[high] == sum) {
                System.out.println(low + "," + high);
                low++;
                high--;
            }

        }
            
        }
        
    }
