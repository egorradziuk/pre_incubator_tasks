package firstTask;

import java.util.*;

public class FirstTask {

    final static private List<String> listOpenBrackets = new ArrayList<>
            (Arrays.asList("[","{","<","("));
    final static private List<String> listCloseBrackets = new ArrayList<>
            (Arrays.asList("]","}",">",")"));



    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>() {{
            put("]","[");
            put("}","{");
            put(">","<");
            put(")","(");
        }};

        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean isCorrect = false;

        while(!isCorrect) {
            System.out.println("Input something: ");
            str = scanner.nextLine();
            isCorrect = isCorrect(str, listOpenBrackets, listCloseBrackets,
                    map);
        }
        scanner.close();
        System.out.println("Your string is correct.");
    }

    public static boolean isCorrect(String str, List<String> listOB,
                             List<String> listCB, Map<String, String> map) {
        Stack stack = new Stack();

        for(char c : str.toCharArray()){
            String symbol = String.valueOf(c);
            if (listOB.contains(symbol)) {
                stack.push(symbol);
            } else if (listCB.contains(symbol)) {
                if (stack.empty() || !stack.pop().equals(map.get(symbol))) {
                    return false;
                }
            }
        }
        return isStackEmpty(stack);
    }

    public static boolean isStackEmpty (Stack stack) {
        return stack.empty();
    }

}
