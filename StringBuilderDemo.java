package gr.aueb.cf.ch7;

/*
* Συγκρίνει τη συνένωση αλφαριθμητικών μεταξύ
* String και StringBuilder
*
* @author fotisPag
*
* */



public class StringBuilderDemo {
    public static void main(String[] args) {
        String Builder sb = new StringBuilder();
        String result = "";
        long timeStart, timeEnd;
        double stringConcatTime, stringBuilderConcatTime;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=50_000; i++){
            result = result + i;
        }



    }
}
