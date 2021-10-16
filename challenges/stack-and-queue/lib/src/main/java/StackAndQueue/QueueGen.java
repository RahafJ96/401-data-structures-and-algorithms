package StackAndQueue;

public class QueueGen<T> {
    private NodeGen<T> front;
    private NodeGen<T> rear;

    public QueueGen() {
    }

    public void enqueue(T data) {
        if (isEmpty()) {
            NodeGen<T> node = new NodeGen<T>(data);
            front = node;
            rear = node;
        } else {
            NodeGen<T> node1 = new NodeGen<T>(data);
            rear.setNext(node1);
            rear = node1;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            T data = front.getData();
            front = front.getNext();
            return data;
        }
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            return front.getData();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}
