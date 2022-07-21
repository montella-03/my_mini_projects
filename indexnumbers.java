

public class Ques {

    public static void main(String[] args) {
        int[] name = { 1, 2,2,2,2,2, 4, 5 };
        int search = 2;
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < name.length; i++) {
            if (name[i] == search && firstIndex == -1) {
                firstIndex = i;
            }
            if (name[i] == search && firstIndex != -1) {
                lastIndex = i;
            }
        }
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        
        }
        
    }
