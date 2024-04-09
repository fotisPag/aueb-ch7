package gr.aueb.cf.ch7;


/*
* Αντικαθιστά και διαγράφει ένα χαρακτήρα
* από ένα string
*
* @author fotisPag
*
* */
public class StringReplaceAndDelete {

    public static void main(String[] args) {

        String s = "Java - AUEB";

        s = s.replace("-", "&");
        System.out.println(s);

        s = s.replace("&", "");
        System.out.println(s);

    }
}
