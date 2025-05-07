public class DoubleLinkedList {
    Node head;

    Node tail;
    int size;

    DoubleLinkedList(){
        head=null;
        tail=null;
        this.size=0;
    }

    public void InsertStart(int value){
        Node newnode=new Node(value);
        if(head==null){
            head=tail=newnode;

        }
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size++;


    }
    public void InsertEnd(int value){

        Node newnode=new Node(value);
        if(tail==null){
            tail=head=newnode;
        }
        else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    public  void Insert(int value,int index){

        if(index==0){
            InsertStart(value);
        }
        else if(index==size){
            InsertEnd(value);
        }
        else {
            Node temp=head;
            for (int i = 0; i < index; i++) {

                temp = temp.next;
            }
            Node newnode = new Node(value, temp.prev, temp);
            temp.prev.next=newnode;
            temp.prev=newnode;


        }
        size++;

    }

    public void deleteFromStart(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    public  void deleteFromEnd(){
        if(tail==null){
            System.out.println("List is empty");
        }
        if(tail.prev==null){
            tail=head=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    public void delete(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node temp=head;
        if(index==0){
            deleteFromStart();
            return;
        }
        if(index==size){
            deleteFromEnd();
            return;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;

        size--;
    }
    public double average(){
        int size=0;
        Node temp=head;
        double sum=0;
        if(head==null){
            return 0;
        }
        else {
            while (temp != null) {
                sum += temp.value;
                size++;
                temp = temp.next;
            }
            return sum / size;

        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println(" END");
    }
    public int getIndex(int value){
        Node temp=head;
        int position=0;
        while(temp!=null){
            if(temp.value==value){
                return position;

            }
            position++;
            temp=temp.next;
        }
        return position;
    }
    public Node getNode(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node temp=head;
        int position=0;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int compareNodes(int index1,int index2) {
        Node node1=getNode(index1);
        Node node2=getNode(index2);
        if(node1.value>node2.value){
            return index1;
        }
        else{
            return index2;
        }

    }
    public void displayGraterthan(int value){
        Node temp=head;
        while(temp.next!=null){
            if(temp.value>value){
                System.out.print(temp.value + " ");
            }
            temp=temp.next;
        }
        System.out.println("END");

    }
    public class Node{

        Node next;
        Node prev;
        int value;
        Node(int value){
            this.value=value;

        }
        Node(int value,Node prev,Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
    }
}
