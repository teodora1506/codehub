public class PhoneBook {

    private class Node {
        Section section;
        Node next;

        Node(Section section) {
            this.section = section;
        }
    }

    private Node head;

    public PhoneBook() {
        for (char c = 'Z'; c >= 'A'; c--) {
            insertSectionAtBeginning(new Section(c));
        }
    }

    private void insertSectionAtBeginning(Section section) {
        Node node = new Node(section);
        node.next = head;
        head = node;
    }

    public void insert(Entry e) {
        char letter = Character.toUpperCase(e.getLastname().charAt(0));
        Node current = head;
        while (current != null) {
            if (current.section.getChar() == letter) {
                current.section.insertEntry(e);
                return;
            }
            current = current.next;
        }

        // Ako ne postoji sekcija, napravi je i ubaci na početak
        Section section = new Section(letter);
        section.insertEntry(e);
        insertSectionAtBeginning(section);
    }

    public void delete(Entry e) {
        char letter = Character.toUpperCase(e.getLastname().charAt(0));
        Node current = head;
        while (current != null) {
            if (current.section.getChar() == letter) {
                current.section.deleteEntry(e);
            }
            current = current.next;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            if (!current.section.isEmpty()) {
                current.section.printSection();
            }
            current = current.next;
        }
    }

    public void printAllSectionLetters() {
        Node current = head;
        boolean first = true;
        while (current != null) {
            if (!current.section.isEmpty()) {
                if (!first) System.out.print(" -> ");
                System.out.print(current.section.getChar());
                first = false;
            }
            current = current.next;
        }
        System.out.println();
    }
}
