import java.util.Stack;

public class Ques {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enque(int n) {
        stack1.push(n);

    
    }
    public void dequeue(){
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("empty stacks pal");
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        System.out.println(stack2.pop());
    }
        
    }
