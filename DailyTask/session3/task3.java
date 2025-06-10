package session3;
import java.util.Scanner;

public class task3 {
	
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
		            Node current = head;
		            while (current.next != null) {
		                current = current.next;
		            }
		            current.next = newNode;
		        }
		    }

		    public static void deleteAtPosition(int position) {
		        if (head == null) {
		            System.out.println("List is empty.");
		            return;
		        }
		        
		        if (position == 0) {
		            head = head.next;
		            return;
		        }

		        Node current = head;
		        int count = 0;
		        while (current != null && count < position - 1) {
		            current = current.next;
		            count++;
		        }

		        if (current == null || current.next == null) {
		            System.out.println("Position out of range.");
		            return;
		        }
		        current.next = current.next.next;
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

		        insert(10);
		        insert(20);
		        insert(30);
		        insert(40);
		        insert(50);
		        display();

		        System.out.print("Enter position to delete: ");
		        int pos = sc.nextInt();
		        deleteAtPosition(pos);
		        display();

		    }
		}






