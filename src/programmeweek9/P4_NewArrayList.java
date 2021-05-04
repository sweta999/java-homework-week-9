package programmeweek9;

/* Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */

import java.util.ArrayList;

public class P4_NewArrayList {

    public static void main(String[] args) {
        //Create an ArrayList which is going to
        //contain a list of colours
        ArrayList<String> colours = new ArrayList<String>();

        //Add Colours to the list
        colours.add("Violet");
        colours.add("Indigo");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");

        //print colours of the rainbow
        System.out.println("Rainbow Colours: ");

        //forEach method of ArrayList and print the colour names
        colours.forEach((col) -> print(col));
    }

        //printing rainbow colours
        public static void print(String col){
            System.out.println("This is a Rainbow Colour: "+col);
        }

    }


    //ForEach method for String Array.
//String[] arrColours = {"Violet","Indigo","Blue", "Green","Yellow", "Orange","Red" };
//        System.out.println("\nUsing Foreach loop:");
//        //The optimized method of using the for loop - also called the foreach loop
//        for (String strTemp : arrColours) {
//            System.out.println(strTemp);