package LinkedList;

public class Node {

     Node next;
    String data;
    // Node start;
    public Node (String data){
        this.data= data;
    }

    public String getData(){
        return data;
    }

    public  void setNext (Node next){
        this.next = next ;
    }

    public Node getNext(){ return next;}

}
