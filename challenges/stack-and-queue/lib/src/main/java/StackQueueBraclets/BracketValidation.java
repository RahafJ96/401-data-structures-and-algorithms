package StackQueueBraclets;

import StackAndQueue.Stack;

public class BracketValidation {
    public boolean validateBrackets(String string) throws Exception {

        Stack<Character> stack = new Stack<>();

        char[] array = string.toCharArray();

        for (char chr : array) {
            if ("(){}[]".contains("" + chr)){
                if ("({[".contains("" + chr)){
                    stack.push(chr);
                }else {
                    if ((chr != ')' || !stack.peek().equals("(")) && (chr != ']' || !stack.peek().equals("["))) {
                        if (chr == '}') {
                            stack.peek();
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
