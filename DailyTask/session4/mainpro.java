package session4;

public class mainpro {
	
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

	    public void insertMiddle(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        int size = 0;
	        Node temp = head;
	        while (temp != null) {
	            size++;
	            temp = temp.next;
	        }

	        int mid = size / 2;   
	        temp = head;
	        for (int i = 0; i < mid - 1; i++) {
	            temp = temp.next;
	        }

	        if (mid == 0) {
	           
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        } else {
	            
	            newNode.next = temp.next;
	            if (temp.next != null) {
	                temp.next.prev = newNode;
	            }
	            temp.next = newNode;
	            newNode.prev = temp;
	        }
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
	        mainpro dll = new mainpro();

	        dll.insertEnd(10);
	        dll.insertEnd(20);
	        dll.insertEnd(40);
	        dll.insertEnd(50);
 
	        dll.traverseForward();  
	        dll.insertMiddle(30);
	        dll.traverseForward(); 
	        dll.traverseBackward();
	    }
	}



