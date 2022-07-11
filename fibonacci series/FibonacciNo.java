 public class FibonacciNo {
        public static void main(String[] args) {
            int first = 0;
            int second = 1;
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter number of elements wanted in a fib series");
            int n = scanner.nextInt();

            int next;
            System.out.println("the fibonacci series");
            System.out.print(first + " " + second + " ");

            for (int i = 2; i <= n; i++) {
                next = first + second;
                System.out.print(next + " ");

                first = second;
                second = next;
            }
        }

    }
    

