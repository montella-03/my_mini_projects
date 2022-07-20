import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    //determining whether a strings are anagram or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first string");

        String str1 = in.nextLine();

        System.out.println("enter 2nd string");
        String str2 = in.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // import to store the sorted array in a new string.

        String sort1 = new String(arr1);
        String sort2 = new String(arr2);

        if(sort1.equals(sort2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
        

    }
    
}
