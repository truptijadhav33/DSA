// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class A_basicArraylist {
    public static void swapList(ArrayList<Integer> list, int idx1, int idx2) {
        Integer temp = (Integer) list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding elements O(1)
        list.add(10);
        list.add(12);
        list.add(6);
        list.add(4);
        list.add(5);

        // getting elements O(1)
        // System.out.println("Element at 2nd index: " + list.get(2));//3
        // printing list , size() == return size(length) of list

        // System.out.println(list); //without loop
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        // setting element O(n)
        // list.set(2, 8);
        // System.out.println(list);

        // sorting arraylist
        // Collections.sort(list); // ascending order
        // System.out.println(list);

        // Collections.sort(list,Collections.reverseOrder()); // descending order
        // reverseOrder is comparator
        // System.out.println(list);

        // list contains an element
        // System.out.println(list.contains(12));

        // swapping two elements of list
        // swapList(list, 1, 3); // [10, 4, 6, 12, 5]
        // System.out.println(list);

        // remove element from list
        // list.remove(2);//[10, 12, 4, 5]
        // System.out.println(list);
    }
}