package session5;

public class task1 {
	Node last;

    class Node{
        int data;
        Node next;

        public Node(int num)
        {
            data=num;
            next=null;
        }}
        public task1() {
            last=null;
        }
            public void insert(int value) {
                Node newnode=new Node(value);
                if(last==null) {
                    last=newnode;
                    last.next=newnode;
                }
                else {
                    newnode.next=last.next;
                    last.next=newnode;
                    newnode=last;
                }
            }
        public void display() {
            Node temp=last.next;
            do {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }while(temp!=last.next);
        }
        
        public static void main(String args[]) {
            task1 t=new task1();
            t.insert(10);
            t.insert(20);
            t.insert(30);
            t.insert(40);
            t.insert(50);
            t.display();
            
        }


}
