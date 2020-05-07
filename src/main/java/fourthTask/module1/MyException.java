package fourthTask.module1;

public class MyException extends Exception {

    MyException(char c) {
        super("MyException. This bracket '" + c + "' is in the wrong place.");
    }

}
