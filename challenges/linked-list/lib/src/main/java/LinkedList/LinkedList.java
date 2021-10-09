/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import java.util.Objects;

public class LinkedList{
    Node head;
    Node tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public void insert(String value) {
        Node newNode = new Node(value);

        if (size == 0) {
            head = newNode;
        } else {

            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);

        }
        size++;
    }

    public boolean includes(String value) {

        if (size != 0) {
            Node current = head;
            while (current != null) {
                if (Objects.equals(current.getData(), value)) {
                    return true;
                }
                current = current.getNext();
            }

        }

        return false;
    }

    // Append a new node at the end  (append)

    public void append(String new_data){
        Node new_node = new Node(new_data);
        if (head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
            last.next = new_node;
            return;
    }
    public void insertAfter(String ref,String data){


        Node current = head;
        while (current != null) {
            if (current.data==ref) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                break;

            }
            current = current.next;
        }
        if(current==null){
            insert(data);
        }
    }

    public void insertBefore(String ref,String data){
        //Node current= insertBeforeNode.start;
        if(head !=null){
            if(ref== head.data){
                Node insertBeforeNode=new Node(data);
                insertBeforeNode.next = head;
                head = insertBeforeNode;

            }
            else {
                Node current = head;
                Node previousNode = current;
                while (current != null) {
                    if (ref == current.data) {
                        Node newNode = new Node(data);
                        newNode.next = current;
                        previousNode.next = newNode;
                        break;

                    }
                    previousNode = current;
                    current = current.next;
                }
            }
        }
        else{
            System.out.println("the list is empty");
        }
    }
    public String kthFromEnd(int k){
        if(size == 0)
            return "The List is Empty";
        if(k > size - 1 || k < 0)
            return ("ERROR in the list");
        else{
            int numOfSteps = size - 1 - k;
            int counter = 0;
            Node current = head;

            while(counter < numOfSteps) {
                current = current.getNext();
                counter++;
            }

            return current.getData();
        }
    }
    public String zip(LinkedList list1, LinkedList list2) {
        LinkedList newList = new LinkedList();
        Node first = list1.head;
        Node second = list2.head;
        while (first != null || second != null) {
            if(second==null){
                newList.insert(first.data);
                first=first.next;
            }
            else if(first == null){
                newList.insert(second.data);
                second=second.next;
            }
            else{
                newList.insert(second.data);
                newList.insert(first.data);
                first=first.next;
                second=second.next;
            }

        }
        return newList.toString();
    }
    @Override
    public String toString() {
        StringBuilder stringPrint = new StringBuilder();
        if(size == 0){
            return "This List is Empty";
        }else{

            Node current = head;
            while (current != null){
                stringPrint.append("{ ").append(current.getData()).append(" }").append(" --> ");
                current = current.getNext();
            }
            stringPrint.append("NULL");
        }
        return stringPrint.toString();
    }

}