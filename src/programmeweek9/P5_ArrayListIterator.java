package programmeweek9;

/* Write a Java program to iterate through all elements in an array list using Iterator.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P5_ArrayListIterator {
    public static void main(String[] args) {
        //initializing ArrayList
        ArrayList<Integer> odd = new ArrayList<Integer>();

        //Add Odd numbers to the list
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        odd.add(11);
        odd.add(13);
        odd.add(15);
        odd.add(17);

        //Looping ArrayList using Iterator
        Iterator it = odd.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

    }
}