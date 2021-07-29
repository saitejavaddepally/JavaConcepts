package DataStructures.LinkedLists;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListImp {

    Node head = null;

    void insertAtBeginning(int x){
        Node temp = new Node(x, null);
        System.out.println("new node address is : " + temp);
        temp.next = head;
        head = temp;
        System.out.println("head is : " + head);
    }

    void insertAtEnd(int x){
        Node temp = new Node(x, null);
        if (head == null){
            head = temp;
            return;
        }
        Node last = head;
        while(last.next!=null) last = last.next;
        last.next = temp;
    }

    void insertAtNthPosition(int data, int position){
        Node temp = head;
        Node newNode = new Node(data, null);

        if (position ==1 ){
            newNode.next = head;
            head = newNode;
            return;
        }

        for (int i = 1 ; i < position-1 ; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteAtNthPosition(int position){
        Node temp = head;
        if (position == 1){
            head = temp.next;
            return;
        }
        for (int i = 1 ; i < position-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void printAllNodes(){
        System.out.println("head address : " + head);
        System.out.println("head next address " + head.next);
        Node temp = head;
        Node i;
        for ( i  = temp ; i.next != null  ; i = i.next){
            System.out.println("current i value "  + i);
            System.out.print(i.data + " ");
            System.out.println();
            System.out.println("temp next address" + i.next);
        }
        System.out.print(i.data + " ");
        System.out.println();
    }

    void printAllNodesRecursive(Node p){
        System.out.print(p.data + " ");
        if (p.next == null){
            return;
        }
        printAllNodesRecursive(p.next);
    }

    public static void main(String[] args) {
        LinkedListImp imp = new LinkedListImp();
        imp.insertAtBeginning(5);
        imp.printAllNodes();
    }
}
