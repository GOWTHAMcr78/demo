package session4;

public class task1 {
	
	    static class Node {
	        int data;
	        Node prev;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }

	    Node head; 

	    public void insertEnd(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    public void traverseForward() {
	        Node temp = head;
	        System.out.print("DLL Forward: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public void traverseBackward() {
	        if (head == null) return;

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        System.out.print("DLL Backward: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        task1 dll = new task1();

	        dll.insertEnd(10);
	        dll.insertEnd(20);
	        dll.insertEnd(30);

	        dll.traverseForward();
	       
	    }
	}



