package LL;

public class LinkedListPract {
    public static class Node {
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
        if (Head==null) {
            Head = Tail = temp;
            return;
        }
        temp.next = Head;
        Head = temp;
    }

    public void addLast(int data){
        Node temp = new Node(data);
        size++;
        if (Head==null) {
            Head = Tail = temp;
            return;
        }
        Tail.next = temp;
        Tail = temp;
    }

    public void addMiddle(int index, int data){

        if (index==0) {
            addFirst(data);
            return;
        }

        Node Temp = Head;
        size++;
        int i = 0;
        while(i<index-1){
            Temp = Temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = Temp.next;
        Temp.next = newNode;
    }


    public void removeFirst(){
        if (size==0) {
            System.out.println("linkedlist is empty");
        }
        if (size==1) {
            Head = Tail = null;
        }
        Node temp = Head;
        Head = temp.next;
        size--;
    }


    public void removeLast(){
        if (size==0) {
            System.out.println("linkedlist is empty");
        }
        if (size==1) {
            Head = Tail = null;
        }
        Node temp = Head;
        while(temp.next!=Tail){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void printLL(){
        Node temp = Head;
        while (temp!=null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // public void sizeOfLL(){
    //     int counter = 0;
    //     Node temp = Head;
    //     while(temp!=null){
    //         counter++;
    //         temp = temp.next;
    //     }
    //     System.out.println("size of linked list is "+ counter);
    // }

    public static void main(String[] args) {
        LinkedListPract ll = new LinkedListPract();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);

        ll.printLL();
        System.out.println();

        ll.removeFirst();
        ll.removeLast();
        ll.printLL();

        System.out.println();
        System.out.println("current size of linkedlist is " + ll.size);

    }
}
