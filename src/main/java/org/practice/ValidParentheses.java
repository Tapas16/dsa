package org.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String inputParentheses = "([])";
        System.out.println("Valid Parentheses: " + validParentheses(inputParentheses));
    }

    private static boolean validParentheses(String inputParentheses) {
        Map<Character, Character> parenMap = new HashMap<>();
        parenMap.put('(', ')');
        parenMap.put('{', '}');
        parenMap.put('[', ']');

        Stack<Character> parenStack = new Stack<>();

        for (char paren : inputParentheses.toCharArray()) {
            if (parenMap.containsKey(paren)) {
                parenStack.push(paren); // Opening bracket
            } else {
                if (parenStack.isEmpty()) return false;
                char open = parenStack.pop();
                if (parenMap.get(open) != paren) return false; // Mismatch
            }
        }
        return parenStack.isEmpty(); // If anything left in stack, it's invalid
    }
}
