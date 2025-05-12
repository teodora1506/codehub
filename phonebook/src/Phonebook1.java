import java.util.ArrayList;

public class Phonebook1 {


    ArrayList<ArrayList<String>> phonebook=new ArrayList<>();
    ArrayList<String> nameList=new ArrayList<>();
    ArrayList<String> numList=new ArrayList<>();

    //Adding method
    public void add(String name,String phone){
        nameList.add(name);
        numList.add(phone);
    }

    //insert method
    public void insert(int index,String name,String phone){
        try {
            nameList.add(index,name);
            numList.add(index,phone);

        }
        catch (IndexOutOfBoundsException b){
            System.out.println("There is no contact wwith that index");
        }
    }
    //deletion method
    public void delete(String d){
        for(int i=0;i<nameList.size();i++){
            if(d.equals(nameList.get(i))){
                nameList.remove(i);
                numList.remove(i);
            }
        }
    }
    //searching method
    public void search(String s) {
        try {
            for (int i = 0; i < nameList.size(); i++) {
                if (nameList.get(i).equals(s)) {
                    System.out.println(s + " contact found \nunder phone " + numList.get(i));
                }
            }
        }
        catch (IndexOutOfBoundsException b){
            System.out.println("contact is not found");
        }
    }
}
