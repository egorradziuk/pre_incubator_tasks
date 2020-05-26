package firstTask;

import java.util.*;
import java.util.stream.Collectors;

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
            List<Character> list = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());
            list = list.stream().filter(
                s -> listOpenBrackets.contains(String.valueOf(s))
                  || listCloseBrackets.contains(String.valueOf(s)))
            .collect(Collectors.toList());
            System.out.println("list<Character> " + list);
            isCorrect = isCorrect(str, listOpenBrackets, listCloseBrackets,
                    map);
        }
        scanner.close();
        System.out.println("Your string is correct.");
    }

    public static boolean isCorrect(String str, List<String> listOB,
                             List<String> listCB, Map<String, String> map) {
        ArrayDeque<String> adq = new ArrayDeque<>();

        for(char c : str.toCharArray()){
            String symbol = String.valueOf(c);
            if (listOB.contains(symbol)) {
                adq.addLast(symbol);
            } else if (listCB.contains(symbol)) {
                if (adq.isEmpty() || !adq.pollLast().equals(map.get(symbol))) {
                    return false;
                }
            }
        }
        return adq.isEmpty();
    }

}


