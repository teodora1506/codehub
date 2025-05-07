public class  Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        System.out.println("== INSERT START & END ==");
        list.InsertStart(3);
        list.InsertEnd(5);
        list.InsertStart(2);
        list.InsertEnd(7);
        list.display(); // Expected: 2 3 5 7 END
       // DoubleLinkedList.Node node=list.getNode(10);

        System.out.println("== INSERT AT POSITION ==");
        list.Insert(4, 2); // Insert 4 at index 2
        list.display(); // Expected: 2 3 4 5 7 END

        System.out.println("== DELETE FROM START ==");
        list.deleteFromStart();
        list.display(); // Expected: 3 4 5 7 END

        System.out.println("== DELETE FROM END ==");
        list.deleteFromEnd();
        list.display(); // Expected: 3 4 5 END

        System.out.println("== DELETE AT INDEX 1 ==");
        list.delete(1); // Remove 4
        list.display(); // Expected: 3 5 END

        System.out.println("== AVERAGE ==");
        double avg = list.average();
        System.out.println("Average: " + avg); // Expected: 4.0

        System.out.println("== GET INDEX OF VALUE ==");
        int index = list.getIndex(5);
        System.out.println("Index of 5: " + index); // Expected: 1

        System.out.println("== COMPARE NODES (0 vs 1) ==");
        int maxIndex = list.compareNodes(0, 1);
        System.out.println("Greater node index: " + maxIndex); // Expected: 1

        System.out.println("== DISPLAY > 3 ==");
        list.displayGraterthan(3); // Expected: 5 END

        System.out.println("== ADDITIONAL INSERTIONS ==");
        list.InsertEnd(10);
        list.InsertEnd(12);
        list.InsertEnd(1);
        list.display(); // Expected: 3 5 10 12 1 END

        System.out.println("== DISPLAY > 6 ==");
        list.displayGraterthan(6); // Expected: 10 12 END
    }
}
