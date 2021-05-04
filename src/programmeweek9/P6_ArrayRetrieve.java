package programmeweek9;

/* Write a Java program to retrieve an element (at a specified index) from a given array list
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6_ArrayRetrieve {
    public static void main(String[] args) {
        //initializing ArrayList
        ArrayList<Integer> even = new ArrayList<Integer>();

        //Add Even numbers to the list
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);
        even.add(12);
        even.add(14);
        even.add(16);

        //Retrieve an element from given array list
        System.out.println(even.get(7));




    }
}