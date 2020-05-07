package firstTask;

import java.util.Scanner;

public class FirstTask {

    final static private char[] array = {'[',']','{','}','<','>','(',')'};
    //static Validator validator = new Validator();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean isNotCorrect = true;

        while(isNotCorrect) {
            System.out.println("Input something: ");
            str = scanner.next();
            isNotCorrect = isNotCorrect(array, str);
        }
        scanner.close();
        System.out.println("Your string is correct.");
    }

    public static boolean isNotCorrect(char[] array, String str) {
        int prerviousIndex = -1;
        int currentIndex = 0;

        for(char c : array) {

            currentIndex = str.indexOf(c);

            if (prerviousIndex < currentIndex) {
                prerviousIndex = currentIndex;
            } else {
                System.out.println("It's wrong! Try again.");
                return true;
            }
        }
        return false;
    }
}
