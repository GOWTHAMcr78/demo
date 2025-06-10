package session3;

public class task1_sll {
	 public static void main(String[] args) {

	        SinglyLinkedList list = new SinglyLinkedList();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
	        list.traverse(); 
	    }
	}

	class SinglyLinkedList {
	    Node head;
	    class Node {
	        int data;
	        Node next;
	        Node(int value) {
	            data = value;
	            next = null;
	        }
	    }

	    public void insert(int value) {
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

	    public void traverse() {
	        Node current = head;
	        System.out.println("Linked List:");
	        while (current != null) {

	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}






	  