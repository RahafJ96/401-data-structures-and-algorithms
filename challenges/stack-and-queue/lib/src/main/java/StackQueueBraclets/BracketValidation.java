package StackQueueBraclets;

import StackAndQueue.Stack;

public class BracketValidation<T> {
    public boolean validateBrackets(String bracket) throws Exception {

        Stack<String> stack = new Stack<>();
        String checkBracket;

        if (bracket.length()>1) {
            for (String str : bracket.split("")) {
                if (str.equals("[") || str.equals("{") || str.equals("(")) {
                    stack.push(str);
                } else {
                    checkBracket = stack.pop();
                    if (checkBracket.equals("[") && !str.equals("]")) {
                        return false;
                    } else if (checkBracket.equals("{") && !str.equals("}")) {
                        return false;
                    } else if (checkBracket.equals("(") && !str.equals(")")) {
                        return false;
                    }
                }
            }
            return true;
        }
        else
        { return  false;}
    }
}

