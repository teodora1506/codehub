import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Section {
    private char letter;
    private List<Entry> entryList;

    public Section(char letter) {
        this.letter = letter;
        this.entryList = new ArrayList<>();
    }

    public char getChar() {
        return letter;
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public void insertEntry(Entry entry) {
        if (Character.toUpperCase(entry.getLastname().charAt(0)) != Character.toUpperCase(letter)) {
            throw new IllegalArgumentException("Last name does not match section letter: " + letter);
        }

        if (!entryList.contains(entry)) {
            entryList.add(entry);
            Collections.sort(entryList);
        }
    }

    public void deleteEntry(Entry entry) {
        entryList.remove(entry);
    }

    public boolean isEmpty() {
        return entryList.isEmpty();
    }

    public void printSection() {
        System.out.print(letter + " -> ");
        for (int i = 0; i < entryList.size(); i++) {
            System.out.print(entryList.get(i));
            if (i < entryList.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
