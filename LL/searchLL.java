package LL;

public class searchLL {
    public static class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public static Node Head;
    public static Node Tail;

    
    public void insert(int data){
        Node newNode = new Node(data);
        Node temp = Head;
        if (Head==null) {
            Head = Tail = newNode;
            return;
        }
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = Tail = newNode;
        newNode.next = null;
    }

    public void printLL(){
        if (Head == null) {
            System.out.println("linkedlist is empty");
        }
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void searchInLL(int key){
        Node temp = Head;
        while (temp.next!=null) {
            if (temp.data == key) {
                System.out.println("key " + key + " found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("key not found");
    }

    public static void main(String[] args) {
        searchLL ll = new searchLL();
        int arr[] = {1,2,3,4};
        for(int i=0;i<4;i++){
            ll.insert(arr[i]);
        }

        ll.printLL();
        System.out.println();
        // System.out.println("\n"+ll.Tail.data);
        ll.searchInLL(3);
    }

}
