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
        StringBuilder sb = new StringBuilder();
        String result = "";
        long timeStart, timeEnd;
        double stringConcatTime, stringBuilderConcatTime;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=50_000; i++){
            result = result + i;
        }

        timeEnd = System.currentTimeMillis();
        stringConcatTime = (double) (timeEnd - timeStart) / 1000;

        timeStart = System.nanoTime();
        stringBuilderConcatTime = (double) (timeEnd - timeStart) / 1_000_000;

        System.out.println("Concatenation: String vs StringBuilder time in sec");
        System.out.println(stringConcatTime + " sec vs " + stringBuilderConcatTime + " sec");



    }
}
