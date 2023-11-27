public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int resultsOfMyFirstMultiplication = multiplication(5, 5);
        System.out.println("results of my first multiplication: " + resultsOfMyFirstMultiplication);

        String resultOfConcat = conca("hello ", 10);
        System.out.println("result of my first concat: " + resultOfConcat);

        String[] inputArrayOne = {"uno", "due", "tre", "quattro", "cinque"};
        String nuovaStringa = "nuovaStringa";
        System.out.println("la mia stringa base è");
        for (int i = 0; i < inputArrayOne.length; i++) {
            System.out.println(inputArrayOne[i]);
        }

        String[] theOne = inserisciInArray(inputArrayOne, nuovaStringa);
        System.out.println("la mia stringa inserisciInArray è");
        for (int i = 0; i < theOne.length; i++) {
            System.out.println(theOne[i]);
        }
    }

    public static String[] inserisciInArray(String[] inputArrayOne, String nuovaStringa) {
        String[] newArray = new String[6];
        newArray[2] = nuovaStringa;
        newArray[3] = inputArrayOne[3];
        newArray[4] = inputArrayOne[4];
        newArray[0] = inputArrayOne[0];
        newArray[1] = inputArrayOne[1];
        newArray[5] = inputArrayOne[2];

        return newArray;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static String conca(String a, int b) {
        return a + b;
    }

}