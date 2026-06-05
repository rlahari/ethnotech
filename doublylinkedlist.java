class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class doublylinkedlist {
    Node head;

    // Insert at First
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete at First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertFirst(5);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteFirst();

        System.out.println("After Deletion:");
        list.display();
    }
}