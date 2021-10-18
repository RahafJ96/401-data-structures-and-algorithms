package StackAndQueue;

public class PseudoQueue {
    Stack firstStack = new Stack();
    Stack secondStack = new Stack();

    public String enqueue (String data){
        while (!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }

        firstStack.push(data);

        while (!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }
        return data;
    }

    public String dequeue(){
        if (firstStack.isEmpty()){
            System.out.println("Stack empty");
        }
        String data = firstStack.peek();
        firstStack.pop();
        return data;
    }
}