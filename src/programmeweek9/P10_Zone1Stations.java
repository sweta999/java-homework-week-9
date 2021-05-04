package programmeweek9;

/* Write the programme that tell you which line pass through particular stations.
 *  use Zone 1 stations name.
 */

import java.util.*;

public class P10_Zone1Stations {

    public static void main(String[] args) {
        char result;

        System.out.println("This is Zone 1 Station list : ");
        System.out.println("");
        System.out.println("ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO LU, TOWER HILL, OLD STREET,");
        System.out.println("SOUTH KENSINGTON, VICTORIA LU, LANCASTER GATE, GREEN PARK, FARRINGDON, EDGWARE ROAD,");
        System.out.println("QUEENSWAY, KINGS CROSS ST PANCRAS LU, VAUXHALL LU, EUSTON LU, BAYSWATER, ANGEL, PADDINGTON LU,");
        System.out.println("BAKERSTREET, KNIGHTBRIDGE, CHARING CROSS LU, GLOUCESTER ROAD, REGENTS PARK, HYDE PARK CORNER,");
        System.out.println("LEICESTER SQUARE, LONDON BRIDGE LU, PICCADILLY CIRCUS, MOORGATE, ST PAUL'S, WESTMINSTER, HOLBORN,");
        System.out.println("COVENT GARDEN, BOND STREET, MARBLE ARCH, TOTTENHAM COURT ROAD, RUSSELL SQUARE,");

        System.out.println("");

        HashMap<String, String> zone = new HashMap<String, String>();
        zone.put("ALDGATE", "Circle/Metropolitan");
        zone.put("ANGEL", "Northern");
        zone.put("BAKERSTREET", "Bakerloo/Circle/Hammersmith & City/Jubilee/Metropolitan");
        zone.put("BAYSWATER", "Circle/District");
        zone.put("BOND STREET", "Circle/Jubilee");
        zone.put("CHARING CROSS LU", "Northern/Bakerloo");
        zone.put("COVENT GARDEN", "Piccadilly");
        zone.put("EDGWARE ROAD", "Circle/District/Hammersmith & City");
        zone.put("EUSTON LU", "Victoria/Northern");
        zone.put("EUSTON SQUARE", "Metropolitan/Hammersmith & City/Circle");
        zone.put("FARRINGDON", "Circle/Hammersmith & City/Metropolitan");
        zone.put("GLOUCESTER ROAD", "District/Circle/Piccadilly");
        zone.put("GREEN PARK", "Jubilee/Piccadilly/Victoria");
        zone.put("HOLBORN", "Central/Piccadilly");
        zone.put("HYDE PARK CORNER", "Piccadilly");
        zone.put("KINGS CROSS ST PANCRAS LU", "Circle/Piccadilly/Hammersmith & City/Northern/Metropolitan/Victoria");
        zone.put("KNIGHTBRIDGE", "Piccadilly");
        zone.put("LANCASTER GATE", "Central");
        zone.put("LEICESTER SQUARE", "Northern/Piccadilly");
        zone.put("LONDON BRIDGE LU", "Northern/Jubilee");
        zone.put("MARBLE ARCH", "Central");
        zone.put("MOORGATE", "Circle/Hammersmith & City/Metropolitan/Northern");
        zone.put("OLD STREET", "Northern");
        zone.put("OXFORD CIRCUS", "Bakerloo/Central/Victoria");
        zone.put("PADDINGTON LU", "Hammersmith & City/Bakerloo/District/Circle");
        zone.put("PICCADILLY CIRCUS", "Piccadilly/Bakerloo");
        zone.put("QUEENSWAY", "Central");
        zone.put("REGENTS PARK", "Bakerloo");
        zone.put("RUSSELL SQUARE", "Piccadilly");
        zone.put("SOUTH KENSINGTON", "District/Circle/Piccadilly");
        zone.put("ST PAUL'S", "Central");
        zone.put("TOTTENHAM COURT ROAD", "Central/Northern");
        zone.put("TOWER HILL", "District/Circle");
        zone.put("VAUXHALL LU", "Victoria");
        zone.put("VICTORIA LU", "District/Circle");
        zone.put("WATERLOO LU", "Bakerloo/Jubilee/Northern");
        zone.put("WESTMINSTER", "Circle/District/Jubilee");

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any station name from above list : \t");

            String name1 = input.nextLine();
            name1 = name1.toUpperCase();

            for (String i : zone.keySet()) {
                if (name1.equals(i)) {
                    System.out.println("Tube Lines Available  : " + zone.get(i));
                }
            }
            System.out.println("Do you want to try again : 'Y' or 'N' ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }


}
