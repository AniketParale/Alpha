package LL;
import java.util.*;
public class LinkedList {

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

    public void addFirst(int data){
        Node newNode = new Node(data); //creating a new node
        if (Head == null) { // if there is empty list then hed tail will be same as new node
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head; // assign current head as next to new node
        Head = newNode; //make new node a new head
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (Tail==null) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;
    }

    public void printLL(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();
    }


}
