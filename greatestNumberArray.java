public class Ques {

    public static void main(String[] args) {
        int[] numbers = { 2, 3, 1, 4, 5, 8, 4, 9 };
        int next;
        for (int i = 0; i < numbers.length; i++) {
            next = -1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    next = numbers[j];
                    break;
                }

            }
            System.out.println("the greatest number of "+numbers[i]+" = "+next);

        }
    }
}
