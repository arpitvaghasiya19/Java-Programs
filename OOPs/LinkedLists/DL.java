package LinkedLists;

public class DL {
    private Node head;


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        System.out.println("Print ing in Reverce :");
        while(last != null){
           System.out.println(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void InsertLast(int val){
        Node node = new Node(val);
        Node temp = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            node = head;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
