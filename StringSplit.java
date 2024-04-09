package gr.aueb.cf.ch7;

/*
* Διασπά το String σε επιμέρους substrings(tokens) και επιστρέφει ένα
* πίνακα των επιμερούς tokems
*
* Αναλύει με το parse και διαχωρίζει με το split
*
* */


public class StringSplit {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        String[] tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }

}
