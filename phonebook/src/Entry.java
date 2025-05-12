public class Entry implements Comparable<Entry> {
    private String lastname;
    private String phonenumber;

    public Entry(String lastname, String phonenumber) {
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public int compareTo(Entry other) {
        return this.lastname.compareToIgnoreCase(other.lastname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Entry entry = (Entry) obj;
        return lastname.equalsIgnoreCase(entry.lastname) &&
                phonenumber.equals(entry.phonenumber);
    }

    @Override
    public int hashCode() {
        return lastname.toLowerCase().hashCode() + phonenumber.hashCode();
    }

    @Override
    public String toString() {
        return lastname;
    }
}
