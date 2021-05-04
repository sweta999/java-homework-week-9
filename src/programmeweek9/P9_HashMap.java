package programmeweek9;

/* Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
*/

import java.util.HashMap;
import java.util.Map;

public class P9_HashMap {

    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Sweta");
        people.put(2, "Sneha");
        people.put(3, "Surekha");
        people.put(4, "Vishal");
        people.put(5, "Manish");
        people.put(6, "Divyesh");

        for(int i : people.keySet())
        {
            System.out.println(i);
        }


    }

}
