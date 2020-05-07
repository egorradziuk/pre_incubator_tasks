package fourthTask.module1;

import java.util.Scanner;

public class FourthTask1 {

    final static private char[] array = {'[',']','{','}','<','>','(',')'};

    public static void main(String[] args) {
        someMethod();
    }

    public static void someMethod() {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean isNotCorrect = true;

        while(isNotCorrect) {
            System.out.println("Input a string which includes different " +
                    "brackets: ");
            str = scanner.next();
            try {
                isNotCorrect(array, str);
                isNotCorrect = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Your string is correct.");
    }

    public static void isNotCorrect(char[] array, String str) throws
            MyException {
        int previousIndex = -1;
        int currentIndex = 0;

        for(char c : array) {
            currentIndex = str.indexOf(c);

            if (previousIndex < currentIndex) {
                previousIndex = currentIndex;
            } else {
                throw new MyException(c);
            }
        }
    }
}
