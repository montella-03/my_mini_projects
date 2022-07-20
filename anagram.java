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

// another aproach.

//import java.util.Arrays;
import java.util.Scanner;

public class Ques {

    //determining whether a strings are anagram or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first string");

        String str1 = in.nextLine();

        System.out.println("enter 2nd string");
        String str2 = in.nextLine();

        System.out.println("strings are anagram?"+isAnagram(str1, str2));

    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;

        int[] countArr = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            countArr[str1.charAt(i)]++;
            countArr[str2.charAt(i)]--;

        }
        for (int j = 0; j < countArr.length; j++) {
            if (countArr[j] != 0)
                return false;

        }
        return true;
        
    }
    
}

