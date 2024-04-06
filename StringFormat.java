package gr.aueb.cf.ch7;


/*
* Μορφοποιεί σε stirng ένα char και ένα string
* */

public class StringFormat {

    public static void main(String[] args) {
        char ch = 'Α';
        int a = 3;

        String s1 = String.format("%s%02d", ch, a);
        System.out.println(s1);
    }

}
