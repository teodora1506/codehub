import java.util.ArrayList;
import java.util.List;

public class Merge {


    public List<Integer> merge(List<Integer> list1, List <Integer> list2) {

        List<Integer> list3 = new ArrayList<Integer>();

        int left = 0;
        int right = 0;

        while (left < list1.size() && right < list2.size()) {
            if (list1.get(left) < list2.get(right)) {

                list3.add(list1.get(left));
                left++;
            } else {
                list3.add(list2.get(right));
                right++;
            }

        }
        while (left < list1.size()) {
            list3.add(list1.get(left));
            left++;

        }

        while (right < list2.size()) {
            list3.add(list2.get(right));
            right++;

        }
        return  list3;
    }
}
