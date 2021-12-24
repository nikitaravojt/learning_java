package learning_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class String_Parser {

    public static void main(String[] args) {
        Scanner parser_sc = new Scanner(System.in).useDelimiter("\n"); // construct new scanner, take spaces into account
        System.out.print("Input a string to parse: ");
        String input = (String) parser_sc.next(); // store input (str)

        parser(input);
    }

    public static void parser(String input) {
        Map strMap = new HashMap(); // map (dict) storing each char in input str as a key, and the number of times the char appears as the value
        for (char character : input.toCharArray()) { // for char in list(input)
            if (strMap.containsKey(character)) {
                int old_value = (int) strMap.get(character); // typecast value associated w/ key 'character', store it as old_value
                strMap.put(character, old_value + 1);
            } else {
                strMap.put(character, 1);
            }
        }
        System.out.println("String composition: "+strMap);
    }
}
