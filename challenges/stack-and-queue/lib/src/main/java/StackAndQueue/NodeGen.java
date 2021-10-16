package StackAndQueue;

public class NodeGen<T> {
    private T data;
    private NodeGen<T> next;

    public NodeGen(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeGen<T> getNext() {
        return next;
    }

    public void setNext(NodeGen<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGen{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
