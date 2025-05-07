import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Merge merge=new Merge();
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2= Arrays.asList(3,5,6,8);
        List<Integer> list3= merge.merge(list,list2);
        System.out.println(list3);
    }
}