package org.practice;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String inputParentheses = ")()())";
        System.out.println("Longest Valid Parentheses: " + longestValidParentheses(inputParentheses));
    }

    private static int longestValidParentheses(String inputParentheses) {
        Stack<Integer> parenStack=new Stack<>();
        parenStack.push(-1);
        int maxLen=0;

        for(int i=0;i<inputParentheses.length();i++){
            char paren=inputParentheses.charAt(i);
            if(paren=='('){
                parenStack.push(i);
            }else{
                parenStack.pop();
                if(parenStack.isEmpty()){
                    parenStack.push(i);
                }else{
                    maxLen=Math.max(maxLen,i-parenStack.peek());
                }
            }
        }

        return maxLen;
    }
}
