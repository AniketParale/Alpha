package LL;

public class searchInLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        Node temp = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = temp;
            return;
        }
        temp.next = Head;
        Head = temp;
    }


    public void reverseLL(){
        Node temp = Head;
        Node prev = null;
        while (temp!=null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    }


    public void printLL(){
        Node temp = Head;
        if (Head == null) {
            System.out.println("list is empty...!!!");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printReverseLL(){
        Node temp = Tail;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        searchInLL ll = new searchInLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.reverseLL();
        ll.printReverseLL();
    }

}
