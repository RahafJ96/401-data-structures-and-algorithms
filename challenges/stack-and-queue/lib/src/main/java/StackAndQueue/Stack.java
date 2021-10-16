package StackAndQueue;

public class Stack<T> {

    private Node<T> top;

    public Stack(){
        top=null;
    }

    public Node<T> getTop() {
        return top;
    }

    public void push(T value){
        Node<T> node = new Node<T>(value);
        if (!isEmpty()){
            node.setNext(top);
        }
        top=node;
        System.out.println("The value " + value + " pushed to the Stack");
    }

    public T pop() throws Exception {
        T data;

        if(isEmpty()){
            throw new Exception("Empty");
        }else{
            data = top.getValue();
            top = top.getNext();
        }
        return data;
    }

    public T peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty");
        }else{
            return top.getValue();

        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
