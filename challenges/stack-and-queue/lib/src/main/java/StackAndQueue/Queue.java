package StackAndQueue;

public class Queue<T> {

    Node<T> front;
    Node<T> rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(T value){
        Node<T> node = new Node<>(value);

        if(isEmpty()){
           front= node;
        }else{
            rear.setNext(node);
        }

        rear= node;
    }

    public T dequeue() throws Exception {
        T value;
        if(isEmpty()){
            throw new Exception("Empty");
        }else{
            value = front.getValue();
            front = front.getNext();
        }
        return value;
    }

    public T peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty");
        }else{
            return front.getValue();
        }
    }

    public boolean isEmpty(){
       return front==null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
