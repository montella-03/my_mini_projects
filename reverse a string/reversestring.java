public class reversestring {
    public static void reverseString(char[] s) {
        int point1 = 0;
        int point2 = s.length - 1;

        while (point1 <= point2) {
            char temp = s[point1];
            s[point1] = s[point2];
            s[point2] = temp;

            point1++;
            point2--;
        }

    }
    
}
