package firstTask;

import java.util.Scanner;

public class FirstTask {

    final static private char[] array = {'[',']','{','}','<','>','(',')'};
    static Validator validator = new Validator();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean isNotCorrect = true;

        while(isNotCorrect) {
            System.out.println("Input something: ");
            str = scanner.next();
            isNotCorrect = validator.isNotCorrect(array, str);
        }
        scanner.close();
    }

}
