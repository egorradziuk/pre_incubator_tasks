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
        ArrayDeque<String> ad = new ArrayDeque<>();

        for(char c : str.toCharArray()){
            String symbol = String.valueOf(c);
            if (listOB.contains(symbol)) {
                ad.addLast(symbol);
            } else if (listCB.contains(symbol)) {
                if (ad.isEmpty() || !ad.pollLast().equals(map.get(symbol))) {
                    return false;
                }
            }
        }
        return ad.isEmpty();
    }

}
