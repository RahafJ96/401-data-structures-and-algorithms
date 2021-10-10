package StackAndQueue;

public class Stack<T> {

    Node top;

    public void push(int value){
        Node newNode = new Node(value);
        if (top == null){
            top = newNode;
        }else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("The value " + value + " pushed to the Stack");
    }

    public int pop(){
<<<<<<< HEAD
=======

>>>>>>> 7a57f39867369397f36e448de111c0760a3c6c93
        int popped=0;

        if(top == null){
            throw new IllegalArgumentException("Empty");
        }else{
<<<<<<< HEAD
            popped = top.getValue();
=======
            popped = top.getData();
>>>>>>> 7a57f39867369397f36e448de111c0760a3c6c93
            top = top.next;
        }
        return popped;
    }

    public int peek(){
        if(top == null){
            throw new IllegalArgumentException("Empty");
        }else{
<<<<<<< HEAD
            return top.getValue();
=======
            return top.getData();
>>>>>>> 7a57f39867369397f36e448de111c0760a3c6c93
        }
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String stackValue = "Stack { ";
        Node trav = top;
        while (trav != null){
<<<<<<< HEAD
            stackValue += trav.getValue() + " --> ";
            trav=trav.next;
        }
        stackValue += "NULL }";
        return stackValue;
    }
=======
            stackValue += trav.getData() + " --> ";
            trav=trav.next;
        }
        stackValue += "Null }";
        return stackValue;
    }

>>>>>>> 7a57f39867369397f36e448de111c0760a3c6c93
}
