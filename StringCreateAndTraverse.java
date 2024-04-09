package gr.aueb.cf.ch7;

/*
* Δημιουργεί και διασχίζει, δηλ. εκτυπώνει ένα-ένα
* τους χαρακτήρες ενός String
*
* @author fotisPag
* */

public class StringCreateAndTraverse {
    public static void main(String[] args) {
        String s = "AUEB";

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

}
