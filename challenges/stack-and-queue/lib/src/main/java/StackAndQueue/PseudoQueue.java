package StackAndQueue;

public class PseudoQueue<T> {
    Stack stack1=new Stack();
    Stack stack2=new Stack();

    public  void enqueue(T data) throws Exception {

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public T dequeue() throws Exception {
        if (stack1.isEmpty()){
            System.out.println("Empty");
        }
        T x=(T) stack1.peek();
        stack1.pop();
        return x;


    }
}