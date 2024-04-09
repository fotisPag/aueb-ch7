package gr.aueb.cf.ch7;

import java.util.Scanner;

/*
* Αντιγράφει, συνενώνει και συγκρίνει δύο
* αλφαριθμητικά
*
* @author fotisPag*
* */

public class StringCopyConcatEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;

        System.out.println("Δώστε ένα αλφαριοθμητικό");
        s1 = in.next();

        //Αντιγραφή του s1->s2
        s2 = s1;

        //Συνένωση
        s2 = s1.concat(s2);

        //Σύγκριση
        if (s1.equals(s2)) {
            System.out.println("Τα δύο αλφαριθμητικά έχουν τα ίδια περιεχόμενα");
        } else {
            System.out.println("Τα δύο αλφαριθμητικά δεν έχουν τα ίδια περιεχόμενα");
        }

    }
}
