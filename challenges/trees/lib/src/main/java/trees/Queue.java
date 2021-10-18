package trees;

public class Queue<T> {
    Node<T> fornt;
    Node<T> rear;

    public void enqueue(Node<T> node) {
        if (fornt == null) {
            fornt = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }

    public T dequeue() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            T rem = this.fornt.data;
            Node<T> temp = this.fornt;
            this.fornt = this.fornt.next;
            temp.next = null;
            return rem;
        }
    }

    public T peek() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return fornt.data;
        }
    }

    public boolean isEmpty() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        return false;
    }

}
