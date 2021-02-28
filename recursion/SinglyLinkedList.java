import java.util.*;

class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int num) {
            this.data = num;
            this.next = null;
        }
    }

    static class List {
        public Node head;

        List() {
            this.head = null;

        }

        static Node temp;

        Node insertAtLast(int num) {
            Node node = new Node(num);
            if (this.head == null) {
                this.head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = node;
            }
            return head;
        }

        Node insertAtBegning(int num){
            Node node = new Node(num);
            if(this.head==null)
                return this.head = node;
            else{
                node.next = head ;
            }
            return head = node;
        }
    }

static void display(Node head){
    while(head!=null){
        System.out.println(head.data);
        head = head.next;
    }
}

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        List ll = new List();
        // ll.insertAtLast(1);
        // ll.insertAtLast(2);
        // ll.insertAtLast(3);
        // ll.insertAtLast(4);
        ll.insertAtBegning(1);
        ll.insertAtBegning(2);
        ll.insertAtBegning(3);
        ll.insertAtBegning(4);

        display(ll.head);
    }
}