public class Main {

        public static void main(String[] args) {
          /*  LinkedList list = new LinkedList();
            System.out.println("Test case 1: add(45); add(2); add(2); add(4); add(58)");
            list.insertStart(45);
            list.add(2);
            list.add(2);
            list.add(4);
            list.add(58);
            list.display(); // Expected: (45,2,2,4,58)

            System.out.println("\nTest case 2: add(45); add(5)");
            list = new LinkedList(); // Reset
            list.add(45);
            list.add(5);
            list.display(); // Expected: (45,5)

            System.out.println("\nTest case 3: empty list");
            list = new LinkedList(); // Reset
            list.display(); // Expected: "List is empty"

            System.out.println("\nTest case 1: Add at position");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.insertSpecificPosition(2, 6); // Expected: (5, 3, 6, 2, 1)
            list.display();

            System.out.println("\nTest case 2: Add at position 0");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.insertSpecificPosition(0, 6); // Expected: (6, 5, 3, 2, 1)
            list.display();

            System.out.println("\nTest case 3: Add at position to empty list");
            list = new LinkedList();
            list.insertSpecificPosition(0, 6); // Expected: (6)
            list.display();

            System.out.println("\nTest case 4: Multiple insertions at 0");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.insertSpecificPosition(0, 23);
            list.display(); // Expected: (23, 5, 3, 2, 1)
            list.insertSpecificPosition(0, 6);
            list.display(); // Expected: (6, 23, 5, 3, 2, 1)

            System.out.println("\nTest case: Remove from position 0");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.deleteFromSpecificIndex(0); // Expected: (3, 2, 1)
            list.display();

            System.out.println("\nTest case: Remove from position 2");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.deleteFromSpecificIndex(2); // Expected: (5, 3, 1)
            list.display();

            System.out.println("\nTest case: Remove from invalid position");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.deleteFromSpecificIndex(12); // Expected: Error
            list.display();

            System.out.println("\nTest case: Chained removal");
            list = new LinkedList();
            list.add(5); list.add(3); list.add(2); list.add(1);
            list.deleteFromSpecificIndex(0); // (3, 2, 1)
            list.display();
            list.deleteFromSpecificIndex(1); // (3, 1)
            list.display();

            System.out.println("\nTest case: Average value");
            list = new LinkedList();
            list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
            list.display();
            System.out.println("Average: " + list.average()); // Expected: 3.0

            System.out.println("\nTest case: Search for node");
            System.out.println(list.getNode(3)); // Expected: 3rd position
            System.out.println(list.getNode(-11)); // Expected: Doesn't exist

            list.insertSpecificPosition(1, 6);
            System.out.println(list.getNode(2)); // Expected: 3rd position now

            System.out.println("\nTest case: Compare elements");
            System.out.println(list.compareNodes(2, 3)); // Second greater
            System.out.println(list.compareNodes(3, 2)); // First greater
            System.out.println(list.compareNodes(3, 3)); // Equal
            System.out.println(list.compareNodes(3, 33)); // One doesn't exist

            list.add(6);
            System.out.println(list.compareNodes(6, 5)); // First greater

            System.out.println("\nTest case: Greater than given value");
            list = new LinkedList();
            list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
            list.displayGraterThan(3); // 4, 5

            list.displayGraterThan(33); // Doesn't exist

            list = new LinkedList();
            list.add(4); list.add(3); list.add(1); list.add(2); list.add(5);
            list.displayGraterThan(3); // 4, 5

            list = new LinkedList();
            list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
            list.displayGraterThan(3);
            list.insertSpecificPosition(4, 6);
            list.displayGraterThan(3);

            System.out.println("\nTest case: Sort list");*/
            SortedLinkedList sortedList = new SortedLinkedList();
            sortedList.insertEnd(2);
            sortedList.insertEnd(4);
            sortedList.insertEnd(3);
            sortedList.insertEnd(1);
            sortedList.insertEnd(5);
            sortedList.sort();
            sortedList.display();

            sortedList.insertSpecificPosition(0, 6);

            sortedList.display();
            sortedList.sort();

            sortedList.insertSpecificPosition(0, 6);
            sortedList.display();
            sortedList.insertSpecificPosition(1, 7);
            sortedList.sort();
            sortedList.display();
        }
    }



