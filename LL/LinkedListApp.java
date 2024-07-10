package LL;

import java.util.*;

// import LL.LinkedList.Node;

public class LinkedListApp {

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

    public LinkedListApp() {
        Head = null;
        Tail = null;
        size = 0;
    }


    public void printLL(){
        if (size==0) {
            System.out.println("Currently linked list is empty");
        }
        Node Temp = Head;
        while (Temp!=null) {
            System.out.print(Temp.data+"-> ");
            Temp = Temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int value){
        Node Temp = new Node(value);

        if (Head==null) {
            Head = Tail = Temp;
        }else{
            Temp.next = Head;
            Head = Temp;
        }
        size++;

        System.out.println("Now the linked list is- ");
        printLL();

    }

    public void addLast(int value){
        Node Temp = new Node(value);
        if (Head==null) {
            Head = Tail = Temp;
        }
        size++;

        Tail.next = Temp;
        Tail = Temp;

        System.out.println("Now the linked list is- ");
        printLL();
    }

    public void addMiddle(int index, int value){
        
        if (size==0) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = Head;
        int i = 0;
        while(i<index-1){
            temp= temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        System.out.println("Now the new linked list is- ");
        printLL();

    }

    public void removeFirst(){
        if (size==0) {
            System.out.println("linked list is empty");
        }else if (size==1) {
            Head = Tail = null;
            size--;
            System.out.println("linked list became empty as there was only one node");
        }else{
            Node temp = Head;
            Head = temp.next;
            size--;
            printLL();
        }
    }

    public void removeLast(){
        if (size==0) {
            System.out.println("linked list is empty");
        }else if (size==1) {
            Head = Tail = null;
            size--;
            System.out.println("linked list became empty as there was only one node");
        }else{
            Node temp = Head;
            while(temp.next!=Tail){
                temp = temp.next;
            }
            temp.next = null;
            size--;
            printLL();
        }
    }



    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("application to understand linkedList");

        LinkedListApp ll = new LinkedListApp();

        while(i>0 || i<7){
            System.out.println("1) Add element at first\n2) Add element at last\n3) Add element at middle\n4) Remove first element\n5) Remove last element\n6) current size of linkedlist");
            System.out.print("Choose option - ");
            i = sc.nextInt();
            System.out.println();

            if (i==1) {
                System.out.print("enter value to be added- ");
                int value = sc.nextInt();
                ll.addFirst(value);
            }
            else if(i==2){
                System.out.print("enter value to be added- ");
                int value = sc.nextInt();
                ll.addLast(value);
            }
            else if(i==3){
                System.out.print("enter index and value to be added- ");
                int index = sc.nextInt();
                int value = sc.nextInt();
                ll.addMiddle(index, value);
            }
            else if(i==4){
                ll.removeFirst();
            }
            else if(i==5){
                ll.removeLast();
            }else if (i==6) {
                System.out.println(ll.size);
            }else{
                System.out.println("choose correct option...!!!");
                break;
            }

        }
      
    }
    
}
