package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Apokriptografisi {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        final int KEY = 1;
        String phrase;
        char cipher;

        System.out.println("Δώστε ένα αλφαριθμητικό για αποκρυπτογράφηση");
        phrase = word.next();

        for (int i = 0; i < phrase.length(); i++){
            cipher = (char) (phrase.charAt(i) - KEY);
            System.out.print(cipher);
        }
    }
}
