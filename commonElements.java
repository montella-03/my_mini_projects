public class Ques {

    public static void main(String[] args) {
        int[] s = { 1, 2, 4, 5 };
        int[] t = { 1, 2, 4, 5 };
        int[] k = { 1, 2, 4, 5 };
        
        name(s, t, k);

    }

    public static void name(int[] s, int[] t, int[] k) {
        int x = 0, y = 0, z = 0;

        while (x < s.length && y < t.length && z < k.length) {
            if (s[x] == t[y] && t[y] == k[z]) {
                System.out.print(s[x]+",");
                x++;
                y++;
                z++;
            }
            else if (s[x] > t[y]) {
                y++;
            }
            else if (t[y] > k[z]) {
                z++;
            }
            else
            x++;
        }
        
    }

}
