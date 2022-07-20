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

// using stack.
import java.util.Stack;

import javax.swing.text.html.StyleSheet;

public class Ques {

    public static void main(String[] args) {
        String name = "christopher";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));

        }
        System.out.println("reverse of name ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
