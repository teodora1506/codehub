public class LinkedList {
    Node head;
    Node tail;
    int size;
    LinkedList(){
        this.size=0;

    }
    public void insertStart(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void insertSpecificPosition(int index,int value){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index==0){
            insertStart(value);
            return;
        }
        if(index==size){
            insertEnd(value);
            return;
        }

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node newnode=new Node(value,temp.next);
        temp.next=newnode;
        size++;
    }
    public void insertEnd(int value){
        if(tail==null){
            insertStart(value);
            return;
        }
        Node newnode=new Node(value);
        tail.next=newnode;
        tail=newnode;
        size++;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;

        }
        System.out.println(" END");
    }


    public Node getElement(int index) {
        if(index<0 || index>size){
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public  int getNode(int value){
        Node temp=head;
        int position=0;
        while(temp!=null){
            if(temp.value==value){
                return  position;
            }
            position++;
            temp=temp.next;
        }
        return -1;
    }
    public void add(int value){

        if(head==null){
            insertStart(value);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node= new Node(value);
        temp.next=node;
        tail=node;
        size++;


    }
    public int deleteFromStart(){

        int value= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }

        size--;
        return value;
    }
    public int deleteFromEnd(){
        if(size<1){
           return deleteFromStart();
        }
    Node node=getElement(size-2);
    int value=tail.value;
    tail=node;
    tail.next=null;
    size--;
    return value;

    }
    public int deleteFromSpecificIndex(int index){
        if (index < 0 || index > size) {
            System.out.println("Error");
            return -1; // važno
        }

        if(index==0){
            return deleteFromStart();
        }
        if(index==size-1){
           return deleteFromEnd();
        }
        Node prev=getElement(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return value;


    }
    public float average(){
        if(size==0){
            return 0;
        }
        Node temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.value;
            temp=temp.next;
        }
        return (sum)/size;

    }
    public int compareNodes(int index1,int index2){
        Node node1=getElement(index1);
        Node node2=getElement(index2);
        if (node1 == null || node2 == null) {
            System.out.println("One or both nodes not found.");
            return -2; //
        }
        else if(node1.value>node2.value){
            return index1;
        }
        else if(node2.value>node1.value){
            return index2;
        }
        else {
            System.out.println("Equal");
            return 1;
        }



    }
    public void displayGraterThan(int value){

        Node temp=head;
        while(temp!=null){
            if(temp.value>value){
                System.out.println(temp.value);
                temp=temp.next;
            }

        }
        System.out.println("END");
    }


    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;

        }
        Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
