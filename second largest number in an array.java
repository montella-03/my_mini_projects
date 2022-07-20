
public class Ques {

    //finding the second largest number in an array.
    public static void main(String[] args) {
        int[] num = { 1,3,4, 10,5,6, 9, 7,10,9};
        
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > highest) {
                secondhighest = highest;
                highest = num[i];
            }
            if(num[i]<highest && num[i]>secondhighest)
                secondhighest = num[i];
            
        }

        System.out.println(secondhighest);
        
    }
    
}
