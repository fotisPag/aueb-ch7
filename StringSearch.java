package gr.aueb.cf.ch7;

import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Δώστε ένα αλφαριθμητικό");
        s = in.next();

        //Αναζητώ για τον χαρακτήρα Α
        System.out.printf("Ο χαρακτήρας A %s περιέχεται στο αλφαριθμητικό %s\n", (s.contains("Α")) ? "" : "δεν", s);
        System.out.printf("s", (s.contains("A")) ? (String.format("Θέση: %d", s.indexOf('A') + 1)) : "");
    }
}
