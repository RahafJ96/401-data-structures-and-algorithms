package StackAndQueue;

public class Stack<T> {

    Node top;

    public void push(int value){
        Node newNode = new Node(value);
        if (top == null){
            top = newNode;
        }else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("The value " + value + " pushed to the Stack");
    }

    public int pop(){
        int popped=0;

        if(top == null){
            throw new IllegalArgumentException("Empty");
        }else{
            popped = top.getValue();
            top = top.next;
        }
        return popped;
    }

    public int peek(){
        if(top == null){
            throw new IllegalArgumentException("Empty");
        }else{
            return top.getValue();

        }
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String stackValue = "Stack { ";
        Node trav = top;
        while (trav != null){
            stackValue += trav.getValue() + " --> ";
            trav=trav.next;
        }
        stackValue += "NULL }";
        return stackValue;
    }
}
