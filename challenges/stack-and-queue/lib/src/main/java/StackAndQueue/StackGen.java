package StackAndQueue;

public class StackGen<T> {
    private NodeGen<T> top;

    public StackGen() {

    }
    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data) {
        if (isEmpty()) {
            NodeGen<T> newNode = new NodeGen<T>(data);
            top = newNode;
        } else {
            NodeGen<T> newNode = new NodeGen<T>(data);
            newNode.setNext(top);
            top = newNode;

        }
    }
    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        } else {
            T data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public T peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        } else {
            return top.getData();
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
