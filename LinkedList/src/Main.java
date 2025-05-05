public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertStart(2);
        list.insertEnd(3);
        list.insertEnd(8);
        list.display();
        int position=list.getNode(8);
        System.out.println(position);
        double average= list.average();
        System.out.println(average);
        int pos= list.compareNodes(1,2);
        System.out.println(pos);
        SortedLinkedList list1 = new SortedLinkedList();
        list1.insertStart(2);
        int a=list1.deleteFromStart();
        System.out.println(a);
        list1.insertEnd(5);
        list1.insertStart(1);
        list1.insertEnd(2);
        list1.insertEnd(9);
        int b=list1.deleteFromEnd();


        System.out.println("Pre sortiranja:");
        list1.display();

        list1.sort();
        list1.display();


    }
}
