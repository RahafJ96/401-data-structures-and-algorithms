package StackAndQueue;

public class Queue<T> {

    public int size;
    private Node<T> front;
    private Node<T> back;

    public Queue() {
        front = back = null;
    }

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty())
            front = node;
        else {
            back.setNext(node);
        }
        back = node;
        size++;
    }

    public T dequeue() throws Exception {
        T data;
        if(isEmpty())
            throw new Exception("Can't remove from empty Queue!");
        else{
            data = front.getData();
            front = front.getNext();
        }
        size --;
        return data;

    }

    public T peek() throws Exception {
        if(isEmpty())
            throw new Exception("Can't peek empty Queue!");
        else
            return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }

}