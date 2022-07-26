public class LL {
    private Node tail;
    private Node head;

    private int size;

    public LL() {
        this.size = 0;

    }

    public void insertAtTail(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        if (tail == null) {
            insertAtHead(value);
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "--->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void insertAtHead(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
//

main class.
  
  public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LL list = new LL();
        list.insertAtHead(4);
        list.insertAtHead(3);
        list.insertAtHead(5);// inserts 534.

        list.display();

        list.insertAtTail(2);
        System.out.println();

        list.display();5342...
    }
}
