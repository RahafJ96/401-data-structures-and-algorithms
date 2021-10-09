package LinkedList;

public class Node {
     String data; // the data
     Node next;   // the reference

    public Node(String data) {this.data = data;}

    public String getData() { return data;}

    public Node getNext() {return next;}

    public void setNext(Node next) {this.next = next;}

}
