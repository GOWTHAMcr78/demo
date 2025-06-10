package session3;
import java.util.Scanner;

public class task2 {

		    static class Node {
		        int data;
		        Node next;

		        Node(int value) {
		            data = value;
		            next = null;
		        }
		    }
		    
		    static Node head = null;
		    public static void insertAtPosition(int value, int position) {

		        Node newNode = new Node(value);
		        if (position == 0) {
		            newNode.next = head;
		            head = newNode;
		            return;
		        }
		        
		        Node current = head;
		        int count = 0;
		        while (current != null && count < position - 1) {
		            current = current.next;
		            count++;
		        }

		        if (current == null) {
		            System.out.println("Position out of range");
		            return;
		        }

		        newNode.next = current.next;
		        current.next = newNode;
		    }

		    public static void display() {
		        Node current = head;
		        System.out.print("Linked List: ");
		        while (current != null) {
		            System.out.print(current.data + " -> ");
		            current = current.next;

		        }
		        System.out.println("null");
		    }
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        
		        insertAtPosition(10, 0);
		        insertAtPosition(20, 1);
		        insertAtPosition(30, 2);
		        display();

		        System.out.print("Enter value to insert: ");
		        int value = sc.nextInt();
		        System.out.print("Enter position to insert: ");
		        int pos = sc.nextInt();

		        insertAtPosition(value, pos);
		        display();
		    }
		}








