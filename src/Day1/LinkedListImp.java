package Day1;

import Demo.Node;

class LinkedList {

    Node head = null;

    // Add node at last
    void addAtLast(int data) {

        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }


            temp.next = ptr;
        }
    }

    // Display linked list
    void show() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void addAtBeg(int data){
        Node ptr = new Node(data);
        if(head == null){
            head = ptr;
        }else{
            ptr.next = head;
            head = ptr;
        }
    }
    void addAtPosition(int data, int pos) {

        Node ptr = new Node(data);

        if (pos == 1) {
            ptr.next = head;
            head = ptr;
            return;
        }

        Node temp = head;
        int l = 1;

        while (temp != null && l < pos - 1) {
            temp = temp.next;
            l++;
        }

        ptr.next = temp.next;
        temp.next = ptr;
    }
    void addatPosition(int data,int pos){
        Node ptr=new Node(data);
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(i==pos-1){
                ptr.next=temp.next;
                temp.next=ptr;
                return;
            }
            temp=temp.next;
            i++;
        }
    }
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        Node save = null;
        while (temp.next != null) {
            save = temp;
            temp = temp.next;
        }
        save.next = null;
        temp = null;
    }
    void deleteAtPosition(int pos){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        int l = 1;
        Node temp = head;
        Node save = null;
        while(temp !=null){
            if (l ==pos){
                save.next = temp.next;
                temp =null;
                return;
            }
            save = temp;
            temp =temp.next;
            l++;
        }
    }
    void delAtBeg(){

        if(head == null){
            System.out.println("Empty");
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }
}

public class LinkedListImp {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtBeg(100);
        list.show();
    }
}