package Day1;



class LinkedList {

    Node head = null;

    // Add node at last
    void addAtLast(int data) {

        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        }
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
        }
    }

    void addAtBeg(int data){
        Node ptr=new Node(data);
        if(head==null)
        {
            head=ptr;
        }
        else
        {
            ptr.next=head;
            head=ptr;
        }
    }
    void addatPosition(int data,int pos){
        Node ptr=new Node(data);
        Node temp=head;
        int i=1;
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
    void delatBeg(){
        if(head==null) return;
        if(head.next==null) head=null;
        else{
            Node temp=head;
            head=head.next;
            temp=null;
        }
    }
    void delatEnd(){
        if(head==null) return;

        Node temp=head;
        Node save= head;
        while(temp.next!=null){
            save=temp;
            temp=temp.next;
        }
        save.next=null;
        temp=null;
    }
    void delatPos(int pos){
        if(head==null)return;
        if(pos==1&& head.next!=null)head=head.next;
        int i=1;
        Node temp=head;
        Node save=head;
        while(temp!=null){
            if(i==pos){
                save.next=temp.next;
                temp=null;
                return;
            }
            save=temp;
            temp=temp.next;
            i++;
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

    void findMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }
}

public class LL {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtBeg(40);

        list.addatPosition(50, 3);
        //list.delatEnd();
        list.delatPos(1);
        list.delatBeg();
        list.show();
    }
}