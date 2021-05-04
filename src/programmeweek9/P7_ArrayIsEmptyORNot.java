package programmeweek9;

/* Write a Java program to test an array list is empty or not.
 * Define array list with  underground tube names
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7_ArrayIsEmptyORNot {

    public static void main(String[] args) {

        //initializing ArrayList
        ArrayList<String> tubenames = new ArrayList<String>();

        //Add underground tube names to the list
        tubenames.add("Bakerloo");
        tubenames.add("Central");
        tubenames.add("Circle");
        tubenames.add("District");
        tubenames.add("Jubilee");
        tubenames.add("Metropolitan");
        tubenames.add("Northern");
        tubenames.add("Piccadilly");
        tubenames.add("Victoria");

        //Checking array list is empty or not
        boolean ans = tubenames.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");



    }
}
