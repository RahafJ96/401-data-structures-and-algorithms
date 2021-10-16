package StackAndQueue;

public class Stack<T> {
    private Node<T>top;

    public Stack() {
        top=null;
    }

    public Node<T> getTop() {
        return top;
    }
    public void push(T data){
        Node<T> node=new Node<T>(data);
        if(!isEmpty()){
            node.setNext(top);
        }
        top=node;

    }

    public T pop() throws Exception {
        T data;
        if(isEmpty())
            throw new Exception("Empty");
        else{
            data = top.getData();
            top = top.getNext();
        }
        return data;
    }
    public T peek() throws Exception {
        if(isEmpty())
            throw new Exception("Empty");
        else
            return top.getData();
    }
    public boolean isEmpty(){
        return top==null;
    }
}