public class LL {
    private Node tail;
    private Node head;

    private int size;

    public LL() {
        this.size = 0;

    }

    public LL.Node find(int value) {// return the node of a value.
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;

    }

    public LL.Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }

    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;

        return value;
        
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;

        return value;


        
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;      
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertAtHead(value);
            return;
        }
        if (index == size) {
            insertAtTail(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);

        temp.next = node;
        size++;
        
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
