package StackAndQueue;

public class Node<T>{
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}