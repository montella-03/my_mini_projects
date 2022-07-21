

public class Ques {

    public static void main(String[] args) {
        int[] name = { 1,1,2,2,3,3,4,5};

        int[] temp = new int[name.length];
        int j = 0;

        for (int i = 0; i < name.length - 1; i++) {
            if (name[i] != name[i + 1]) {
                temp[j++] = name[i];
            }
        
        }
        temp[j++] = name[name.length - 1];
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k]);
            
        }
        
    }
}
