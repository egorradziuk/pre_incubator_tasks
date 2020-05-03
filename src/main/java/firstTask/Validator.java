package firstTask;

public class Validator {

    boolean isNotCorrect(char[] array, String str) {
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
