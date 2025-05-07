public class SortedLinkedList extends LinkedList {

    public void sort() {
        head = mergeSort(head);

        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Podela liste na pola
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null;

        // 2. Rekurzivno sortiranje obe polovine
        Node left = mergeSort(head);
        Node right = mergeSort(nextToMiddle);

        // 3. Spajanje sortiranih polovina
        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.value <= right.value) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if (left != null) tail.next = left;
        else tail.next = right;

        return dummy.next;
    }

    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
