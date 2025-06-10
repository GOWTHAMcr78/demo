package session3;

public class main {

    static class Node {

        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }

    static Node head = null;

    public static void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {

            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    	
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        System.out.println("Original list:");
        display();

        reverse();

        display();

    }

}










