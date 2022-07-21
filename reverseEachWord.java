//import java.util.Stack;

//import javax.swing.text.html.StyleSheet;

public class Ques {

    public static void main(String[] args) {
        String name = "christopher montella";

        String[] words = name.split(" ");

        String reverse = "";
        for(String word: words){
            String reverseword="";
            for (int i=word.length()-1;i>=0;i--){
                reverseword = reverseword+word.charAt(i);
            }
            reverse = reverse+reverseword+" ";
        }
        System.out.println(reverse);
    }
}
