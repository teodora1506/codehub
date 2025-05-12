import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

    Phonebook1 phone=new Phonebook1();
    phone.phonebook.add(phone.nameList);
    phone.phonebook.add(phone.numList);

    //Adding

        phone.add("teodora","12345");

        System.out.println(phone.phonebook);
        phone.search("teodora");

        System.out.println(phone.phonebook);

       // e1(lastname: Acab); e2(lastname: Aa); e3(lastname: Acaz); e4(Abba);

                PhoneBook phoneBook = new PhoneBook();

                Entry e1 = new Entry("Acab", "123");
                Entry e2 = new Entry("Aa", "456");
                Entry e3 = new Entry("Acaz", "789");
                Entry e4 = new Entry("Abba", "000");

                phoneBook.insert(e1);
                phoneBook.insert(e2);
                phoneBook.insert(e3);
                phoneBook.insert(e4);

                phoneBook.printAll(); // Prikazuje prezimena sortirana unutar sekcije
                // phoneBook.printAllSectionLetters(); // Samo slova sekcija


        Entry e5 = new Entry("Popic", "111");
        Entry e6 = new Entry("Ateljevic", "222");
        Entry e7 = new Entry("Zaric", "333");
        Entry e8 = new Entry("Jovic", "444");

        phoneBook.insert(e5);
        phoneBook.insert(e6);
        phoneBook.insert(e7);
        phoneBook.insert(e8);

        phoneBook.printAllSectionLetters(); // Samo A -> J -> P -> Z
            }
        }


        //Input:  insert(e1); insert(e2); insert(e3); insert(e4);
