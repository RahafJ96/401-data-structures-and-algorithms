package StackAndQueue;

public class Queue<T> {

    Node front;
    Node rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if(this.rear == null){
            this.front = this.rear = newNode;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {

        if(this.front == null){
            throw new IllegalArgumentException("Empty");
        }else{
            Node temp = this.front;
            this.front = this.front.next;
            return temp.getValue();
        }
    }

    public int peek(){
        if(front == null){
            throw new IllegalArgumentException("Empty");
        }else{
            return front.getValue();
        }
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String queueValue = "Queue { ";
        Node trav = front;
        while (trav != null){
            queueValue += trav.getValue() + " --> ";
            trav = trav.next;
        }
        queueValue += "NULL }";
        return queueValue;
    }
}
